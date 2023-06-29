package com.java.jpatest;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {

	@Id
	public Long idStudent;
	public String name;
	public String surname;
	public String classe;
	
	
	public Student() {
		
	}


	public Student(String name, String surname, String classe) {
		super();
		this.name = name;
		this.surname = surname;
		this.classe = classe;
	}


	
	
	
	/**
	 * @return the idStudent
	 */
	public Long getIdStudent() {
		return idStudent;
	}


	/**
	 * @param idStudent the idStudent to set
	 */
	public void setIdStudent(Long idStudent) {
		this.idStudent = idStudent;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the surname
	 */
	public String getSurname() {
		return surname;
	}


	/**
	 * @param surname the surname to set
	 */
	public void setSurname(String surname) {
		this.surname = surname;
	}


	/**
	 * @return the classe
	 */
	public String getClasse() {
		return classe;
	}


	/**
	 * @param classe the classe to set
	 */
	public void setClasse(String classe) {
		this.classe = classe;
	}
	

	
	
}
