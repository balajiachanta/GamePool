package com.bala.GamePool.db.entity;

import java.time.LocalDate;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Balaji Achanta
 */
@Document(collection="users")
public class User {

	@Id
	private long userid;
	@NotEmpty
	@Email
	@Indexed(unique = true)
	private String email;
	private String password;
	@NotEmpty
	private LocalDate createdttm;
	private LocalDate updateddttm;
	private LocalDate latestlogindttm;
	@NotEmpty
	private int verifiedstatus;
	private int status;
	@NotEmpty
	private boolean isactive;
	private long score;
	private int bonusleft;
	@NotEmpty
	private boolean isadmin;

	public enum verfication{DONE,NOTDONE}
	public enum userstatus{ACTIVE,NOTACTIVE}

	public long getUserid() {
		return userid;
	}
	public void setUserid(long userid) {
		this.userid = userid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
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
	public LocalDate getLatestlogindttm() {
		return latestlogindttm;
	}
	public void setLatestlogindttm(LocalDate latestlogindttm) {
		this.latestlogindttm = latestlogindttm;
	}
	public int getVerifiedstatus() {
		return verifiedstatus;
	}
	public void setVerifiedstatus(int verifiedstatus) {
		this.verifiedstatus = verifiedstatus;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public long getScore() {
		return score;
	}
	public void setScore(long score) {
		this.score = score;
	}
	public int getBonusleft() {
		return bonusleft;
	}
	public void setBonusleft(int bonusleft) {
		this.bonusleft = bonusleft;
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", email=" + email + ", password=" + password + ", createdttm=" + createdttm
				+ ", updateddttm=" + updateddttm + ", latestlogindttm=" + latestlogindttm + ", verifiedstatus="
				+ verifiedstatus + ", status=" + status + ", isactive=" + isactive + ", score=" + score + ", bonusleft="
				+ bonusleft + "]";
	}
	public boolean isIsadmin() {
		return isadmin;
	}
	public void setIsadmin(boolean isadmin) {
		this.isadmin = isadmin;
	}


}
