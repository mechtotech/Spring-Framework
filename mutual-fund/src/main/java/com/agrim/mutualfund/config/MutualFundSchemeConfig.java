package com.agrim.mutualfund.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MutualFundSchemeConfig {
	
	
	@Bean
	 public List<String> getList( ) {
		 List <String> schemeDescription  = new ArrayList<String>();
		 return schemeDescription;
	 }

}
