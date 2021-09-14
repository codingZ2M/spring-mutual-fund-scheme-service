package com.codingz2m.springmutualfundschemeservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.codingz2m.springmutualfundschemeservice.models.MutualFundScheme;
import com.codingz2m.springmutualfundschemeservice.services.MutualFundSchemeService;


@RestController // Routes the requests the user types
@RequestMapping(value = "/mutualfund-scheme")
public class MutualFundSchemeController {
	
	MutualFundSchemeService mutualFundSchemeService;
	
     // Setter Injection
	@Autowired
	@Qualifier ("equityMFScheme")
	public void setMutualFundSchemeService(MutualFundSchemeService mutualFundSchemeService) {
		this.mutualFundSchemeService = mutualFundSchemeService;
	}
	
	@GetMapping
	public ResponseEntity<MutualFundScheme>  MutualFundDetailsHandler(){
			  
		MutualFundScheme mutualFundScheme = mutualFundSchemeService.mutualFundSchemeDetails();
	 //HTTP status return code for a successful find statement        
	   return new ResponseEntity<MutualFundScheme>(mutualFundScheme, HttpStatus.FOUND); 
	
	 }


	
	
}
