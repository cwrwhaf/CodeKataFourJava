package com.cwrw.haf.util;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.cwrw.haf.dto.Team;
import com.cwrw.haf.util.TeamLowestGoalDifferenceComparator;


public class TeamLowestGoalDifferenceComparatorTest {
	 private static final String TEAM_A = "Team A";
	    private static final String TEAM_B = "Team B";
	    private static final String TEAM_C = "Team C";
	    private static final String TEAM_D = "Team D";
	    private static final String TEAM_E = "Team E";
	    
	    private static final Integer ONE = new Integer("1");
	    private static final Integer TWO = new Integer("2");
	    private static final Integer THREE = new Integer("3");
	    private static final Integer FOUR = new Integer("4");
	    private static final Integer FIVE = new Integer("5");
	    
	    TeamLowestGoalDifferenceComparator comparator;
	    List<Team> resultsList;
	    @Before
	    public void setUp() throws Exception {
	        comparator = new TeamLowestGoalDifferenceComparator();
	        
	    }

	    @After
	    public void tearDown() throws Exception {
	        resultsList = null;
	    }

	    @Test
	    public void testOrdering() {
	        resultsList = createUnorderedResultsList();
	        Collections.sort(resultsList, comparator);
	        assertEquals("Team in wrong order: ", TEAM_A, resultsList.get(0).getName());
	        assertEquals("Team in wrong order: ", TEAM_B, resultsList.get(1).getName());
	        assertEquals("Team in wrong order: ", TEAM_C, resultsList.get(2).getName());
	        assertEquals("Team in wrong order: ", TEAM_D, resultsList.get(3).getName());
	        assertEquals("Team in wrong order: ", TEAM_E, resultsList.get(4).getName());
	    }

	    @Test
	    public void testOrderingDuplicateDifferences() {
	        resultsList = createDuplicateDifferecesResultsList();
	        Collections.sort(resultsList, comparator);
	        assertEquals("Team in wrong order: ", ONE, resultsList.get(0).getGoalDifference());
	        assertEquals("Team in wrong order: ", ONE, resultsList.get(1).getGoalDifference());
	        assertEquals("Team in wrong order: ", ONE, resultsList.get(2).getGoalDifference());
	        assertEquals("Team in wrong order: ", FOUR, resultsList.get(3).getGoalDifference());
	        assertEquals("Team in wrong order: ", FIVE, resultsList.get(4).getGoalDifference());
	    }
	    
	    private List<Team> createUnorderedResultsList(){
	        List<Team> results = new ArrayList<Team>();
	        results.add(createTeam(TEAM_A, 1));
	        results.add(createTeam(TEAM_C, 3));
	        results.add(createTeam(TEAM_E, 5));
	        results.add(createTeam(TEAM_B, 2));
	        results.add(createTeam(TEAM_D, 4));
	        return results;
	        
	    }
	    
	    private List<Team> createDuplicateDifferecesResultsList(){
	        List<Team> results = new ArrayList<Team>();
	        results.add(createTeam(TEAM_A, 1));
	        results.add(createTeam(TEAM_C, 1));
	        results.add(createTeam(TEAM_E, 5));
	        results.add(createTeam(TEAM_B, 1));
	        results.add(createTeam(TEAM_D, 4));
	        return results;
	        
	    }
	    
	    private Team createTeam(String teamName, Integer goalDifference){
	        Team team = new Team();
	        team.setName(teamName);
	        team.setGoalDifference(goalDifference);
	        
	        return team;
	        
	    }
	}
