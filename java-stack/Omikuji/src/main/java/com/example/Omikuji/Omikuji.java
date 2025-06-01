package com.example.Omikuji;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

import ch.qos.logback.core.joran.spi.HttpUtil.RequestMethod;
import jakarta.servlet.http.HttpSession;

@Controller
@RequestMapping("/omikuji")
public class Omikuji {
	@RequestMapping("")
	public String index() {
		
		return "index.jsp";
		
	}
	@PostMapping("/massege/")
	public String maseege(HttpSession session,
			@RequestParam(value="number") String number,
			@RequestParam(value="city") String city,
			@RequestParam(value="person") String person,
			@RequestParam(value="hoppy") String hoppy,
			@RequestParam(value="living") String living,
			@RequestParam(value="saysomething") String say) {
		
        session.setAttribute("number", number);
        session.setAttribute("city", city);
        session.setAttribute("person", person);
        session.setAttribute("hoppy", hoppy);
        session.setAttribute("living", living);
        session.setAttribute("saysomething", say);

        System.out.println("test");
		
		return "redirect:/omikuji/show";
		
	}
	
	@RequestMapping("/show")
	public String show(HttpSession session) {
		session.getAttribute("number");
		session.getAttribute("city");
		session.getAttribute("person");
		session.getAttribute("hoppy");
		session.getAttribute("living");
		session.getAttribute("saysomething");
		return "message.jsp";
		
	}
	
	
	

}
