package com.agrim.mutualfund.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.agrim.mutualfund.models.MutualFundParameters;
import com.agrim.mutualfund.models.MutualFundScheme;
import com.agrim.mutualfund.services.MutualFundSchemeService;

@RestController //automatic detection by Spring IOC and ask IOC container to make a bean 
@RequestMapping(value="/mutualfund-scheme")
public class MutualFundSchemeController {
	
	MutualFundSchemeService mutualFundSchemeService;
	MutualFundSchemeService mutualFundBasics;
	
	@Autowired
	public void setMutualFundSchemeService(@Qualifier ("debtMFScheme")MutualFundSchemeService mutualFundSchemeService,
			   @Qualifier ("mutualFundBasics")MutualFundSchemeService mutualFundBasics) {
	this.mutualFundSchemeService = mutualFundSchemeService;
	this.mutualFundBasics = mutualFundBasics;
}
		//Can't make an object for Interface and but only implementation of the interface hence we use Qualifier
	
	@GetMapping
	public ResponseEntity<MutualFundScheme>  MutualFundDetailsHandler(){
			  
		MutualFundScheme mutualFundScheme = mutualFundSchemeService.mutualFundSchemeDetails();
	 //HTTP status return code for a successful find statement        
	   return new ResponseEntity<MutualFundScheme>(mutualFundScheme, HttpStatus.FOUND); 
	
	 }

	
	@GetMapping(value="/terms")
	public ResponseEntity<MutualFundParameters>  mutualFundTerms(){
		MutualFundParameters mutualFundParameters = mutualFundBasics.mutualFundTerms();
		
		return new ResponseEntity<MutualFundParameters>(mutualFundParameters, HttpStatus.FOUND); 
	
	 }
	
	
	
	

}
