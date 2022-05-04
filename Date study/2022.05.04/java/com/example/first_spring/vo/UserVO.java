package com.example.first_spring.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

// @Data
@Getter
@Setter
@AllArgsConstructor 
public class UserVO { // VO = DTO
	private String name;
	private int age;
	private String addr;
	
	public UserVO() {
		
	}
}