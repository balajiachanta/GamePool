package com.bala.GamePool.db.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author Balaji Achanta
 */
@Document(collection="userpredictions")
public class UserPrediction {

	@Id
	private long predid;
	@NotEmpty
	private long userid;
	@NotEmpty
	private long matchid;
	@NotEmpty
	@Range(min=1,max=2)
	private int tosspred;
	@NotEmpty
	@Range(min=1,max=2)
	private int winnerpred;
	@NotEmpty
	@Range(min=1,max=5)
	private int bonusbet;
	@NotEmpty
	private int hspred;
	@NotEmpty
	private int mompred;
	
	private UserScore userscore;
	

	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public long getPredid() {
		return predid;
	}
	public void setPredid(long predid) {
		this.predid = predid;
	}
	public long getMatchid() {
		return matchid;
	}
	public void setMatchid(long matchid) {
		this.matchid = matchid;
	}
	public int getTosspred() {
		return tosspred;
	}
	public void setTosspred(int tosspred) {
		this.tosspred = tosspred;
	}
	public int getWinnerpred() {
		return winnerpred;
	}
	public void setWinnerpred(int winnerpred) {
		this.winnerpred = winnerpred;
	}
	public int getBonusbet() {
		return bonusbet;
	}
	public void setBonusbet(int bonusbet) {
		this.bonusbet = bonusbet;
	}
	public int getHspred() {
		return hspred;
	}
	public void setHspred(int hspred) {
		this.hspred = hspred;
	}
	public int getMompred() {
		return mompred;
	}
	public void setMompred(int mompred) {
		this.mompred = mompred;
	}
	public UserScore getUserscore() {
		return userscore;
	}
	public void setUserscore(UserScore userscore) {
		this.userscore = userscore;
	}
	
	
	
}
