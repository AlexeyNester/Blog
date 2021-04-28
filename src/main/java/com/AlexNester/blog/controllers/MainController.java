package com.AlexNester.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("title", "Main site page");
		return "home";
	}
	@GetMapping("/about")
	public String about(Model model) {
		model.addAttribute("title", "Page about us");
		return "about";
	}
}
