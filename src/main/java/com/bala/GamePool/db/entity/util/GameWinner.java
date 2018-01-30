package com.bala.GamePool.db.entity.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Balaji Achanta
 */
@Document(collection="gamewinners")
public class GameWinner {

	@Id
	private long winnerid;
	private long matchid;
	private long teamid;
	private long userids;
	private boolean islotdone;
	private int winnerscore;
	private int tossteamid;
	private int momplayerid;
	private int hsplayerid;
	public long getWinnerid() {
		return winnerid;
	}
	public void setWinnerid(long winnerid) {
		this.winnerid = winnerid;
	}
	public long getMatchid() {
		return matchid;
	}
	public void setMatchid(long matchid) {
		this.matchid = matchid;
	}
	public long getTeamid() {
		return teamid;
	}
	public void setTeamid(long teamid) {
		this.teamid = teamid;
	}
	public long getUserids() {
		return userids;
	}
	public void setUserids(long userids) {
		this.userids = userids;
	}
	public boolean isIslotdone() {
		return islotdone;
	}
	public void setIslotdone(boolean islotdone) {
		this.islotdone = islotdone;
	}
	public int getWinnerscore() {
		return winnerscore;
	}
	public void setWinnerscore(int winnerscore) {
		this.winnerscore = winnerscore;
	}
	public int getTossteamid() {
		return tossteamid;
	}
	public void setTossteamid(int tossteamid) {
		this.tossteamid = tossteamid;
	}
	public int getMomplayerid() {
		return momplayerid;
	}
	public void setMomplayerid(int momplayerid) {
		this.momplayerid = momplayerid;
	}
	public int getHsplayerid() {
		return hsplayerid;
	}
	public void setHsplayerid(int hsplayerid) {
		this.hsplayerid = hsplayerid;
	}
	
}
