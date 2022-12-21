package com.Loan.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.Loan.LoanService.LoanService;
import com.Loan.Model.Loan;



@RestController
@RequestMapping("/api/v1/")
@CrossOrigin(origins="*")
//http://localhost:4200/
public class LoanController {
	
	
	@Autowired
	LoanService loanService;
	
	@PostMapping("/createLoan")
	public Loan createLoan(@RequestBody Loan loan) {
		return loanService.createLoan(loan);
		}
	
	@GetMapping("/getAllLoan")
	public List<Loan> GetAllLoan(){
		
		return loanService.getAllLoans();
		
	}
	
	@GetMapping("/loan/{id}")
	public ResponseEntity<Loan> getLoan(@PathVariable Integer id)
	{
		
		return new ResponseEntity<Loan>(loanService.GetLoan(id), HttpStatus.OK);
	}
	
	
	@PutMapping("/updateLoan/{id}")
	
	public ResponseEntity<Loan> updateLoan(@PathVariable Integer id,@RequestBody Loan loan)
	{
		return new ResponseEntity<Loan>(loanService.UpdateLoan(loan, id), HttpStatus.OK);
	}
	
	
	@GetMapping("searchLoan")
	public List<Loan> getLoansBySearch(@RequestParam String fastname,
					@RequestParam String lastname,@RequestParam Integer loanNo)
			 {
				return loanService.getLoansBySearch(fastname, lastname, loanNo);
		
	        }
	
	@DeleteMapping("/remove/{id}")
	public ResponseEntity<Loan> deleteBook(@PathVariable Integer id){
		
		
	ResponseEntity<Loan> responseEntity= new ResponseEntity<>(HttpStatus.OK);
	try {
	   loanService.deleteBook(id);
		
	} catch ( Exception e) {
		e.printStackTrace();
	   responseEntity= new ResponseEntity<Loan>(HttpStatus.NOT_FOUND);
	}
	return responseEntity;
	
	}

}
