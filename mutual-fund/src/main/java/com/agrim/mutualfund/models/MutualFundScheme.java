package com.agrim.mutualfund.models;
//store the data retrieved  from the DB before sending it the client
//models class 

import java.util.List;

import org.springframework.stereotype.Component;

@Component //eligible for auto detection 

public class MutualFundScheme {
	
	
	private List<String> schemeDescription;//List is dynamic and array is fixed
//list holding strings
	public List<String> getSchemeDescription() {
		return schemeDescription;
		// return data stored 
	}

	public void setSchemeDescription(List<String> schemeDescription) {
		this.schemeDescription = schemeDescription;
		
		// set list collection
	}
	
	

}
