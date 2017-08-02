package com.example.earthquakedata.client;

import java.util.List;

import com.example.earthquakedata.domain.Feature;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EQResponse {
	private String type;
	private List<Feature> features;
	
}
