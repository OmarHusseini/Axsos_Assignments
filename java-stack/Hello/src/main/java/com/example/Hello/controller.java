package com.example.Hello;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class controller {
	@RequestMapping("/")
	public String today(Model model){
		 ArrayList<String> axsosPrograms= new ArrayList<String>();
	        axsosPrograms.add("Web Development");
	        axsosPrograms.add("Data Science");
	        axsosPrograms.add("Power BI");
	        model.addAttribute("programsFromMyController", axsosPrograms);		
		return "index.jsp";
	}	

}
