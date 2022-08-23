package org.birlasoft.els.controllers;

import java.time.LocalDate;

import org.birlasoft.els.pojos.Leave;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LeaveController {
	
	@GetMapping("/els/leave/{email}")
	public ResponseEntity<Leave> m1(@PathVariable String email)
	{
		Leave leave = new Leave(4533, LocalDate.parse("2020-07-23"), "Sick leave", "medical leave", email);
		return new ResponseEntity<Leave>(leave,HttpStatus.OK);		
	}
	

}
