package net.freedom.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	
	@GetMapping("/helloworld")
	public String welcome(String name, int age, Model model) {
		System.out.println("name : " + name + " age : " + age);
		model.addAttribute("name", name);
		//model.addAttribute("value", 10000);
		//model.addAttribute("taxed_value", 30);
		//model.addAttribute("in_ca", true);
		model.addAttribute("company", "<b>AJINEXTEK</b>");
		model.addAttribute("age", age);
		return "welcome";
	}
}
