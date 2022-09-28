package com.agrim.mutualfund.services;

import java.util.List;

//import javax.annotation.Priority;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.agrim.mutualfund.config.MutualFundSchemeConfig;
import com.agrim.mutualfund.models.MutualFundScheme;


@Service(value = "balancedMFScheme")
@Primary
public class BalancedMutualFundSchemeService implements MutualFundSchemeService {

	
	MutualFundScheme mutualFundScheme;
	MutualFundSchemeConfig mutualFundSchemeConfig;
	
		

@Autowired
	public BalancedMutualFundSchemeService(MutualFundScheme mutualFundScheme) {
		//super();
		this.mutualFundScheme = mutualFundScheme;
	}
@Autowired
	public void setMutualFundSchemeConfig(MutualFundSchemeConfig mutualFundSchemeConfig) {
		this.mutualFundSchemeConfig = mutualFundSchemeConfig;
	}






	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		// TODO Auto-generated method stub
		//List <String> schemeDescription = mutualFundSchemeConfig.getList();
		List <String> schemeDescription  = mutualFundSchemeConfig.getList();
		schemeDescription.add(":: Balanced Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Providing both growth and regular income");
		schemeDescription.add("Invested in equities and fixed income securitie");
		mutualFundScheme.setSchemeDescription(schemeDescription);
		
		return mutualFundScheme;
		//return null;
	}

}
