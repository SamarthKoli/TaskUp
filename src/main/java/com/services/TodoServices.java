package com.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.TodoContainer;
import com.repository.TodoRepository;

@Service
public class TodoServices {
   
	@Autowired
	TodoRepository todoRepository;
	
	
	public TodoContainer addTodo(TodoContainer todoContainer) {
	
		return todoRepository.save(todoContainer);
	}
	
	public List<TodoContainer>viewAllTodos(){
		return todoRepository.findAll();
	}
	
	public Optional<TodoContainer> viewtodoById(int todoId){
	  return todoRepository.findById(todoId);
	}
	
	public TodoContainer updateTodoById(int todoId ,TodoContainer todoContainer) {
		TodoContainer todoContainer2=todoRepository.findById(todoId).get();
		todoContainer2.setTodoDescription(todoContainer.getTodoDescription());
		return todoRepository.save(todoContainer2);
		
	}
	public void deleteTodoById(int todoId) {
		 todoRepository.deleteById(todoId);
		
	}
	
}
