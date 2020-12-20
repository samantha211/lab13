package com.sweg6409.Course.services;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sweg6409.Course.models.Course;
import com.sweg6409.Course.repositories.CourseRepository;

@Service
public class CourseService {
	
	@Autowired
	CourseRepository courseRepository;
	
	public ArrayList<Course> getAllCourses(){
		return (ArrayList<Course>) courseRepository.findAll();
	}

}
