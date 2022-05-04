package ���3;

import java.util.ArrayList;
import java.util.List;

class UserVO{
	private String name;
	private int sal; //�޿�
	
	public UserVO(String name, int sal){
		this.name = name;
		this.sal = sal;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSal() {
		return sal;
	}

	public void setSal(int sal) {
		this.sal = sal;
	}
}

class MainUtil{
	
	public List<UserVO> getAllUsers(List<UserVO> list){ //��ü ���� ȣ��
		for(int i=0;i<list.size();i++) System.out.print(list.get(i).getName()+" ");
		System.out.println();
		return list;
	}
	
	public String getUser(List<UserVO> list, String name){ //Ư�� ���� ȣ��
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getName().equals(name)) return name+"�� ���³�";
		}
		return name+"�� ����.";
	}
	
	public List<UserVO> deleteUser(List<UserVO> list, int index){ //Ư�� ���� ����
		list.remove(index);
		return list;
	}
	
	public int getUserTotalSal(List<UserVO> list){ // �޿� �� ���
		int sum = 0;
		for(int i=0;i<list.size();i++) sum += list.get(i).getSal();
		return sum;
	}
	
}
public class MainService extends MainUtil{
	
	public static void main(String[] args) {
		List<UserVO> list = new ArrayList<UserVO>();
		list.add(new UserVO("SMITH", 100));
		list.add(new UserVO("BRIAN", 300));
		list.add(new UserVO("ALLEN", 600));
		list.add(new UserVO("KING", 2000));
		MainService main = new MainService();
		
		//���� MainUtil�Լ��� �̿��ؼ� ����Ǯ ��.
		
		//1. ��ü ���� ȣ��
		System.out.println("1. ��ü ���� ȣ��");
		main.getAllUsers(list);
		
		//2. Ư�� ���� ȣ��
		System.out.println("2. Ư�� ���� ȣ��");
		System.out.println(main.getUser(list, "SMITH"));
		System.out.println(main.getUser(list, "SMTH"));
		
		//3. Ư�� ���� ����
		System.out.println("3. Ư�� ���� ����");
		main.deleteUser(list, 0);
		main.getAllUsers(list);
		
		//4. ��� ���� �޿� �� ���ϱ�
		System.out.println("4. ��� ���� �޿� �� ���ϱ�");
		System.out.println(main.getUserTotalSal(list)); // 3������ index 0 �� ������ ���� ��� ��
	}
}