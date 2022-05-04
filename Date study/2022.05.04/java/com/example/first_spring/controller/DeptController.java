package com.example.first_spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.first_spring.service.DeptService;
import com.example.first_spring.vo.DeptVO;

@RestController
public class DeptController {
	@Autowired
	private DeptService deptService;
	
	@GetMapping("/dept")
	public List<DeptVO> callEmpList(){
		return deptService.getAllDeptList();
	}
}
