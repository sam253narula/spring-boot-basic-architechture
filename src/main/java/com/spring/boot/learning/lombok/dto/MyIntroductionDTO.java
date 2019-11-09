package com.spring.boot.learning.lombok.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MyIntroductionDTO {

	String name;
	String experiance;
	String skills;

}
