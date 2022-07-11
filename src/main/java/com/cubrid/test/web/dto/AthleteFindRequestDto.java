package com.cubrid.test.web.dto;

import com.cubrid.test.domain.Athlete;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class AthleteFindRequestDto {
	
	private int code;
	private String name;
	private char gender;
	private String nationCode;
	private String event;
	
	@Builder
	public AthleteFindRequestDto(int code, String name, char gender, String nationCode, String event) {
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.nationCode = nationCode;
		this.event = event;
	}
	
	public Athlete toEntity() {
		return Athlete.builder()
				.code(code)
				.name(name)
				.gender(gender)
				.nationCode(nationCode)
				.event(event)
				.build();
	}
	
}
