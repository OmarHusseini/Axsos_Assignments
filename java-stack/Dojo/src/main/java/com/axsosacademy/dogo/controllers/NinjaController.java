package com.axsosacademy.dogo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.axsosacademy.dogo.models.Ninja;
import com.axsosacademy.dogo.services.DojoService;
import com.axsosacademy.dogo.services.NinjaService;

import jakarta.validation.Valid;

@Controller
public class NinjaController {
	@Autowired
	private  NinjaService ninjaservice;
	@Autowired
	private DojoService dojoservice;
	
	@GetMapping("/new/ninjas")
    public String newNinja(@ModelAttribute ("ninjas") Ninja ninja,Model model) {
		model.addAttribute("dojos",dojoservice.findAllDojos() );
    	return "ninja";
    }
	
	@PostMapping("/ninja/form")
    public String createNinja(@Valid @ModelAttribute ("ninjas") Ninja ninja, BindingResult result) {
    	  if (result.hasErrors()) {
              return "ninja";
          }
    	  ninjaservice.createninja(ninja);
          return "redirect:/display/" + ninja.getDojo().getId();
    }
	

}
