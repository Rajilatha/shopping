/*package com.example.shopping.controllers;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.shopping.handler.RegisterHandler;
import com.example.shopping.model.User;
import com.example.shopping.service.UserService;

@Controller

public class RegisterController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private RegisterHandler userValidator;
	
//	private static final logger log= LoggerFactory.getLogger(RegisterController);
	
 @GetMapping("/register")
	    public String register(Model model) {
	        model.addAttribute("userForm", new User());

	        return "register";
	    }

	    @PostMapping("/register")
	    public String register(@ModelAttribute("userForm") User userForm, Model model) {
	       model.addAttribute(userForm, model);

	        if (model.hasErrors()) {
	            return "register";
	        }

	        userService.saveUser(userForm);

	        return "redirect:/login";
	    }

}*/
