package com.Loan.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.Model.User;

@Repository
public interface IUserRepo extends JpaRepository<User, Integer>{

	User findByEmail(String email);
	
	

}
