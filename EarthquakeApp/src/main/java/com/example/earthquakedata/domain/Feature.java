package com.example.earthquakedata.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Feature {
	private String id;
	private FeatureProperty properties;
	private FeatureGeometry geometry;
}
