package com.Loan.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Loan.Model.User;
import com.Loan.Services.UserService;

@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="*")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@PostMapping("/register")
	public  User RegisterUser(@RequestBody User user)
	{
		return userService.RegisterUser(user);
		
	}
	
	@GetMapping("/login")
	public ResponseEntity<User>  Login(@RequestParam String email,@RequestParam String password)
	{
		return userService.Login(email, password);
	}
	
	@GetMapping("/getalluser")
	public List<User> GetallUser(){
		
		return userService.alluser();
	}
	

}
