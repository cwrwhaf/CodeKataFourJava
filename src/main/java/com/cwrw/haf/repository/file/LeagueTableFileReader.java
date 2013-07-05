package com.cwrw.haf.repository.file;



import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.cwrw.haf.dto.Team;


public class LeagueTableFileReader {
	
	File leagueTableFile = new File("football.dat");
	
	public static final int TEAM_NAME = 2;
    public static final int GAMES_PLAYED = 3;
    public static final int GAMES_WON = 4;
    public static final int GAMES_LOST = 5;
    public static final int GAMES_DRAWN = 6;
    public static final int GOALS_FOR = 7;
    public static final int GOALS_AGAINST = 9;
    public static final int POINTS = 10;
    
	public List<Team> readFile() {
		
		// if this were a production app i would need to synchronise on leagueTableFile
		List<Team> teams = new ArrayList<Team>();
		try {
			BufferedReader leagueTableIn = new BufferedReader(new FileReader(leagueTableFile));

			String leagueTableInStr;
			String[] leagueTableRow = new String[10];

			String temp;
			while ((leagueTableInStr = leagueTableIn.readLine()) != null) {

				// remove blank lines
				if (leagueTableInStr.length() > 0) {
					temp = leagueTableInStr.replaceAll("\\s+", ",");

					leagueTableRow = temp.split(",");

					// only get the values where the array is 11, ignore the
					// rest
					if (leagueTableRow.length == 11) {
						teams.add(createTeam(leagueTableRow));
					}
				}

			}

			leagueTableIn.close();
		} catch (IOException io) {
			io.printStackTrace();
		}

		return teams;
	}

	private Team createTeam(String[] leagueTableRow) {
		Team team = new Team();
		team.setName(leagueTableRow[TEAM_NAME]);
		team.setGamesPlayed(new Integer(leagueTableRow[GAMES_PLAYED]));
		team.setGamesWon(new Integer(leagueTableRow[GAMES_WON]));
		team.setGamesLost(new Integer(leagueTableRow[GAMES_LOST]));
		team.setGamesDrawn(new Integer(leagueTableRow[GAMES_DRAWN]));
		team.setGoalsScoredFor(new Integer(leagueTableRow[GOALS_FOR]));
		team.setGoalsScoredAgainst(new Integer(leagueTableRow[GOALS_AGAINST]));
		team.setTotalPoints(new Integer(leagueTableRow[POINTS]));
		team.setGoalDifference(Math.abs(new Integer(leagueTableRow[GOALS_FOR])
				- new Integer(leagueTableRow[GOALS_AGAINST])));
		return team;

	}

}