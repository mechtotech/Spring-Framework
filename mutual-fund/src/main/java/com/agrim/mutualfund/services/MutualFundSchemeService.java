package com.agrim.mutualfund.services;

import com.agrim.mutualfund.models.MutualFundParameters;
import com.agrim.mutualfund.models.MutualFundScheme;

public interface MutualFundSchemeService {
	
	MutualFundScheme mutualFundSchemeDetails();
	
	default MutualFundParameters mutualFundTerms() {
		return new MutualFundParameters();
	}

}
