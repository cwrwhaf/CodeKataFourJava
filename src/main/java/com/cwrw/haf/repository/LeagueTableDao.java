package com.cwrw.haf.repository;

import java.util.Collections;
import java.util.List;

import com.cwrw.haf.dto.Team;
import com.cwrw.haf.repository.file.LeagueTableFileReader;
import com.cwrw.haf.util.TeamLowestGoalDifferenceComparator;


public class LeagueTableDao implements LeagueTableRepository {

	LeagueTableFileReader fileReader;

	public LeagueTableDao() {
		fileReader = new LeagueTableFileReader();
	}

	@Override
	public List<Team> findAllTeams() {
		return fileReader.readFile();
	}

	@Override
	public Team findTeamWithSmallestGoalDifference() {
		List<Team> teams = findAllTeams();
		Collections.sort(teams, new TeamLowestGoalDifferenceComparator());
		return teams.get(0);
	}

}
