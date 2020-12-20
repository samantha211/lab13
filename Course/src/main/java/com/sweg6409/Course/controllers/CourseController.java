package com.sweg6409.Course.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sweg6409.Course.models.Course;
import com.sweg6409.Course.services.CourseService;

@RestController
@CrossOrigin("*")
@PreAuthorize("hasRole('ROLE_ADMIN')")
public class CourseController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping("/api/courses")
	public ArrayList<Course> getAllCourses(){
		return courseService.getAllCourses();
	}

}
