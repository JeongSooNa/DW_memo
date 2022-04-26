package test;

import java.util.ArrayList;
import java.util.List;

class Food{
	private String foodName;
	
	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public void print() {
		System.out.println(this.foodName);
	}
}

public class 긴급점검5 {
	public static void main(String[] args) {
		// 음식이름 : 카레
		// 음식이름 : 칼국수
		// 음식이름 : 전
		List<Food> list = new ArrayList<Food>();
		// List에 Food를 담기 위해서는 먼저 Food가 생성되어야 한다.
		
		Food f1 = new Food();
		f1.setFoodName("김치우동");
		list.add(f1);
		
		Food f2 = new Food();
		f2.setFoodName("우동");
		list.add(f2);		
		
		for(Food i : list) System.out.println(i.getFoodName());
		
		
	}
}
