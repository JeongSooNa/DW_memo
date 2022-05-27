package listAndMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EmpVO{
	private int empno;
	private String ename;
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
}

class 햄버거{
	private String 햄버거이름;
	private int 햄버거가격;
	private String 매장이름;
	public String get햄버거이름() {
		return 햄버거이름;
	}
	public String get매장이름() {
		return 매장이름;
	}
	public void set매장이름(String 매장이름) {
		this.매장이름 = 매장이름;
	}
	public void set햄버거이름(String 햄버거이름) {
		this.햄버거이름 = 햄버거이름;
	}
	public int get햄버거가격() {
		return 햄버거가격;
	}
	public void set햄버거가격(int 햄버거가격) {
		this.햄버거가격 = 햄버거가격;
	}
}

public class 긴급점검50 {
	// List와 Map을 알아보자!
	public static void main(String[] args) {
		 
		// 컬렉션즈에서는 class만 받는다.
		ArrayList<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		// ArrayList 의 부모class는 List이므로 위와 같이 사용.
		list2.add("hello");
		list2.add("world");
		// spring 개발 시 Mybatis에서 add를 자동으로 해준다!
		
		List<햄버거> list3 = new ArrayList<햄버거>();
		
		// 다음 과정을 Mybatis에서 해준다.
		햄버거 불고기버거 = new 햄버거();
		불고기버거.set햄버거이름("불고기버거");
		불고기버거.set햄버거가격(3000);
		불고기버거.set매장이름("짱짱버거");
		list3.add(불고기버거);
		//
		System.out.println(list3.get(0).get햄버거이름());
		System.out.println(list3.get(0).get햄버거가격());
		System.out.println(list3.get(0).get매장이름());
		// 제네릭 안에 컬렉션도 class이기 때문에 포함가능!
		List<ArrayList<String>> list4 = new ArrayList<ArrayList<String>>();
		
		System.out.println("---");
		//
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("햄버거이름", "둘이먹다하나죽으면슬픈버거");
		map.put("햄버거가격", 2000);
		map.put("매장이름", "짱짱버거");
		System.out.println(map.get("햄버거이름"));
		System.out.println(map.get("햄버거가격"));
		System.out.println(map.get("매장이름"));
		
		// mapList에 map을 add하시오.
		Map<String, Object> map1 = new HashMap<String, Object>();
		map1.put("햄버거이름", "빅맥버거");
		map1.put("햄버거가격", 4500);
		map1.put("매장이름", "맥도리아");
		Map<String, Object> map2 = new HashMap<String, Object>();
		map2.put("햄버거이름", "싸이버거");
		map2.put("햄버거가격", 4000);
		map2.put("매장이름", "맘스땃치");
		Map<String, Object> map3 = new HashMap<String, Object>();
		map3.put("햄버거이름", "데리버거");
		map3.put("햄버거가격", 3500);
		map3.put("매장이름", "롯데날드");
		
		
		List<Map<String,Object>> mapList = new ArrayList<Map<String,Object>>();
		mapList.add(map1);
		mapList.add(map2);
		mapList.add(map3);
		System.out.println("---대표 햄버거---");
		System.out.println(mapList.get(0));
		System.out.println(mapList.get(1));
		System.out.println(mapList.get(2));
		
		// EmpVO를 담는 list
		// VO를 사용
		List<EmpVO> empList = new ArrayList<EmpVO>();
		EmpVO index1 = new EmpVO();
		index1.setEmpno(17);
		index1.setEname("나정수");
		empList.add(index1);
		System.out.println(empList.get(0).getEmpno());
		System.out.println(empList.get(0).getEname());
		// Map을 사용
		List<Map<String, Object>> empMapList = new ArrayList<Map<String, Object>>();
		Map<String, Object> info1 = new HashMap<String, Object>();
		info1.put("empno", 17);
		info1.put("ename", "나정수");
		empMapList.add(info1);
		System.out.println(empMapList.get(0));
		
		
	}
}


