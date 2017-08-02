package com.example.earthquakedata.client;

import org.springframework.web.client.RestTemplate;

import com.example.earthquakedata.lib.EQClient;

public class EQClientImpl implements EQClient {
	private RestTemplate restTemplate;
	private String url;
	public EQClientImpl(RestTemplate restTemplate, String url) {
		super();
		this.restTemplate = restTemplate;
		this.url=url;
	}
	@Override
	public EQResponse get() {
		EQResponse response = restTemplate.getForObject(url, EQResponse.class);
		System.out.println(response.getFeatures().size());
		System.out.println(response);
		return response;
	}

}
