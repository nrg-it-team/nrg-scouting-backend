package com.nrgit;

import com.opencsv.bean.CsvBindByName;

// formatted in a way opencsv would like
public class ChargedUpFileData {
	@CsvBindByName
	String EventKey;
	@CsvBindByName
	String MatchLevel;
	@CsvBindByName
	Integer MatchNumber;
	@CsvBindByName
	String Team;
	@CsvBindByName
	String ScouterName;
	@CsvBindByName
	String StartingPosition;
	@CsvBindByName
	Boolean LeftCommunity;
	@CsvBindByName(column="Auto-TopCubes")
	Integer AutoTopCubes;
	@CsvBindByName(column="Auto-MidCubes")
	Integer AutoMidCubes;
	@CsvBindByName(column="Auto-LowCubes")
	Integer AutoLowCubes;
	@CsvBindByName(column="Auto-TopCones")
	Integer AutoTopCones;
	@CsvBindByName(column="Auto-MidCones")
	Integer AutoMidCones;
	@CsvBindByName(column="Auto-LowCones")
	Integer AutoLowCones;
	@CsvBindByName(column="Auto-ChargingStation")
	Integer AutoChargingStation;
	@CsvBindByName
	Integer Ground;
	@CsvBindByName
	Integer Sub1;
	@CsvBindByName
	Integer Sub2Low;
	@CsvBindByName
	Integer Sub2High;
	@CsvBindByName
	Integer TopCubes;
	@CsvBindByName
	Integer MidCubes;
	@CsvBindByName
	Integer LowCubes;
	@CsvBindByName
	Integer TopCones;
	@CsvBindByName
	Integer MidCones;
	@CsvBindByName
	Integer LowCones;
	@CsvBindByName
	Integer DefenseRating;
	@CsvBindByName
	Boolean Tipped;
	@CsvBindByName
	String EndLocation;
	@CsvBindByName
	Boolean FailedChargingStation;
	@CsvBindByName
	Integer RobotsOnChargeStation;
	@CsvBindByName
	String MechanicalFailures;
	@CsvBindByName
	String Comments;
	@CsvBindByName
	String ScoutedTime;
	@Override
	public String toString() {
		return "ChargedUpFileData [EventKey=" + EventKey + ", MatchLevel=" + MatchLevel + ", MatchNumber=" + MatchNumber
				+ ", Team=" + Team + ", ScouterName=" + ScouterName + ", StartingPosition=" + StartingPosition
				+ ", LeftCommunity=" + LeftCommunity + ", AutoTopCubes=" + AutoTopCubes + ", AutoMidCubes="
				+ AutoMidCubes + ", AutoLowCubes=" + AutoLowCubes + ", AutoTopCones=" + AutoTopCones + ", AutoMidCones="
				+ AutoMidCones + ", AutoLowCones=" + AutoLowCones + ", AutoChargingStation=" + AutoChargingStation
				+ ", Ground=" + Ground + ", Sub1=" + Sub1 + ", Sub2Low=" + Sub2Low + ", Sub2High=" + Sub2High
				+ ", TopCubes=" + TopCubes + ", MidCubes=" + MidCubes + ", LowCubes=" + LowCubes + ", TopCones="
				+ TopCones + ", MidCones=" + MidCones + ", LowCones=" + LowCones + ", DefenseRating=" + DefenseRating
				+ ", Tipped=" + Tipped + ", EndLocation=" + EndLocation + ", FailedChargeStation=" + FailedChargingStation
				+ ", RobotsOnChargeStation=" + RobotsOnChargeStation + ", MechanicalFailures=" + MechanicalFailures
				+ ", Comments=" + Comments + ", ScoutedTime=" + ScoutedTime + "]";
	}
}
