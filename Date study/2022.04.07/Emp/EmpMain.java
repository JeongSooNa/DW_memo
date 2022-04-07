package collections;

import java.util.ArrayList;

public class EmpMain {
	public static void main(String[] args) {
		
		ArrayList<EmpVO> list = new ArrayList<EmpVO>();
		list.add(new EmpVO(7369,"SMITH","CLERK","1980-12-17",800,20,0));
		list.add(new EmpVO(7499,"ALLEN","SALESMAN","1981-02-20",1600,30,300));
		list.add(new EmpVO(7521,"WARD","SALESMAN","1981-02-22",1250,30,500));
		list.add(new EmpVO(7566,"JONES","MANAGER","1981-04-02",2975,20,0));
		list.add(new EmpVO(7654,"MARTIN","SALESMAN","1981-09-28",1250,30,1400));
		list.add(new EmpVO(7698,"BLAKE","MANAGER","1981-05-01",2850,30,0));
		list.add(new EmpVO(7782,"CLARK","MANAGER","1981-06-09",2450,10,0));
		list.add(new EmpVO(7788,"SCOTT","ANALYST","1987-06-28",3000,20,0));
		list.add(new EmpVO(7839,"KING","PRESIDENT","1981-11-17",5000,10,0));
		list.add(new EmpVO(7844,"TURNER","SALESMAN","1981-09-08",1500,30,0));
		list.add(new EmpVO(7876,"ADAMS","CLERK","1987-07-13",1100,20,0));
		list.add(new EmpVO(7900,"JAMES","CLERK","1981-12-03",950,30,0));
		list.add(new EmpVO(7902,"FORD","ANALYST","1981-12-03",3000,20,0));
		list.add(new EmpVO(7934,null,"CLERK","1982-01-23",1300,10,0));
		
		// 1.
		System.out.println("	**사원이름, 사원번호 조회**");
		for(EmpVO vo : list) {
			System.out.print("사원번호 : "+vo.empno+" / ");
			System.out.println("사원이름 : "+vo.ename);
		}
		
		// 2.
		System.out.println("	**급여가 1300 이상인 직원 이름, 직업 조회**");
		for(EmpVO vo : list) {			
			if(vo.sal >= 1300) {
				System.out.print("사원이름 : "+vo.ename+" / ");
				System.out.println("직업 : "+vo.job);
			}
		}
		
		// 3.
		System.out.println("	**직업이 SALESMAN인 사원 중 급여가 1400달러 이상 받는 사원의 번호, 이름 조회**");
		for(EmpVO vo : list) {
			if(vo.job.equals("SALESMAN")&&vo.sal>=1400) {
				System.out.print("사원이름 : "+vo.ename+" / ");
				System.out.println("직업 : "+vo.job);
			}
		}
		
		// 4.
		System.out.println("	**입사년도가 1981년도인 사원의 번호, 이름 조회**");
		for(EmpVO vo : list) {
			// String hiredate = vo.hiredate.split("-")[0];
			// split을 통해 새로운 배열을 만들어 날짜를 년/월/일 별로 저장해 풀이도 가능.
			if(vo.hiredate.substring(0,4).equals("1981")) {
				System.out.print("사원이름 : "+vo.ename+" / ");
				System.out.println("직업 : "+vo.job);
			}
		}
		
		// 5.
		System.out.println("	**직업이 MANAGER인 사원 수 조회**");
		int count = 0;
		for(EmpVO vo : list) {
			if(vo.job.equals("MANAGER")) count++;
		}
		System.out.println("MANAGER 사원 수 : "+count+"명");
		
		// 6.
		System.out.println("	**사원 중 급여를 가장 많이 받는 사원의 번호, 이름, 입사년도 조회**");
		int max = 0;
		int maxIndex = 0;
		for(int i=0;i<list.size();i++) {
			if(list.get(i).sal>max) {
				max = list.get(i).sal;
				maxIndex = i;
			}
		}
		System.out.print("사원번호 : "+list.get(maxIndex).empno+" / ");
		System.out.print("사원이름 : "+list.get(maxIndex).ename+" / ");
		System.out.println("입사년도 : "+list.get(maxIndex).hiredate);
		
		// 7.
		System.out.println("	**부서번호별 수 조회 ex)20:2명,30:3명**");
		int count20 = 0;
		int count30 = 0;
		for(EmpVO vo : list) {
			if(vo.deptno==20) count20++;
			if(vo.deptno==30) count30++;
		}
		System.out.println("부서20 : "+count20+"명");
		System.out.println("부서30 : "+count30+"명");
		
		// 8.
		System.out.println("	**입사월이 02월인 사원 수 조회**");
		int count02 = 0;
		for(EmpVO vo : list) {
			// String hiredate = vo.hiredate.split("-")[1];
			if(vo.hiredate.substring(5,7).equals("02")) count02++;
		}
		System.out.println("2월입사 : "+count02+"명");
		
		//1. comm을 받은 사원 수와 직업,이름을 조회하시오.
		System.out.println("	**comm을 받은 사원 수와 직업,이름을 조회하시오.**");
		int countComm = 0;
		for(EmpVO vo : list) {
			if(vo.comm>0) {
				countComm++;
				System.out.print("직업 : "+vo.job+" / ");
				System.out.println("사원이름 : "+vo.ename);
			}
		}
		System.out.println("보너스를 받은 사람"+countComm+"명");
		
		//2. emp에 있는 급여 평균을 구하시오.
		System.out.println("	**emp에 있는 급여 평균을 구하시오.**");
		int sumSal = 0;
		for(EmpVO vo : list) {
			sumSal += vo.sal;
		}
		System.out.println("급여평균 : "+(sumSal/list.size())+"$");
		
		//3. 사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.
		System.out.println("	**사원번호가 7844, 7876인 사원에게 comm 200을 지급하시오.**");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).empno==7844 ||list.get(i).empno==7876) {
				System.out.print(list.get(i).comm+" -> ");
				list.get(i).comm += 200;
				System.out.println(list.get(i).comm);
			}
		}
		
		//4. 사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오.
		System.out.println("	**사원이름이 null인 사원이름에 '데이터 없음' 으로 수정하시오.**");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).ename==null) {
				list.get(i).ename="데이터없음";
				System.out.println(list.get(i).ename);
			}
		}
		
		//5. 20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.
		System.out.println("	**20번 부서가 올해 실적이 좋지 않습니다. 20번부서를 모두 해고(제거) 하십시오.**");
		for(int i=0;i<list.size();i++) {
			if(list.get(i).deptno==20) list.remove(i);
		}
		for(EmpVO vo : list) {
			System.out.print("사원번호 : "+vo.empno+" / ");
			System.out.println("부서번호 : "+vo.deptno);
		}
	}
}
