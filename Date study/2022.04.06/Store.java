package 상속;

class StoreSub{
	int money;
	
	public int sumMoney(int money) {
		int sum = this.money += money;
		return sum;
	}
}

public class Store {
	
	public static void main(String[] args) {
		StoreSub s = new StoreSub();
		// 실무에서는 필드변수를 아래와 같이 직접 접근하지 않는다.
//		s.money = 100;
//		s.money += 100;
//		System.out.println(s.money);
		
		// 실무에서는 아래와 같이 사용.
		int result = s.sumMoney(100);
		System.out.println(result);
		result = s.sumMoney(100);
		System.out.println(result);
		
	}
}
