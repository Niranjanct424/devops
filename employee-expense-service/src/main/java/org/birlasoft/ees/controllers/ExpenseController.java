package org.birlasoft.ees.controllers;

import java.time.LocalDate;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.birlasoft.ees.pojos.Expense;

@RestController
public class ExpenseController {

	@GetMapping("ees/expense/{email}")
	public ResponseEntity<?> m1(@PathVariable("email") String email)
	{
		System.out.println("In expense controller...");
		Expense expense = new Expense(121, email,"sachin gupta", 4000, "some expense", LocalDate.parse("2020-02-03"));
		return new ResponseEntity<Expense>(expense,HttpStatus.OK);		
	}	
}
