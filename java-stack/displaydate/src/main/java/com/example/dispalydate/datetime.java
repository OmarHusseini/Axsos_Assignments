package com.example.dispalydate;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class datetime {
@RequestMapping("")

public String index() {
	return"index.jsp";
}

@RequestMapping("/date")
public String date(Model model) {
	SimpleDateFormat formatDate = new SimpleDateFormat("EEEE, MMMM dd, yyyy");
	  String formattedDate = formatDate.format(new Date()).toString();
	  model.addAttribute("date", formattedDate);
	return"date.jsp";
}

@RequestMapping("/time")
public String time(Model model) {
	SimpleDateFormat formatDate = new SimpleDateFormat("h:mm a");  
	  
	  String formattedDate = formatDate.format(new Date()).toString();

	  model.addAttribute("time", formattedDate);
	return"time.jsp";
}
	

}
