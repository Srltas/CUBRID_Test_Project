package com.cubrid.test.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Entity
public class Athlete {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int code;
	
	private String name;
	
	private char gender;
	
	private String nationCode;
	
	private String event;

	@Builder
	public Athlete(int code, String name, char gender, String nationCode, String event) {
		this.code = code;
		this.name = name;
		this.gender = gender;
		this.nationCode = nationCode;
		this.event = event;
	}
	
}
