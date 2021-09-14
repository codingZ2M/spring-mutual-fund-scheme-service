package com.codingz2m.springmutualfundschemeservice.models;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class MutualFundScheme {
	
	private List<String> schemeDescription;

	public List<String> getSchemeDescription() {
		return schemeDescription;
	}

	public void setSchemeDescription(List<String> schemeDescription) {
		this.schemeDescription = schemeDescription;
	}

}
