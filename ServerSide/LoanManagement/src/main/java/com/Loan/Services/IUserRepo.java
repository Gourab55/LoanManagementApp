package com.Loan.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.Models.User;

@Repository
public interface IUserRepo extends JpaRepository<User, String> {

}
