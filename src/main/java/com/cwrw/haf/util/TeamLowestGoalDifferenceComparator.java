package com.cwrw.haf.util;

import java.util.Comparator;

import com.cwrw.haf.dto.Team;

public class TeamLowestGoalDifferenceComparator implements Comparator<Team> {

    public int compare(Team teamOne, Team teamTwo) {
        return teamOne.getGoalDifference().compareTo(teamTwo.getGoalDifference());
    }

}
