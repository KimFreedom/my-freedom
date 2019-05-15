package net.freedom.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import net.freedom.domain.User;
import net.freedom.domain.UserRepository;

@Controller
@RequestMapping("/users")
public class UserController {
	
	@Autowired
	private UserRepository userRepository;
	
	@PostMapping("")
	public String create(User user) {
		System.out.println("user : " + user);
		//users.add(user);
		userRepository.save(user);
		return "redirect:/users";
	}
	
	@GetMapping("")
	public String list(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "/user/list";
	}
	
	@GetMapping("/form")
	public String form(Model model) {
		return "/user/form";
	}
	
	/*
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("users", userRepository.findAll());
		return "/user/form";
	}
	*/
	
	@GetMapping("/login")
	public String login() {
		return "/user/login";
	}
	
	@GetMapping("/login_failed")
	public String login_failed() {
		return "/user/login_failed";
	}
	
	@GetMapping("/profile")
	public String profile() {
		return "/user/profile";
	}
}
