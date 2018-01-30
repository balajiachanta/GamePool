package com.bala.GamePool.db.entity.util;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * @author Balaji Achanta
 */
@Document(collection = "customsequences")
public class CustomSequences {
    @Id
    private String id;
    public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public long getSequence() {
		return sequence;
	}
	public void setSequence(long sequence) {
		this.sequence = sequence;
	}

	private long sequence;
	
}
