package com.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService {
	private static List<Todo> todos = new ArrayList();

	static {
		todos.add(new Todo("Trousers", "clothes"));
		todos.add(new Todo("Shirt", "clothes"));
		todos.add(new Todo("T-Shirt", "clothes"));
	}

	public List<Todo> retrieveTodos() {
		return todos;
	}
	public void addtodo(Todo todo) {
		todos.add(todo);
	}
	 public void deleteTodo(Todo todo) {
		 todos.remove(todo);
	 }

}
