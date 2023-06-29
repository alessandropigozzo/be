package com.java.jpatest;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface Repo extends CrudRepository<Student, Long> {
}
