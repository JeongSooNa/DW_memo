package com.example.first_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first_spring.mapper.MainMapper;
import com.example.first_spring.vo.EmpVO;

@Service
public class EmpService {
	
	@Autowired
	private MainMapper mainMapper;
	
	public List<EmpVO> getAllEmpList(){
		return mainMapper.getEmpList();
	}
	public EmpVO getEmp(){
		return mainMapper.getEmp();
	}
}
