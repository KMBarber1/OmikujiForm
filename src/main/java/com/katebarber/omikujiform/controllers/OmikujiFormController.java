package com.katebarber.omikujiform.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class OmikujiFormController {

	@RequestMapping("/omikuji")
	public String omikuji() {
			return "dashboard.jsp";
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String create(
				HttpSession session,
				@RequestParam(value="number") int number,
				@RequestParam(value="city") String city,
				@RequestParam(value="name") String name,
				@RequestParam(value="hobby") String hobby,
				@RequestParam(value="livingThing") String livingThing,
				@RequestParam(value="somethingNice") String somethingNice) {
		
			session.setAttribute("number", number);
			session.setAttribute("city", city);
			session.setAttribute("name", name);
			session.setAttribute("hobby", hobby);
			session.setAttribute("livingThing", livingThing);
			session.setAttribute("somethingNice", somethingNice);
			
			return "redirect:/result";
			
	}
	
	@RequestMapping("/result")
	public String result() {
			return "result.jsp";
	}
	
}
