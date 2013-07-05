package com.cwrw.haf.repository;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.cwrw.haf.dto.Team;
import com.cwrw.haf.repository.LeagueTableDao;


public class LeagueTableDaoIntegrationTest {

	@Test
	public void happyPathIntegrationTest() {
		LeagueTableDao leageTableDao = new LeagueTableDao();

		Team smallestGoalDifference = leageTableDao.findTeamWithSmallestGoalDifference();

		assertEquals("Expecting Aston Villa", "Aston_Villa", smallestGoalDifference.getName());
		assertEquals("Expecting 1", new Integer(1), smallestGoalDifference.getGoalDifference());
	
	}
}
