package arrayList;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class Wonsoju extends Object{ // 모든 class는 Object를 상속받는다.(Default)
	
}


public class Hash_Study {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();
		list2 = new LinkedList<String>(); // 다음과 같이 type변경 가능.
		HashMap<String, Object> map = new HashMap<String, Object>();
		Map<String, Object> map2 = new HashMap<String, Object>();
		// HashMap에는 key, value 두 개가 옴.
		// Object 개념 이해하기
		// HashMap Value에 Object를 입력하는 이유!
		// Value에 어떤 값(데이터타입)이 올지 예상 불가능.
		// 그래서 Object로 데이터타입을 모두 받는다.
		// 마찬가지의 이유로 List = ArrayList 하는 이유는
		// type 변경 및 입력을 용이하게 하기 위해서.
		map.put("1","참이슬"); // HashMap input data
		map.put("2", "처음처럼");
		map.put("a", "한라산");
		map.put("b", 13);
		System.out.println(map); // json type으로 출력
		
		Wonsoju won = new Wonsoju();
		
		// 문제1. 한라산 출력하기
		System.out.println(map.get("a"));
		
		
	}
}

