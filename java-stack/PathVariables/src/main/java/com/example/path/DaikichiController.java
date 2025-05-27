package com.example.path;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	@RequestMapping("")
	public String hello(){
		return "Welcom!";
	}
	@RequestMapping("/travel/{name}")
	public String travel(@PathVariable("name") String name){
		return "Congratulations! You will soon travel to "+ name;
	}	
	
	@RequestMapping("/lotto/{number}")
	public String lotto(@PathVariable("number") int number){
		if(number%2 == 0) {
			return "You will take a grand journey in the near future but be wary of tempting offers.";
		}
		return "You have enjoyed the fruits of your labor, but now is a great time to spend time with family and friends.";		
	}
	
	
}
