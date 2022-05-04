package test;

import java.util.ArrayList;
import java.util.List;

class FruitVO{
	private String fruitName;

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
}

class FruitService{
	public FruitVO getFruit(List<FruitVO> list, String fruitName) {
		for(FruitVO vo : list) {
			if(vo.getFruitName().equals(fruitName)) return vo;
		}
		return null;
	}
}

public class Fruit {
	public static void main(String[] args) {
		List<FruitVO> list = new ArrayList<FruitVO>();
		FruitVO vo1 = new FruitVO();
		vo1.setFruitName("포도");
		list.add(vo1);
		FruitVO vo2 = new FruitVO();
		vo2.setFruitName("수박");
		list.add(vo2);
		FruitVO vo3 = new FruitVO();
		vo3.setFruitName("참외");
		list.add(vo3);
		FruitService f = new FruitService();
		String answer = f.getFruit(list, "수박").getFruitName();
		System.out.println(answer);
	}
}
