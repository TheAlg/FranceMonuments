package com.application.culture.france.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.application.culture.france.models.Monument;
import com.application.culture.france.repositories.MonumentRepository;

@Controller
@RequestMapping(path="/monuments") 
public class MonumentController {
	@Autowired 
	private MonumentRepository monumentRepository;

	
	@GetMapping("/all")
	public String viewMonuments(Model model) {
		model.addAttribute("monuments", monumentRepository.findAll());
		return "monuments";
	}

}
