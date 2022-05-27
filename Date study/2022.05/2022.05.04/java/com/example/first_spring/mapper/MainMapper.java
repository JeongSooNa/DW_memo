package com.example.first_spring.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.first_spring.vo.DeptVO;
import com.example.first_spring.vo.EmpVO;

@Mapper
public interface MainMapper {
	
	/**
	 * @return
	 * comment : emp table 전체 사원 조회
	 */
	public List<EmpVO> getEmpList();
	
	/**
	 * @return
	 * comment : 사원번호가 7499인 사람 이름 조회
	 */
	public EmpVO getEmp();
	/**
	 * @return
	 * comment : dept table 전체 조회
	 */
	public List<DeptVO> getDeptList();
}
