package user_homework_for_interface;

import java.util.List;

/**
 * @author njs
 * @Date 2022. 4. 20.
 * comment : User Logic 처리하는 Class
 */
public class UserService implements UserServiceImple{
    //1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
	@Override
	public List<UserVO> updateSal(List<UserVO> list, String dname) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getDname().equals(dname)) {
				int sal = list.get(i).getSal();
				list.get(i).setSal(sal*2);
			}
		}
		return list;
	}
	
	//2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
	@Override
	public List<UserVO> updateLv(List<UserVO> list) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			int sal = list.get(i).getSal();
			if(sal <= 100) {
				list.get(i).setLv(1);
				continue;
			}
			if(sal <= 1000) {
				list.get(i).setLv(2);
				continue;
			}
			list.get(i).setLv(3);
		}
		return list;
	}
	
	//3. 레벨 3이상 직원을 모두 해고하시오.
	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getLv() >= 3) list.remove(i);
		}
		return list;
	}
	
	//4. 이름이 King인 직원의 모든 정보 조회.
	@Override
	public UserVO selectUserByEname(List<UserVO> list, String ename) {
		// TODO Auto-generated method stub
		UserVO searchName = null;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getEname().equals(ename)) searchName=list.get(i);
		}
		return searchName;
	}
	
}