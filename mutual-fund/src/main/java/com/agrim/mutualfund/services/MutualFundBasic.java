package com.agrim.mutualfund.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.agrim.mutualfund.models.MutualFundParameters;
import com.agrim.mutualfund.models.MutualFundScheme;

@Service(value = "mutualFundBasics")

public class MutualFundBasic implements MutualFundSchemeService {
	
	
	private MutualFundParameters mutualFundParameters;
	
	
	@Autowired
	public MutualFundBasic(MutualFundParameters mutualFundParameters) {
	//super();
		this.mutualFundParameters = mutualFundParameters;//create bean 
	}



	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		// TODO Auto-generated method stub
		return null;
	}
	
public MutualFundParameters mutualFundTerms() {
		
		mutualFundParameters.setNetAssetValue("Market value per unit of mutual funds");
		mutualFundParameters.setExpenseRatio("Operational charges as mutual funds");
		mutualFundParameters.setExitLoad("Premature exit from the fund");
		mutualFundParameters.setAssetsUnderManagement("Total assets that are being managed by a mutual fund scheme");
		mutualFundParameters.setRiskLevel("How much risk the particular scheme entail");
		mutualFundParameters.setPortfolioTurnoverRatio("Defines how frequently the mutual fund manger buys or sells the stocks from the fund");
		mutualFundParameters.setQuantitativeMeasures("Gives an idea of the risk taken by the mutual fund and the volatility you can expect in your returns");
		mutualFundParameters.setPortfolio("The stocks the mutual fund has invested in and the sectors( percentage of Total Holdings)it has more exposure to");
		
		return mutualFundParameters;
	}


}
