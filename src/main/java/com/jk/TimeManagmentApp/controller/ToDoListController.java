package com.jk.TimeManagmentApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jk.TimeApplicationApp.repository.ToDoListRepository;
import com.jk.TimeManagmentApp.dao.ToDoListEntity;

@Controller
public class ToDoListController {
	
	
	private ToDoListRepository todolistrepository;
	
	@GetMapping("/list")
	public String getToDoListPage() {
			
		return "list";

	}
}
