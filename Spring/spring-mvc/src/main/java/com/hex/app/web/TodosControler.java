package com.hex.app.web;

import java.util.Collection;
import java.util.Locale;
import java.util.Map;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hex.app.model.Todo;
import com.hex.app.service.TodoService;

@Controller
// @RequestMapping(value = "/todos")
public class TodosControler {

	@Autowired
	private TodoService todoService;

	@Autowired
	private TodoValidator todoValidator;

	//
	// @RequestMapping(value = "/{todoId}", method = RequestMethod.GET)
	// public ModelAndView getTodos(@PathVariable int todoId,
	// @ModelAttribute("company") String comp) {
	//
	// if (todoId > 100)
	// throw new TodoNotFoundException("todo id > 1000, Not Found");
	//
	// ModelAndView mav = new ModelAndView();
	// mav.addObject("todos", this.todoService.getAllTodos());
	// mav.addObject("comp", comp);
	// mav.setViewName("todos-list");
	// return mav;
	// }

	// @RequestMapping(method = RequestMethod.GET)
	// public ModelAndView getTodos(@ModelAttribute("company") String comp) {
	// // System.out.println("Requestmapping Method ivoked...");
	//
	// boolean flag = true;
	//
	// if (flag)
	// throw new RuntimeException(" i hate spring");
	//
	// ModelAndView mav = new ModelAndView();
	// mav.addObject("todos", this.todoService.getAllTodos());
	// mav.addObject("comp", comp);
	// mav.setViewName("todos-list");
	// return mav;
	// }

	// or
	//
	// @RequestMapping(method = RequestMethod.GET)
	// public String getTodos(Model model) {
	// model.addAttribute("todos", this.todoService.getAllTodos());
	// return "todos-list";
	// }

	// or

	// @RequestMapping(method = RequestMethod.GET)
	// public String getTodos(Map<String, Collection<Todo>> map) {
	// map.put("todos", this.todoService.getAllTodos());
	// return "todos-list";
	// }

	// ------------------------------------------------------
	//
	// @RequestMapping(method = RequestMethod.POST)
	// public ModelAndView createTodo(@RequestBody @Valid Todo todo, BindingResult
	// result) {
	//
	// System.out.println(todo);
	// // this.todoValidator.validate(todo, result);
	//
	// ModelAndView mav = new ModelAndView();
	// if (result.hasErrors()) {
	// mav.addObject("message", "Invalid Todo Input");
	// mav.setViewName("todos-error-page");
	// return mav;
	// } else {
	// mav.addObject("todos", this.todoService.getAllTodos());
	// mav.setViewName("todos-list");
	// return mav;
	// }
	// }

	// -----------------------------------------------------------
	//
	// @ModelAttribute("company")
	// public String loadAttributes() {
	// System.out.println("Model Attribute Method ivoked...");
	// return "hexaware";
	// }

	// ----------------------------------------------------------

	// @InitBinder
	// public void customConversion() {
	// //..
	// }

	// ----------------------------------------------------------

}
