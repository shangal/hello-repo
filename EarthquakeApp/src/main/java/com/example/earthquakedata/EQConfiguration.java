package com.example.earthquakedata;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import com.example.earthquakedata.client.EQClientImpl;
import com.example.earthquakedata.lib.EQClient;
import com.example.earthquakedata.service.RetrieveService;
import com.example.earthquakedata.service.RetrieveServiceImpl;

@Configuration
public class EQConfiguration {
	@Bean
	public EQClient eqClient(){
		return new EQClientImpl(new RestTemplate(), "https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_month.geojson");
	}
	
	@Bean
	public RetrieveService retrieveService(EQClient eqClient){
		return new RetrieveServiceImpl(eqClient);
	}
}
