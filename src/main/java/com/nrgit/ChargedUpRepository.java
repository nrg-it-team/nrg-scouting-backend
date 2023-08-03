package com.nrgit;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

// just tells the program that this repository *exists* and automatically initializes it.
// to use, add as a parameter in the constructor of something like a @Controller
// read for method name explanation
// https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#repositories.query-methods
public interface ChargedUpRepository extends JpaRepository<ChargedUpData, Long> {
	Optional<ChargedUpData> findByScouterNameAndScoutedTime(String name, String time);
}
