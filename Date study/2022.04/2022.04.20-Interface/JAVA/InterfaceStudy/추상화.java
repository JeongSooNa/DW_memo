package 인터페이스;

abstract class Chef{ // 추상 class
	// 추상 Method를 정의할 수 있다.
	public void 요리를하다() { // 일반 Method
		
	}
	// 목적 : 오버라이딩(Overriding)
	abstract public void 비법을전수하다(); // 추상 Method
}
class Food extends Chef{
	// Food가 Overriding하면 Food class는 인스턴스화(new호출)할 수 없다.
	@Override
	public void 비법을전수하다() {
		// 로직구현
		
	} // 추상 Method는 오버라이딩 무조건 사용                                                                                                                                                                                                                                                                                            
	
}

public class 추상화 {
	
	public static void main(String[] args) {
		Food f = new Food();
	}
}
