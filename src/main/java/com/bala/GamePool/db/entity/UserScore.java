package com.bala.GamePool.db.entity;

public class UserScore {

	
	private int tossscore;
	private int winnerscore;
	private int bonusscore;
	private int hsscore;
	private int momscore;
	
	public enum score{LOSS,WIN};
	
	public int getTossscore() {
		return tossscore;
	}
	public void setTossscore(int tossscore) {
		this.tossscore = tossscore;
	}
	public int getWinnerscore() {
		return winnerscore;
	}
	public void setWinnerscore(int winnerscore) {
		this.winnerscore = winnerscore;
	}
	public int getBonusscore() {
		return bonusscore;
	}
	public void setBonusscore(int bonusscore) {
		this.bonusscore = bonusscore;
	}
	public int getHsscore() {
		return hsscore;
	}
	public void setHsscore(int hsscore) {
		this.hsscore = hsscore;
	}
	public int getMomscore() {
		return momscore;
	}
	public void setMomscore(int momscore) {
		this.momscore = momscore;
	}

	
	
}
