package collections;

import java.util.ArrayList;

public class ArrayList_Study {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<String>();
		// <> : 'Generic' 안에 지정된 data type에 의해 ArrayList 가 결정된다.
		// <> : 안에는 class만 올 수 있다!!
		list.add("시금치 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		list.add("곱창 파스타");
		int len = list.size();
		System.out.println(list);
		System.out.println("길이 : "+len);
		
		String value = list.get(0);
		System.out.println(value);
		value = list.get(1);
		System.out.println(value);
		
		int count = 0;
		for(String i:list) {
			if(i.equals("곱창 파스타")) count++;
		}
		System.out.println("곱창 파스타는 "+count+"개");
		
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		list2.add(10);
		list2.add(40);
		list2.add(60);
		list2.add(80);
		list2.add(30);
		
		int sum = 0;
		int sum2 = 0;
		for(int i : list2) {
			sum += i;
			if(i==40) continue;
			sum2 += i;
		}
		System.out.println("총합 : "+sum);
		System.out.println("평균 : "+(sum/list2.size()));
		System.out.println("40제외 총합 : "+sum2);
		System.out.println("초코송이는 머리가 삐딱해서 귀여워요");
		
		
	}
}
