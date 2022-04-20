package user_homework_for_interface;

import java.util.ArrayList;
import java.util.List;

public class MainController{
    public static void main(String args[]){
        
        List<UserVO> list = new ArrayList<UserVO>();
        list.add(new UserVO("Alex","DEVELOP",200));
        list.add(new UserVO("Max","DEVELOP",80));
        list.add(new UserVO("Brian","DEVELOP",100));
        list.add(new UserVO("mr.Hyun","MANAGER",300));
        list.add(new UserVO("Allen","DEVELOP",110));
        list.add(new UserVO("Katter","DEVELOP",220));
        list.add(new UserVO("Hooker","MANAGER",1500));
        list.add(new UserVO("King","MASTER",0));

        //���⼭ ���� Ǯ ��
        UserService service = new UserService();
        
        //1. �μ��̸��� DEVELOP�� ��� �޿��� 2�� �λ��Ͻÿ�.
        System.out.println("**1");
        service.updateSal(list, "DEVELOP");
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getSal());
        }
        //2. �޿��� 0 ~ 100 : 1 ����, 101 ~ 1000 : 2 ����, 1001 �̻���ʹ� 3 ������ �����Ͻÿ�.
        System.out.println("**2");
        service.updateLv(list);
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getLv());
        }
        //3. ���� 3�̻� ������ ��� �ذ��Ͻÿ�.
        System.out.println("**3");
        service.deleteUser(list, 3);
        for(int i=0;i<list.size();i++) {
        	System.out.println(list.get(i).getEname());
        }
        //4. �̸��� King�� ������ ��� ���� ��ȸ.
        System.out.println("**4");
        UserVO king = service.selectUserByEname(list, "King");
        System.out.println(king.getEname());
        System.out.println(king.getDname());
        System.out.println(king.getSal());
        System.out.println(king.getLv());
        
        	
    }
}