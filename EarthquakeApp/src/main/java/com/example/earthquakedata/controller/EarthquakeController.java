package com.example.earthquakedata.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.earthquakedata.service.RetrieveService;

@RestController
public class EarthquakeController {
	private RetrieveService retrieveService;
	
	@Autowired
	public EarthquakeController(RetrieveService retrieveService) {
		super();
		this.retrieveService = retrieveService;
	}
	
	@RequestMapping("/api")
	public List<String> showEarthquakeData(){
		return retrieveService.getEarthquakes();
	}

	
}
