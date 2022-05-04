package test;

import java.util.ArrayList;
import java.util.List;

class Lunch{
	private String foodName;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}
	
}

public class 긴급점검7 {
	public static void main(String[] args) {
		List<Lunch> list = new ArrayList<Lunch>();
		// 칼국수, 스바라시라멘 추가
		
		Lunch menu1 = new Lunch();
		Lunch menu2 = new Lunch();
		menu1.setFoodName("칼국수");
		menu2.setFoodName("스바라시라멘");
		list.add(menu1);
		list.add(menu2);
		for(Lunch i : list) System.out.println(i.getFoodName());
	}
}

