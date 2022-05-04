package com.example.first_spring.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DeptVO {
	private int deptno;
	private String dname;
	private String loc;
	
	public DeptVO() {
		
	}
}