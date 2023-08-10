package com.nrgit;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvException;
import com.opencsv.exceptions.CsvException;

// check this out https://spring.io/guides/gs/uploading-files/
// @RestController refers to the C in MCV (model view controller)
@RestController
public class AppController {
	private ChargedUpRepository repository;
	public AppController(ChargedUpRepository repository) {
		this.repository = repository;
	}
	
	// refers to the HTTP method GET
	// temporary measure to upload files for testing purposes
	@GetMapping("/data/scouting2023")
	public String fileUploadSite() {
		return "<html><body><form action=\"/data/scouting2023\" method=\"post\" enctype=\"multipart/form-data\">"
				+ "<input type=\"file\" name=\"file\"/>"
				+ "<button type=\"submit\">Submit</button>"
				+ "</form></body></html>";
	}
	
	// refers to the HTTP method POST
	@PostMapping("/data/scouting2023")
	public ResponseEntity<String> fileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {
		if(file == null) return new ResponseEntity<String>("Error: must have a file.", HttpStatus.BAD_REQUEST);
		try {
			CsvToBean<ChargedUpFileData> csv = new CsvToBeanBuilder<ChargedUpFileData>(new InputStreamReader(file.getInputStream()))
				.withSeparator(',') // uses COMMA seperated values
				.withType(ChargedUpFileData.class) // converts it to a ChargedUpFileData type
				.build();
			List<ChargedUpData> data = csv.parse().stream().map((fileData) -> new ChargedUpData(fileData)).collect(Collectors.toList());
			for(ChargedUpData piece : data) {
				ChargedUpData fetched = repository.findByScouterNameAndScoutedTime(piece.getScouterName(), piece.getScoutedTime()).orElse(null);
				if(fetched != null) {
					if(fetched.equals(piece)) {
						continue; // theres a duplicate
					}
				}
				repository.save(piece);
			}
			if(data.size() == 0) {
				return new ResponseEntity<String>("Error: must have a file.", HttpStatus.BAD_REQUEST);
			}
		} catch (IllegalStateException e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error, IllegalStateException!", HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (IOException e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Error, IOException!", HttpStatus.INTERNAL_SERVER_ERROR);
		} catch (Exception e) {
			if(e instanceof CsvException) return new ResponseEntity<String>("Error in CSV.", HttpStatus.BAD_REQUEST);
			else {
				e.printStackTrace();
				return new ResponseEntity<String>("Error: " + e.getClass().getName(), HttpStatus.INTERNAL_SERVER_ERROR);
			}
		}
		return new ResponseEntity<String>("Success", HttpStatus.CREATED);
	}
}
