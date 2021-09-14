package com.codingz2m.springmutualfundschemeservice.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.codingz2m.springmutualfundschemeservice.config.MutualFundSchemeConfig;
import com.codingz2m.springmutualfundschemeservice.models.MutualFundScheme;

@Service (value="balancedMFScheme")
@Primary
public class BalancedMutualFundSchemeService implements MutualFundSchemeService {

	MutualFundScheme mutualFundScheme;
	MutualFundSchemeConfig mtualFundSchemeConfig;
	
	// Constructor Injection
	@Autowired
	public BalancedMutualFundSchemeService(MutualFundSchemeConfig mtualFundSchemeConfig) {
		this.mtualFundSchemeConfig = mtualFundSchemeConfig;
	}
	
	// Setter Injection
		@Autowired
		public void setMutualFundScheme(MutualFundScheme mutualFundScheme) {
			this.mutualFundScheme = mutualFundScheme;
		}


	@Override
	public MutualFundScheme mutualFundSchemeDetails() {
		
		List <String> schemeDescription  = mtualFundSchemeConfig.getList();
		schemeDescription.add(":: Balanced Mutual Fund Scheme Objectives ::");
		schemeDescription.add("Providing both growth and regular income");
		schemeDescription.add("Invested in equities and fixed income securitie");
		mutualFundScheme.setSchemeDescription(schemeDescription);
		
		return mutualFundScheme;
	}


}
