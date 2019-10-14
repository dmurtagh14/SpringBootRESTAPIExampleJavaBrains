package com.collabera.courseapi.courses;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.collabera.courseapi.topics.*;

@Entity
public class Courses {
	
	@Id
	private String id;
	
	private String name;
	private String descroptions;
	
	@ManyToOne
	private Topics topic;

	public Courses() {
		
	}
	
	public Courses(String id, String name, String descroptions,String topicId ) {
		super();
		this.id = id;
		this.name = name;
		this.descroptions = descroptions;
		this.topic = new Topics(topicId, " ", " ");
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
	public Topics getTopic() {
		return topic;
	}

	public void setTopic(Topics topic) {
		this.topic = topic;
	}
}