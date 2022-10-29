package com.application.culture.france.controllers;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.application.culture.france.models.Monument;
import com.application.culture.france.repositories.MonumentRepository;

@Controller @Transactional
@RequestMapping(path="/monuments") 
public class MonumentController {
	@Autowired 
	private MonumentRepository monumentRepository;

	
	
	@GetMapping("")
	@ResponseBody
	public List<Monument> getMonuments() {
		//model.addAttribute("monuments", monumentRepository.findAll());
		return monumentRepository.findAll();
	}
	
   @GetMapping("/{code}")
   @ResponseBody
   public Monument getMonumentById(@PathVariable String code) {
	   return monumentRepository.findByCode(code);
   }
	
   @PostMapping("/add")
   @ResponseBody
    public String addMonument(@ModelAttribute Monument monument) {
	   
	   boolean exists = monumentRepository.existsByCode(monument.getCode());
	   if (!exists) 
		   if (monumentRepository.save(monument) != null) 
			   return "success";
	   

	   return "error could not be saved";
	   
    }
   
	@DeleteMapping("/delete/{code}")
	@ResponseBody
	public String deleteMonumentByCode(@PathVariable String code) {
		
		boolean exists = monumentRepository.existsByCode(code);
		if (exists) {
			monumentRepository.removeByCode(code);
			return "success";
		}
		return "error";
		
	}
	
	@PostMapping("update/{code}")
	@ResponseBody
	public String updatedMonumentByCode(@ModelAttribute Monument monument) {
		
		boolean exists = monumentRepository.existsByCode(monument.getCode());
		if (exists) {
			Monument currentMonument = monumentRepository.findByCode(monument.getCode());
			currentMonument = monument;
			monumentRepository.save(currentMonument);
			return "success";
		}
		return "error";
		
		
	}

}
