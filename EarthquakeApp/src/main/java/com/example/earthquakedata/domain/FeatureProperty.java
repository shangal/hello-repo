package com.example.earthquakedata.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeatureProperty {
	private String mag;
	private String place;
	private long time;
}
