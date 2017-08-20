package com.app.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.models.User;
import com.app.repository.UserRepository;

@Controller
@RequestMapping
class UserController {
	
	@Autowired
	UserRepository userRepository;

	@GetMapping("/userList")
	public String getAllUser(Map<String, Object> model){
		List<User> users = (ArrayList<User>) userRepository.findAll();
		model.put("users", users);

		return "home";
	}
}