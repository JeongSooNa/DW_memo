package com.example.first_spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.first_spring.mapper.MainMapper;
import com.example.first_spring.vo.DeptVO;

@Service
public class DeptService {
	@Autowired
	private MainMapper mapper;
	
	public List<DeptVO> getAllDeptList(){
		return mapper.getDeptList();
	}
}
