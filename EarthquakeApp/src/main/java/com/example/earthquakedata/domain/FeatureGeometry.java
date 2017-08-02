package com.example.earthquakedata.domain;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FeatureGeometry {
	private String type;
	private List<String> coordinates;
}
