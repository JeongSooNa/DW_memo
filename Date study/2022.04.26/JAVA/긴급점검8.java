package test;

import java.util.ArrayList;
import java.util.List;

class Chef{
	private int chefAge;

	public int getChefAge() {
		return chefAge;
	}

	public void setChefAge(int chefAge) {
		this.chefAge = chefAge;
	}
	
}

public class 긴급점검8 {
	public static List<Chef> getChefList(){
		List<Chef> list = new ArrayList<Chef>();
		Chef c1 = new Chef();
		Chef c2 = new Chef();
		Chef c3 = new Chef();
		Chef c4 = new Chef();
		c1.setChefAge(30);
		c2.setChefAge(40);
		c3.setChefAge(50);
		c4.setChefAge(60);
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		return list;
	}
	
	public static int getChefListCount(List<Chef> list) {
		int count = 0;
		for(Chef i : list) { 
			if(i.getChefAge() >= 50) count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		List<Chef> list = getChefList();
		System.out.println(getChefListCount(list));
	}
}
