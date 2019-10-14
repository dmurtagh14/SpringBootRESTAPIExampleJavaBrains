package com.collabera.courseapi.courses;


//import java.util.Arrays;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class TopicController {
//	
//	//marks as need dependency injection
//	@Autowired
//	private TopicService topicService;
//	
//	@RequestMapping("/topics")
//	public List<Topics> getAllTopics() {
//		return topicService.getAllTopics();
//	}
//	
//	@RequestMapping("/topics/{id}")
//	public Topics getTopic(@PathVariable String id) {
//		return topicService.getTopic(id);
//	}
//	
//	@RequestMapping(method = RequestMethod.POST, value = "/topics")
//	public void addTopic(@RequestBody Topics topic) {
//		topicService.addTopic(topic);
//	}
//	
//	@RequestMapping(method = RequestMethod.PUT, value = "/topics{id}")
//	public void updateTopic(@RequestBody Topics topic, @PathVariable String id) {
//		topicService.updateTopic(id, topic);
//	}
//	
//	@RequestMapping(method = RequestMethod.DELETE, value = "/topics{id}")
//	public void deleteTopic(@PathVariable String id) {
//		topicService.deleteTopic(id);
//	}
//}

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.courseapi.topics.Topics;
@RestController
public class CourseController 
{
    @Autowired
    private CourseService courseService;
    
    @RequestMapping("/topics/{id}/courses")
    public List<Courses> getAllCourses(@PathVariable String id)
    {
        return courseService.getAllCourses(id);
    }
    
    @RequestMapping("/topics/{topicId}/courses/{id}")
    public Optional<Courses> getCourse(@PathVariable String id) 
    {
        return courseService.getCourse(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/topics/{topicId}/courses")
    public void addCourse(@RequestBody Courses course, @PathVariable String topicId) 
    {
    	course.setTopic((new Topics(topicId, "", "")));
    	
        courseService.addCourse(course);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{topicId}/courses/{id}")
    public void updateCourse(@RequestBody Courses course, @PathVariable String topicId, @PathVariable String id) 
    {
    	course.setTopic((new Topics(topicId, "", "")));
        courseService.updateCourse(course);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{topicId}/courses/{id}")
    public void deleteTopic(@PathVariable String id) 
    {
        courseService.deleteCourse(id);
    }
}
