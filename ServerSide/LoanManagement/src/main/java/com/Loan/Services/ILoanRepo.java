package com.Loan.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Loan.Models.LoanData;

@Repository
public interface ILoanRepo extends JpaRepository<LoanData, Integer>{
	

}
