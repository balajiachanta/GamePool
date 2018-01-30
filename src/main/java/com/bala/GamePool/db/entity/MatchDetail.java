package com.bala.GamePool.db.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="matchdetails")
public class MatchDetail {
	
	@Id
	private long matchid;
	private String gamedetails;
	private String location;
	private String groundname;
	private int teamone;
	private int teamtwo;
	private LocalDate createdttm;
	private LocalDate updateddttm;
	private String matchdttm;
	
	public LocalDate getCreatedttm() {
		return createdttm;
	}
	public void setCreatedttm(LocalDate createdttm) {
		this.createdttm = createdttm;
	}
	public LocalDate getUpdateddttm() {
		return updateddttm;
	}
	public void setUpdateddttm(LocalDate updateddttm) {
		this.updateddttm = updateddttm;
	}
	public long getMatchid() {
		return matchid;
	}
	public void setMatchid(long matchid) {
		this.matchid = matchid;
	}
	public String getGamedetails() {
		return gamedetails;
	}
	public void setGamedetails(String gamedetails) {
		this.gamedetails = gamedetails;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getGroundname() {
		return groundname;
	}
	public void setGroundname(String groundname) {
		this.groundname = groundname;
	}
	public int getTeamone() {
		return teamone;
	}
	public void setTeamone(int teamone) {
		this.teamone = teamone;
	}
	public int getTeamtwo() {
		return teamtwo;
	}
	public void setTeamtwo(int teamtwo) {
		this.teamtwo = teamtwo;
	}
	public String getMatchdttm() {
		return matchdttm;
	}
	public void setMatchdttm(String matchdttm) {
		this.matchdttm = matchdttm;
	}
	
	
	
	
}
