package com.Loan.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Loan.Models.LoanData;
import com.Loan.Services.LoanService;

@RestController
@CrossOrigin
public class LoanController {
	
	@Autowired
	LoanService loanService;
	
	@PostMapping({"/createLoan"})
	public LoanData createLoan(LoanData loan) {
		return loanService.createLoan(loan);
		}
	
	 
	

}
