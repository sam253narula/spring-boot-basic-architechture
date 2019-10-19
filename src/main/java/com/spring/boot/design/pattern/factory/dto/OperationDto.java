package com.spring.boot.design.pattern.factory.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class OperationDto {

	String type;
	int a;
	int b;
	int result;
}
