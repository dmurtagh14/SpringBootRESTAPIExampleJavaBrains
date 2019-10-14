package com.collabera.courseapi.topics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topics {
	
	@Id
	private String id;
	
	private String name;
	private String descroptions;
	
	public Topics() {
		
	}
	
	public Topics(String id, String name, String descroptions) {
		super();
		this.id = id;
		this.name = name;
		this.descroptions = descroptions;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescroptions() {
		return descroptions;
	}
	public void setDescroptions(String descroptions) {
		this.descroptions = descroptions;
	}
}