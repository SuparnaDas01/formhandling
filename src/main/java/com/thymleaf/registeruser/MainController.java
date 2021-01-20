package com.thymleaf.registeruser;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
	
	@GetMapping("/register")
	public String showForm(Model model) {
		//addAtribute(string,object)
		model.addAttribute("user", new User());
		
		List<String> listProfession = Arrays.asList("Developer","Tester","PM","Architect");
		
		model.addAttribute("listProfession",listProfession);
		return "register_form";
	}

	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
	    System.out.println(user);
	    return "register_success";
	}
}
