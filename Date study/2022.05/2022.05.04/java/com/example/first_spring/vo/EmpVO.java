package com.example.first_spring.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class EmpVO {
	private int empno;
	private String ename;
	private String job;
	
	public EmpVO() {
		
	}
}
