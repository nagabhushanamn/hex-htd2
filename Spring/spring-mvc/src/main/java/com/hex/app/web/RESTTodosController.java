package com.hex.app.web;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.hex.app.model.Todo;
import com.hex.app.service.TodoService;

@RestController
@RequestMapping("/api/todos")
public class RESTTodosController {

	@Autowired
	private TodoService todoService;

	@RequestMapping(method = RequestMethod.GET)
	public Collection<Todo> getTodos() {
		return this.todoService.getAllTodos();
	}

}
