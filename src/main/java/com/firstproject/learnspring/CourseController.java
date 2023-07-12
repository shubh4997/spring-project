package com.firstproject.learnspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {
	
	@RequestMapping("/courses")
	public List<Course> getAllCourses(){
		return Arrays.asList(new Course(1, "Learn java", "shubh"),
				new Course(2, "Learn spring", "shubh"),
				new Course(3, "Learn React", "shubham"));
	}
}
