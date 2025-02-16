package com.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entity.TodoContainer;
import com.services.TodoServices;

@RestController
public class TodoController {

	@Autowired
	TodoServices todoServices;
	
	@PostMapping("/addTodo")
	public TodoContainer addTodo(@RequestBody TodoContainer todoContainer) {
		 return todoServices.addTodo(todoContainer);
		
	}
	
	@GetMapping("/viewAlltodo")
	public List<TodoContainer>getTodo(){
		return todoServices.viewAllTodos();
	}
	
	@GetMapping("/viewById/{id}")
	public Optional<TodoContainer> getTodoById(@PathVariable int id){
		return todoServices.viewtodoById(id);
	}
	@PutMapping("/updateTodo/{id}")
	public TodoContainer updateTodo(@PathVariable int id,@RequestBody TodoContainer todoContainer) {
		return todoServices.updateTodoById(id,todoContainer);
	}
	
	@DeleteMapping("/deleteTodo/{id}")
	public void deleteTodo(@PathVariable int id) {
		todoServices.deleteTodoById(id);
	}
	
}
