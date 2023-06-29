package com.java.jpatest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class ServiceImpl implements Service {

	@Autowired
	Repo repository;

	@Override
	public List<Student> getListFromStudentiService() {
		List<Student> listaStudenti = new ArrayList<Student>();
		Iterable<Student> result  = repository.findAll();
		for (Student student : result) {
			listaStudenti.add(student);
		}		
		return listaStudenti;
	}

	@Override
	public Student addStudent(Student student) {
		return repository.save(student);
	}

	@Override
	public String deleteStudent(Student student) {
			repository.delete(student);
			return "effettuata cancellazione dello studente : "+ student.getName();
	}

	
	
	
}
