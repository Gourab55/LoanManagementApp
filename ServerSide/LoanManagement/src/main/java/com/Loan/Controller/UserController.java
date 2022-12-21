//package com.Loan.Controller;
//
//import javax.annotation.PostConstruct;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.Loan.Models.User;
//import com.Loan.Services.UserService;
//
//@RestController
//public class UserController {
//	
//	@Autowired
//	UserService userService;
//	
//	@PostMapping({"/registernew"})
//	public User registerNewUser(@RequestBody User user) {
//		
//		return userService.registerNewUser(user);
//		
//	}
//	
//	@PostConstruct
//	public void initRolesAndUsers() {
//		userService.initRoleAndUser();
//	}
//	
//	@GetMapping({"/forAdmin"})
//   public String ForAdmin() {
//	   
//	   return "This is for admin user";
//   }
//	
//	@GetMapping({"/forUser"})
//	   public String ForUser() {
//		   
//		   return "This is for normal user";
//	   }
//	
//	
//	
//	
//}
