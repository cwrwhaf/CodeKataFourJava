package com.cwrw.haf.repository;

import java.util.List;

import com.cwrw.haf.dto.Team;


public interface LeagueTableRepository {

	public List<Team> findAllTeams();
	public Team findTeamWithSmallestGoalDifference();
}
