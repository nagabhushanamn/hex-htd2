package com.hex.app.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.hex.app.model.Todo;

@Service
public class TodosServiceImpl implements TodoService {

	private static Map<Integer, Todo> map = new HashMap<>();

	static {
		Todo todo1 = new Todo(23456, "learn java", true);
		Todo todo2 = new Todo(65432, "learn js", false);
		Todo todo3 = new Todo(23456, "learn NG", true);

		map.put(todo1.getId(), todo1);
		map.put(todo2.getId(), todo2);
		map.put(todo3.getId(), todo3);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.hex.app.service.TodoService#getAllTodos()
	 */
	@Override
	public Collection<Todo> getAllTodos() {
		return map.values();
	}

}
