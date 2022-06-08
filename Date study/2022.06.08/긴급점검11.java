package test;

import java.util.ArrayList;
import java.util.List;

class Pizza{
	public String pizzaName;
	public int pizzaMoney;
}

public class 긴급점검11 {
	public static void main(String[] args) {
		// for문 vs for-each
		
		// for문
		System.out.println("***for문");
		for(int i=0; i<10 ;i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		// for-each문
		System.out.println("***for-each문");
		int arr[] = {10,20};
		for(int i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		List<Pizza> pizzaList = new ArrayList<Pizza>();
		
		Pizza p1 = new Pizza();
		p1.pizzaName = "불고기피자";
		p1.pizzaMoney = 1000;
		
		Pizza p2 = new Pizza();
		p2.pizzaName = "불고기치즈피자";
		p2.pizzaMoney = 2000;
		
		pizzaList.add(p1);
		pizzaList.add(p2);
		
		// 문제1. for문을 이용해 Pizza이름과 가격을 출력!
		System.out.println("***for문을 이용해 Pizza이름과 가격을 출력!");
		for(int i=0; i<pizzaList.size(); i++) {
			System.out.println(pizzaList.get(i).pizzaName);
			System.out.println(pizzaList.get(i).pizzaMoney);
		}
		// 문제2. for-each문을 이용해 Pizza이름과 가격을 출력!
		System.out.println("***for-each문을 이용해 Pizza이름과 가격을 출력!");
		for(Pizza vo : pizzaList) {
			System.out.println(vo.pizzaName);
			System.out.println(vo.pizzaMoney);
		}
		
		// 문제
		System.out.println("***국밥출력");
		List<String> list = new ArrayList<String>();
		list.add("콩나물국밥");
		list.add("소머리국밥");
		for(String s : list) {
			System.out.println(s);
		}
		
	}
}
