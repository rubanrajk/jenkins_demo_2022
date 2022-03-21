package com.example.demo.controllers;

import java.util.Arrays;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeacherController {

	
	@GetMapping(path = "/teachers")
	public String getTeachers() {
		
		List<String> list = Arrays.asList("ajay","raj","vicky");
		return list.toString();
	}
	
	@GetMapping(path = "/teachers/{dept}")
	public String getTeachersByDept(@PathVariable("dept") String dept) {
		
		List<String> list = Arrays.asList("ajay","raj","vicky");
		
		if(dept.equals("cse")) {
			list=Arrays.asList("Shankar","salim","simon");
		}
		return list.toString();
	}
	@GetMapping(path="/teachers/{id}")
	public String getTeachersById(@PathVariable("id") int id) {
		
		return "Best Teacher";
	}
}


