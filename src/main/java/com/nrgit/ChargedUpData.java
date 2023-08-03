package com.nrgit;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class ChargedUpData {
	private @GeneratedValue @Id Long id; // generated automatically when put in database
	private String eventKey;
	private String matchLevel;
	private Integer matchNumber;
	private String team; // Red/Blue
	private Integer teamLocation;
	private Integer teamNumber;
	private String teamName;
	private String scouterName;
	private String startingPosition;
	private Boolean leftCommunity;
	private Integer autoTopCubes;
	private Integer autoMidCubes;
	private Integer autoLowCubes;
	private Integer autoCubes;
	private Integer autoTopCones;
	private Integer autoMidCones;
	private Integer autoLowCones;
	private Integer autoCones;
	private String autoChargingStation;
	private Integer ground;
	private Integer sub1;
	private Integer sub2Low;
	private Integer sub2High;
	private Integer topCubes;
	private Integer midCubes;
	private Integer lowCubes;
	private Integer teleCubes;
	private Integer topCones;
	private Integer midCones;
	private Integer lowCones;
	private Integer teleCones;
	private Integer defenseRating;
	private Boolean tipped;
	private String endLocation;
	private Boolean failedChargeStation;
	private Integer robotsOnChargeStation;
	private String mechanicalFailures;
	private String comments;
	private String scoutedTime;
	
	private static final String[] autoCharge = {"not attempted", "engaged", "docked", "failed"};
	
	public ChargedUpData() {}
	public ChargedUpData(ChargedUpFileData data) {
		eventKey = data.EventKey;
		matchLevel = data.MatchLevel;
		matchNumber = data.MatchNumber;
		String[] teamData = data.Team.split("\\,");
		if(teamData.length != 4) throw new RuntimeException("ChargedUpFileData invalid, Team field invalid");
		team = teamData[0];
		teamLocation = Integer.parseInt(teamData[1]);
		teamNumber = Integer.parseInt(teamData[2]);
		teamName = teamData[3];
		scouterName = data.ScouterName;
		startingPosition = data.StartingPosition;
		leftCommunity = data.LeftCommunity;
		autoTopCubes = data.AutoTopCubes;
		autoMidCubes = data.AutoMidCubes;
		autoLowCubes = data.AutoLowCubes;
		autoCubes = autoTopCubes + autoMidCubes + autoLowCubes;
		autoTopCones = data.AutoTopCones;
		autoMidCones = data.AutoMidCones;
		autoLowCones = data.AutoLowCones;
		autoCones = autoTopCones + autoMidCones + autoLowCones;
		autoChargingStation = autoCharge[data.AutoChargingStation];
		ground = data.Ground;
		sub1 = data.Sub1;
		sub2Low = data.Sub2Low;
		sub2High = data.Sub2High;
		topCubes = data.TopCubes;
		midCubes = data.MidCubes;
		lowCubes = data.LowCubes;
		teleCubes = topCubes + midCubes + lowCubes;
		topCones = data.TopCones;
		midCones = data.MidCones;
		lowCones = data.LowCones;
		teleCones = topCones + midCones + lowCones;
		defenseRating = data.DefenseRating;
		tipped = data.Tipped;
		endLocation = data.EndLocation;
		failedChargeStation = data.FailedChargingStation;
		robotsOnChargeStation = data.RobotsOnChargeStation;
		mechanicalFailures = data.MechanicalFailures;
		comments = data.Comments;
		scoutedTime = data.ScoutedTime;
	}
	
	public Long getId() {
		return id;
	}
	public String getEventKey() {
		return eventKey;
	}
	public String getMatchLevel() {
		return matchLevel;
	}
	public Integer getMatchNumber() {
		return matchNumber;
	}
	public String getTeam() {
		return team;
	}
	public Integer getTeamLocation() {
		return teamLocation;
	}
	public String getTeamName() {
		return teamName;
	}
	public String getScouterName() {
		return scouterName;
	}
	public String getStartingPosition() {
		return startingPosition;
	}
	public Boolean getLeftCommunity() {
		return leftCommunity;
	}
	public Integer getAutoTopCubes() {
		return autoTopCubes;
	}
	public Integer getAutoMidCubes() {
		return autoMidCubes;
	}
	public Integer getAutoLowCubes() {
		return autoLowCubes;
	}
	public Integer getAutoTopCones() {
		return autoTopCones;
	}
	public Integer getAutoMidCones() {
		return autoMidCones;
	}
	public Integer getAutoLowCones() {
		return autoLowCones;
	}
	public String getAutoChargingStation() {
		return autoChargingStation;
	}
	public Integer getGround() {
		return ground;
	}
	public Integer getSub1() {
		return sub1;
	}
	public Integer getSub2Low() {
		return sub2Low;
	}
	public Integer getSub2High() {
		return sub2High;
	}
	public Integer gettopCubes() {
		return topCubes;
	}
	public Integer getMidCubes() {
		return midCubes;
	}
	public Integer getLowCubes() {
		return lowCubes;
	}
	public Integer getTopCones() {
		return topCones;
	}
	public Integer getMidCones() {
		return midCones;
	}
	public Integer getLowCones() {
		return lowCones;
	}
	public Integer getDefenseRating() {
		return defenseRating;
	}
	public Boolean getTipped() {
		return tipped;
	}
	public String getEndLocation() {
		return endLocation;
	}
	public Boolean getFailedChargeStation() {
		return failedChargeStation;
	}
	public Integer getRobotsOnChargeStation() {
		return robotsOnChargeStation;
	}
	public String getMechanicalFailures() {
		return mechanicalFailures;
	}
	public String getComments() {
		return comments;
	}
	public String getScoutedTime() {
		return scoutedTime;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setEventKey(String eventKey) {
		this.eventKey = eventKey;
	}
	public void setMatchLevel(String matchLevel) {
		this.matchLevel = matchLevel;
	}
	public void setMatchNumber(Integer matchNumber) {
		this.matchNumber = matchNumber;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	public void setTeamLocation(Integer teamLocation) {
		this.teamLocation = teamLocation;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public void setScouterName(String scouterName) {
		this.scouterName = scouterName;
	}
	public void setStartingPosition(String startingPosition) {
		this.startingPosition = startingPosition;
	}
	public void setLeftCommunity(Boolean leftCommunity) {
		this.leftCommunity = leftCommunity;
	}
	public void setAutoTopCubes(Integer autoTopCubes) {
		this.autoTopCubes = autoTopCubes;
	}
	public void setAutoMidCubes(Integer autoMidCubes) {
		this.autoMidCubes = autoMidCubes;
	}
	public void setAutoLowCubes(Integer autoLowCubes) {
		this.autoLowCubes = autoLowCubes;
	}
	public void setAutoTopCones(Integer autoTopCones) {
		this.autoTopCones = autoTopCones;
	}
	public void setAutoMidCones(Integer autoMidCones) {
		this.autoMidCones = autoMidCones;
	}
	public void setAutoLowCones(Integer autoLowCones) {
		this.autoLowCones = autoLowCones;
	}
	public void setAutoChargingStation(String autoChargingStation) {
		this.autoChargingStation = autoChargingStation;
	}
	public void setGround(Integer ground) {
		this.ground = ground;
	}
	public void setSub1(Integer sub1) {
		this.sub1 = sub1;
	}
	public void setSub2Low(Integer sub2Low) {
		this.sub2Low = sub2Low;
	}
	public void setSub2High(Integer sub2High) {
		this.sub2High = sub2High;
	}
	public void settopCubes(Integer topCubes) {
		this.topCubes = topCubes;
	}
	public void setMidCubes(Integer midCubes) {
		this.midCubes = midCubes;
	}
	public void setLowCubes(Integer lowCubes) {
		this.lowCubes = lowCubes;
	}
	public void setTopCones(Integer topCones) {
		this.topCones = topCones;
	}
	public void setMidCones(Integer midCones) {
		this.midCones = midCones;
	}
	public void setLowCones(Integer lowCones) {
		this.lowCones = lowCones;
	}
	public void setDefenseRating(Integer defenseRating) {
		this.defenseRating = defenseRating;
	}
	public void setTipped(Boolean tipped) {
		this.tipped = tipped;
	}
	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}
	public void setFailedChargeStation(Boolean failedChargeStation) {
		this.failedChargeStation = failedChargeStation;
	}
	public void setRobotsOnChargeStation(Integer robotsOnChargeStation) {
		this.robotsOnChargeStation = robotsOnChargeStation;
	}
	public void setMechanicalFailures(String mechanicalFailures) {
		this.mechanicalFailures = mechanicalFailures;
	}
	public void setComments(String comments) {
		this.comments = comments;
	}
	public void setScoutedTime(String scoutedTime) {
		this.scoutedTime = scoutedTime;
	}
	public Integer getAutoCubes() {
		return autoCubes;
	}
	public void setAutoCubes(Integer autoCubes) {
		this.autoCubes = autoCubes;
	}
	public Integer getAutoCones() {
		return autoCones;
	}
	public void setAutoCones(Integer autoCones) {
		this.autoCones = autoCones;
	}
	public Integer getTeleCubes() {
		return teleCubes;
	}
	public void setTeleCubes(Integer teleCubes) {
		this.teleCubes = teleCubes;
	}
	public Integer getTeleCones() {
		return teleCones;
	}
	public void setTeleCones(Integer teleCones) {
		this.teleCones = teleCones;
	}
	@Override
	public int hashCode() {
		return Objects.hash(autoChargingStation, autoCones, autoCubes, autoLowCones, autoLowCubes, autoMidCones,
				autoMidCubes, autoTopCones, autoTopCubes, comments, defenseRating, endLocation, eventKey,
				failedChargeStation, ground, leftCommunity, lowCones, lowCubes, matchLevel, matchNumber,
				mechanicalFailures, midCones, midCubes, robotsOnChargeStation, scoutedTime, scouterName,
				startingPosition, sub1, sub2High, sub2Low, team, teamLocation, teamName, teleCones, teleCubes, tipped,
				topCones, topCubes);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ChargedUpData other = (ChargedUpData) obj;
		return Objects.equals(autoChargingStation, other.autoChargingStation)
				&& Objects.equals(autoCones, other.autoCones) && Objects.equals(autoCubes, other.autoCubes)
				&& Objects.equals(autoLowCones, other.autoLowCones) && Objects.equals(autoLowCubes, other.autoLowCubes)
				&& Objects.equals(autoMidCones, other.autoMidCones) && Objects.equals(autoMidCubes, other.autoMidCubes)
				&& Objects.equals(autoTopCones, other.autoTopCones) && Objects.equals(autoTopCubes, other.autoTopCubes)
				&& Objects.equals(comments, other.comments) && Objects.equals(defenseRating, other.defenseRating)
				&& Objects.equals(endLocation, other.endLocation) && Objects.equals(eventKey, other.eventKey)
				&& Objects.equals(failedChargeStation, other.failedChargeStation)
				&& Objects.equals(ground, other.ground) && Objects.equals(leftCommunity, other.leftCommunity)
				&& Objects.equals(lowCones, other.lowCones) && Objects.equals(lowCubes, other.lowCubes)
				&& Objects.equals(matchLevel, other.matchLevel) && Objects.equals(matchNumber, other.matchNumber)
				&& Objects.equals(mechanicalFailures, other.mechanicalFailures)
				&& Objects.equals(midCones, other.midCones) && Objects.equals(midCubes, other.midCubes)
				&& Objects.equals(robotsOnChargeStation, other.robotsOnChargeStation)
				&& Objects.equals(scoutedTime, other.scoutedTime) && Objects.equals(scouterName, other.scouterName)
				&& Objects.equals(startingPosition, other.startingPosition) && Objects.equals(sub1, other.sub1)
				&& Objects.equals(sub2High, other.sub2High) && Objects.equals(sub2Low, other.sub2Low)
				&& Objects.equals(team, other.team) && Objects.equals(teamLocation, other.teamLocation)
				&& Objects.equals(teamName, other.teamName) && Objects.equals(teleCones, other.teleCones)
				&& Objects.equals(teleCubes, other.teleCubes) && Objects.equals(tipped, other.tipped)
				&& Objects.equals(topCones, other.topCones) && Objects.equals(topCubes, other.topCubes);
	}
	public Integer getTeamNumber() {
		return teamNumber;
	}
	public void setTeamNumber(Integer teamNumber) {
		this.teamNumber = teamNumber;
	}
}
