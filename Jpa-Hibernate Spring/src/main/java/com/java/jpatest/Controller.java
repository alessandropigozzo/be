package com.java.jpatest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController
public class Controller {

	@Autowired
	Service service;
	
	@GetMapping("/getListStudent")
	public List<Student> getListFromStudenti() {
		return service.getListFromStudentiService();
		
	}
	
	@PostMapping("/addStudent")
	public Student aggiungiStudente(@RequestBody Student studente) {
		return service.addStudent(studente);
	}
	
	@DeleteMapping("/deleteStudent")
	public String cancellaStudente(@RequestBody Student studente) {
		return service.deleteStudent(studente);
	}
}
