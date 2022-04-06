package 상속;
//1. apple, person(m)클래스 생성.
//2. apple 클래스에 
//  (int)수량을 나타내는 필드변수!
//3. 사과를 구입하는 메소드,
//   사과를 먹는 메소드
//4. person사과를 10개구매
//   사과를 4개 먹음
//   수량(필드변수) 6개
//   단, 사과를 구매X 먹지못함

class Apple{
	int count;
	
	public int buyApple(int buyCount) {
		this.count += buyCount;
		System.out.println("구매한 사과는 "+buyCount+"개 이고 총 사과 수량은 "+this.count+"개 입니다.");
		return this.count;
	}
	public int eatApple(int eatCount) {
		if(this.count == 0) {
			System.out.println("사과가 없습니다. 못먹지롱 :) ");
			return 0;
		}
		this.count -= eatCount;
		System.out.println("먹은 사과는 "+eatCount+"개 이고 남은 사과 수량은 "+this.count+"개 입니다.");
		return this.count;
	}
}

public class Person {
	public static void main(String[] args) {
		Apple apple = new Apple();
		apple.eatApple(10);
		apple.buyApple(10);
		apple.buyApple(10);
		apple.eatApple(10);
		apple.eatApple(10);
		apple.eatApple(10);
	}
}
