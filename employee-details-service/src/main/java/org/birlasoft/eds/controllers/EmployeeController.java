package org.birlasoft.eds.controllers;

import java.util.ArrayList;
import java.util.List;

import org.birlasoft.eds.pojos.Employee;
import org.birlasoft.eds.pojos.Expense;
import org.birlasoft.eds.pojos.Leave;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class EmployeeController {
	
	@PostMapping("/eds/employee")
	public ResponseEntity<?> m1(@RequestParam("email") String email,
			@RequestParam("password") String password)
	{
		RestTemplate template = new RestTemplate();
		
		boolean status = template.getForObject("http://localhost:8091/eas/authenticate/"+email+"/"+password, Boolean.class );
		
		if(status)
		{
			Expense expense = template.getForObject("http://localhost:8092/ees/expense/"+email, Expense.class);
			Leave leave = template.getForObject("http://localhost:8093/els/leave/"+email, Leave.class);
			
			Employee employee = new Employee();
			employee.setEmail(email);
			List<Expense> expenseList = new ArrayList<Expense>();
			expenseList.add(expense);
			
			List<Leave> leaveList = new ArrayList<Leave>();
			leaveList.add(leave);
			
			employee.setExpenses(expenseList);
			employee.setLeaves(leaveList);
			
			return new ResponseEntity<Employee>(employee,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<String>("Invalid email or password",HttpStatus.OK);
		}		
	}	

}
