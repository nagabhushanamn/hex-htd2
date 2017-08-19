package com.hex.app.web;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.hex.app.model.Todo;

@Component
public class TodoValidator implements Validator {

	@Override
	public boolean supports(Class<?> arg0) {
		return arg0.getClass().equals(Todo.class);
	}

	@Override
	public void validate(Object model, Errors errors) {

		Todo todo = (Todo) model;

		// .....

		ValidationUtils.rejectIfEmpty(errors, "title", "todo.title.required");

	}

}
