package com.cwrw.haf.kata;

import com.cwrw.haf.dto.Team;
import com.cwrw.haf.repository.LeagueTableRepository;

public class CodeKata {

	LeagueTableRepository repository;
	
	public CodeKata(LeagueTableRepository repository){
	this.repository = repository;	
	}
	
	public Team partTwo(){
		return repository.findTeamWithSmallestGoalDifference();
	}
}
