package com.cwrw.haf.dto;

public class Team {
	private String name;
    private Integer goalDifference;
    private Integer gamesPlayed;
    private Integer gamesWon;
    private Integer gamesLost;
    private Integer gamesDrawn;
    private Integer goalsScoredFor;
    private Integer goalsScoredAgainst;
    private Integer totalPoints;
    
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getGoalDifference() {
		return goalDifference;
	}
	public void setGoalDifference(Integer goalDifference) {
		this.goalDifference = goalDifference;
	}
	public Integer getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(Integer gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}
	public Integer getGamesWon() {
		return gamesWon;
	}
	public void setGamesWon(Integer gamesWon) {
		this.gamesWon = gamesWon;
	}
	public Integer getGamesLost() {
		return gamesLost;
	}
	public void setGamesLost(Integer gamesLost) {
		this.gamesLost = gamesLost;
	}
	public Integer getGamesDrawn() {
		return gamesDrawn;
	}
	public void setGamesDrawn(Integer gamesDrawn) {
		this.gamesDrawn = gamesDrawn;
	}
	public Integer getGoalsScoredFor() {
		return goalsScoredFor;
	}
	public void setGoalsScoredFor(Integer goalsScoredFor) {
		this.goalsScoredFor = goalsScoredFor;
	}
	public Integer getGoalsScoredAgainst() {
		return goalsScoredAgainst;
	}
	public void setGoalsScoredAgainst(Integer goalsScoredAgainst) {
		this.goalsScoredAgainst = goalsScoredAgainst;
	}
	public Integer getTotalPoints() {
		return totalPoints;
	}
	public void setTotalPoints(Integer totalPoints) {
		this.totalPoints = totalPoints;
	}
	@Override
	public String toString() {
		return "Team [name=" + name + ", goalDifference=" + goalDifference
				+ ", gamesPlayed=" + gamesPlayed + ", gamesWon=" + gamesWon
				+ ", gamesLost=" + gamesLost + ", gamesDrawn=" + gamesDrawn
				+ ", goalsScoredFor=" + goalsScoredFor
				+ ", goalsScoredAgainst=" + goalsScoredAgainst
				+ ", totalPoints=" + totalPoints + "]";
	}
}
