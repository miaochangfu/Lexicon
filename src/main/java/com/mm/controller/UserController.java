package com.mm.controller;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mm.model.User;
import com.mm.repository.UserRepository;

@RestController
public class UserController {
	@Autowired
	UserRepository up;
	
	@PostMapping("/get")
	public List<String> getName(@RequestParam String name) {
		return up.findAll().stream().map(User::getName).collect(Collectors.toList());
	}
}
