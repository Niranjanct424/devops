package org.birlasoft.eas.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthenticationController {
	
	@GetMapping("/eas/authenticate/{email}/{password}")
	public ResponseEntity<Boolean> m1(@PathVariable String email,@PathVariable String password)
	{
		
		if(email.equals(password) && email.length() > 5)
		{
			return new ResponseEntity<Boolean>(true,HttpStatus.OK);
		}
		else
		{
			return new ResponseEntity<Boolean>(false,HttpStatus.OK); 
		}
		
	}

}
