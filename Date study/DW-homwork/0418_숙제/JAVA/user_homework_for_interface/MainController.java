package user_homework_for_interface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author njs
 * @Date 2022. 4. 20.
 * comment : 출력하는 Main Controller Class
 */
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

        //여기서 문제 풀 것
        UserServiceImple service = new UserService();
        
        //1. 부서이름이 DEVELOP인 사원 급여를 2배 인상하시오.
        System.out.println("**1");
        service.updateSal(list, "DEVELOP");
        for(int i=0;i<list.size();i++) {
        	System.out.println("사원이름 : "+list.get(i).getEname()+" / 부서이름 : "+list.get(i).getDname()+" / 직원급여 : "+list.get(i).getSal()+" / 직원레벨 : "+list.get(i).getLv());
        }
        //2. 급여가 0 ~ 100 : 1 레벨, 101 ~ 1000 : 2 레벨, 1001 이상부터는 3 레벨로 수정하시오.
        System.out.println("**2");
        service.updateLv(list);
        for(int i=0;i<list.size();i++) {
        	System.out.println("사원이름 : "+list.get(i).getEname()+" / 부서이름 : "+list.get(i).getDname()+" / 직원급여 : "+list.get(i).getSal()+" / 직원레벨 : "+list.get(i).getLv());
        }
        //3. 레벨 3이상 직원을 모두 해고하시오.
        System.out.println("**3");
        service.deleteUser(list, 3);
        for(int i=0;i<list.size();i++) {
        	System.out.println("사원이름 : "+list.get(i).getEname()+" / 부서이름 : "+list.get(i).getDname()+" / 직원급여 : "+list.get(i).getSal()+" / 직원레벨 : "+list.get(i).getLv());
        }
        //4. 이름이 King인 직원의 모든 정보 조회.
        System.out.println("**4");
        UserVO king = service.selectUserByEname(list, "King");
        System.out.println("사원이름 : "+king.getEname()+" / 부서이름 : "+king.getDname()+" / 직원급여 : "+king.getSal()+" / 직원레벨 : "+king.getLv());
        
        	
    }
}