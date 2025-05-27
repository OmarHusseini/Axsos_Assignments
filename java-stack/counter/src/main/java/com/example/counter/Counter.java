package com.example.counter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class Counter {
	@RequestMapping("")
	public String index(Model model , HttpSession session){
		if (session.getAttribute("count") == null) {
	        session.setAttribute("count", 1);
	        }
	        else {
		        session.setAttribute("count", (Integer)session.getAttribute("count")+1);
	        }
		
		return "index.jsp";
	}

	@RequestMapping("/counter")
	public String counter(Model model, HttpSession session){
		 // If the count is not already in session
		model.addAttribute(session.getAttribute("count"));
		
        
		return "count.jsp";
	}
	
	

}
