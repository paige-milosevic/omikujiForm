package com.codingDojo.omikujiForm.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class HomeController {

	@GetMapping("/")
	public String redi() {
		return "redirect:/omikuji";
	}
	
	@GetMapping("/omikuji")
	public String index() {
		return "form.jsp";
	}
	
	@GetMapping("/omikuji/show")	
	public String show(HttpSession session, Model model) {
		String result = (String) session.getAttribute("results");
		model.addAttribute("result", result);
		
		return "omikuji.jsp";
	}
	
	@PostMapping("/formsubmit")
	public String form(
			@RequestParam("number") int number,
			@RequestParam("city") String city,
			@RequestParam("person") String person,
			@RequestParam("prof") String prof,
			@RequestParam("livingThing") String livingThing,
			@RequestParam("nice") String nice,
			HttpSession session
			) {
		
		String result = 
		String.format("In %s years you will live in %s with %s as your roommate, %s. The next time you see a %s, you will have good luck. Also, %s.", number, city, person, prof, livingThing, nice);
		session.setAttribute("result", result);
		System.out.println(result);
		return "redirect:/omikuji/show";
		
	}
	
	
}
