package final_test;

import java.util.ArrayList;
import java.util.List;

public class EmpService implements EmpServiceImpl{

	@Override
	public List<EmpVO> getEmpList(List<EmpVO> list) {
		for(EmpVO vo : list) vo.setSal(vo.getSal()+EmpCode.SPECIAL_BONUS);
		return list;
	}

	@Override
	public EmpVO getEmp(List<EmpVO> list) {
		int maxSal = 0;
		EmpVO result = null;
		for(EmpVO vo : list) {
			if(vo.getSal()>maxSal) {
				maxSal = vo.getSal();
				result = vo;
			}
		}
		return result;
	}

	@Override
	public int getCount(List<EmpVO> list, int sal) {
		int count = 0;
		for(EmpVO vo : list) {
			if(vo.getSal() <= sal) count++;
		}
		return count;
	}

	@Override
	public EmpVO setDept(EmpVO empVO) {
		DeptVO dept = new DeptVO(10, "SALES");
		List<DeptVO> deptList = new ArrayList<DeptVO>();
		deptList.add(dept);
		empVO.setList(deptList);
		return empVO;
	}

}