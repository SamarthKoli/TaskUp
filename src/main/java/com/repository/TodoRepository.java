package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.TodoContainer;

@Repository
public interface TodoRepository extends JpaRepository<TodoContainer, Integer> {

	
}
