package com.Loan.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.Loan.Model.User;

@Service
public class UserService {
	
	@Autowired
	IUserRepo iuserRepo;
	
	public User RegisterUser(User user)
	{
		return iuserRepo.save(user);
	}
	
	
	public ResponseEntity<User> Login(String email,String password) {
		System.out.println(email+" "+password);
		User user=iuserRepo.findByEmail(email);
		System.out.println(user.getEmail() +" "+user.getPassword());
		if(email.equalsIgnoreCase(user.getEmail()) && password.equals(user.getPassword()))
		{
			return ResponseEntity.ok(user);
			
		}
		return  (ResponseEntity<User>) ResponseEntity.internalServerError();
	 
	}
   public List<User> alluser(){
	   return iuserRepo.findAll();
	   
   }
}
