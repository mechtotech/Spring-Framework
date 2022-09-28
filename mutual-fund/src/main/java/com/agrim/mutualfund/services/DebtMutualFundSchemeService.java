package com.agrim.mutualfund.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrim.mutualfund.config.MutualFundSchemeConfig;
import com.agrim.mutualfund.models.MutualFundScheme;



@Service(value = "debtMFScheme")
public class DebtMutualFundSchemeService implements MutualFundSchemeService {

	MutualFundScheme mutualFundScheme;
	MutualFundSchemeConfig mutualFundSchemeConfig;


@Autowired
	public void setMutualFundSchemeConfig(MutualFundSchemeConfig mutualFundSchemeConfig) {
		this.mutualFundSchemeConfig = mutualFundSchemeConfig;
	}




@Autowired
	public DebtMutualFundSchemeService(MutualFundSchemeConfig mutualFundSchemeConfig) {
	super();
	this.mutualFundSchemeConfig = mutualFundSchemeConfig;
}





	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		// TODO Auto-generated method stub
		
		List<String> schemeDescription = mutualFundSchemeConfig.getList();
		schemeDescription.add(":: Debt Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Providing regular and steady income to investors");
		schemeDescription.add("Invested in bonds, corporate debentures, money market instruments");
		schemeDescription.add("Less risky compared to equity schemes");
		mutualFundScheme.setSchemeDescription(schemeDescription);
		return mutualFundScheme;
	}

}
