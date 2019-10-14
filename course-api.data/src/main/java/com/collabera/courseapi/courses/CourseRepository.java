package com.collabera.courseapi.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;


public interface CourseRepository extends CrudRepository<Courses, String>{
	
	public List<Courses> findByTopicId(String topicId);

}