package com.java.jpatest;

import java.util.List;

public interface Service {

	List<Student> getListFromStudentiService();
	Student addStudent(Student student);
	 String deleteStudent(Student student);

}
