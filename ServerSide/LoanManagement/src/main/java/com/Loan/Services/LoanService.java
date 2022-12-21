package com.Loan.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Loan.Models.LoanData;

@Service
public class LoanService {
	
	@Autowired
	ILoanRepo iloanRepo;
	
	
	public LoanData createLoan(LoanData loan) {
		return iloanRepo.save(loan);
		
	}

}
