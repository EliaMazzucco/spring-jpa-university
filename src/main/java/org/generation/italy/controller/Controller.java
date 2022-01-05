package org.generation.italy.controller;

import org.generation.italy.model.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
@RequestMapping("/")
public class Controller {
	
	@Autowired
	private DepartmentRepository repository;
	
	@GetMapping
	public String department(Model model) {
		model.addAttribute("departments", repository.findAll(Sort.by("name")));
		
		return "departments";
	}

}
