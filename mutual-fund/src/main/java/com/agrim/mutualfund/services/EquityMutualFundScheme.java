package com.agrim.mutualfund.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrim.mutualfund.config.MutualFundSchemeConfig;
import com.agrim.mutualfund.models.MutualFundScheme;


@Service (value = "equityMFScheme")
public class EquityMutualFundScheme implements MutualFundSchemeService {
	
	
	MutualFundScheme mutualFundScheme;
	MutualFundSchemeConfig mutualFundSchemeConfig;
	
	
	
	
@Autowired
	public EquityMutualFundScheme(MutualFundSchemeConfig mutualFundSchemeConfig) {
		super();
		this.mutualFundSchemeConfig = mutualFundSchemeConfig;
	}
	



@Autowired
	public void setMutualFundScheme(MutualFundScheme mutualFundScheme) {
		this.mutualFundScheme = mutualFundScheme;
	}





	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		List <String> schemeDescription  = mutualFundSchemeConfig.getList();
		schemeDescription.add(":: Growth / Equity Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Objective is wealth creation");
		schemeDescription.add("Generating higher returns for long term investments");
		schemeDescription.add("Capital appreciation over a period of time");
		mutualFundScheme.setSchemeDescription(schemeDescription);
		
		return mutualFundScheme;
		
		
		
		
	}

}
