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

public class �������7 {
	public static void main(String[] args) {
		List<Lunch> list = new ArrayList<Lunch>();
		// Į����, ���ٶ�ö�� �߰�
		
		Lunch menu1 = new Lunch();
		Lunch menu2 = new Lunch();
		menu1.setFoodName("Į����");
		menu2.setFoodName("���ٶ�ö��");
		list.add(menu1);
		list.add(menu2);
		for(Lunch i : list) System.out.println(i.getFoodName());
	}
}

