package com.fullstack.todo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TodoHardcodedService {
	
	private static List<Todo> todos = new ArrayList<>();
	private static long idCounter = 0;
	static {
		todos.add(new Todo(++idCounter,"ndastane","Learn music", new Date(), false));
		todos.add(new Todo(++idCounter,"ndastane","Learn dance", new Date(), false));
		todos.add(new Todo(++idCounter,"ndastane","Learn Python", new Date(), false));
		todos.add(new Todo(++idCounter,"ndastane","Learn AWS", new Date(), false));
	
	}
	
	public List<Todo> findAll() {
		return todos ;
	}

	public List<Todo> findByUsername(String username) {
		// TODO Auto-generated method stub
		return todos;
	}
	
}
