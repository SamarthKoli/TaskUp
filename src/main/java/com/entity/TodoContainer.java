package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class TodoContainer {

	@Id
	private int todoId;
	private String todoDescription;
	public int getTodoId() {
		return todoId;
	}
	public void setTodoId(int todoId) {
		this.todoId = todoId;
	}
	public String getTodoDescription() {
		return todoDescription;
	}
	public void setTodoDescription(String todoDescription) {
		this.todoDescription = todoDescription;
	}
	public TodoContainer(int todoId, String todoDescription) {
		super();
		this.todoId = todoId;
		this.todoDescription = todoDescription;
	}
	public TodoContainer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
