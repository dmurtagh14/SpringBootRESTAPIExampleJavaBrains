package com.collabera.courseapi.courses;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService 
{
	@Autowired
	private CourseRepository courseRepository;

    
    public List<Courses> getAllCourses(String topicId)
    {
        //return topics;
    	List<Courses> courses = new ArrayList<>();
    	
    	courseRepository.findByTopicId(topicId)
    	.forEach(courses::add);
    	
    	return courses;
    }
    
    public Optional<Courses> getCourse(String id)
    {    	
    	return courseRepository.findById(id);
    }
    public void addCourse(Courses courses) 
    {
    	courseRepository.save(courses);
    }
    public void updateCourse(Courses courses) 
    {
       courseRepository.save(courses);
    }
    public void deleteCourse(String id)
    {
    	courseRepository.deleteById(id);
    }
}
