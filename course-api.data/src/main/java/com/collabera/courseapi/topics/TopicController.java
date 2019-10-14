package com.collabera.courseapi.topics;


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
@RestController
public class TopicController 
{
    @Autowired
    private TopicService topicService;
    
    @RequestMapping("/topics")
    public List<Topics> getAllTopics()
    {
        return topicService.getAllTopics();
    }
    
    @RequestMapping("/topics/{id}")
    public Optional<Topics> getTopic(@PathVariable String id) 
    {
        return topicService.getTopic(id);
    }
    
    @RequestMapping(method=RequestMethod.POST, value="/topics")
    public void addTopic(@RequestBody Topics topic) 
    {
        topicService.addTopic(topic);
    }
    
    @RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
    public void updateTopic(@RequestBody Topics topic, @PathVariable String id) 
    {
        topicService.updateTopic(id, topic);
    }
    
    @RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
    public void deleteTopic(@PathVariable String id) 
    {
        topicService.deleteTopic(id);
    }
}
