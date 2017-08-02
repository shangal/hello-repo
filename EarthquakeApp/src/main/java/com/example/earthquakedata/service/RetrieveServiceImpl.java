package com.example.earthquakedata.service;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.example.earthquakedata.client.EQResponse;
import com.example.earthquakedata.domain.Feature;
import com.example.earthquakedata.lib.EQClient;

public class RetrieveServiceImpl implements RetrieveService {
	private EQClient client;
	
	public RetrieveServiceImpl(EQClient client) {
		super();
		this.client = client;
	}
	@Override
	public List<String> getEarthquakes() {
		return getEarthquakes(getPredicate());
	}
	private Predicate<Feature> getPredicate() {
		return p->Double.parseDouble(p.getProperties().getMag()) > 1;
	}
	
	private List<String> getEarthquakes(Predicate<Feature> p) {
		EQResponse response = client.get();
		return response.getFeatures().stream()
				.map(s->s.getProperties().getPlace())
				.collect(Collectors.toList());
	}

}
