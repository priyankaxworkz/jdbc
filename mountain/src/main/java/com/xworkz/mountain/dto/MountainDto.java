package com.xworkz.mountain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MountainDto {

	private String mountainName;
	private double height;
	private String location;
}
