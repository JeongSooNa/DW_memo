package user_homework_for_interface;

import java.util.List;

public class UserService implements UserServiceImple{
    //1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
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
	
	//2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
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
	
	//3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
	@Override
	public List<UserVO> deleteUser(List<UserVO> list, int lv) {
		// TODO Auto-generated method stub
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getLv() >= 3) list.remove(i);
		}
		return list;
	}
	
	//4. �̸��� King�� ������ ��� ���� ��ȸ.
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