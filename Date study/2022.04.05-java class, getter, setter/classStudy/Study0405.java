package classStudy;

class Pizza{
    int money; // 전역변수(필드변수) 생성
    // 필드변수(전역변수)는 자동으로 값이 초기화되어있다.(java특징)
	// 클래스 파일을 만들면 디폴트 생성자가 생성!
    // 생성자는 return type을 정의하지 않는다.
    // 생성자는 값을 초기화하는게 목적. ***
    public int getMoney(){
        // 함수는 파라미터 값을 받아서 결과를 처리하는게 목적
        return 0;
    }
    public Pizza(int x) { // 생성자(return type이 없는 함수)
        this.money = x; // 여기서 this는 상위 Pizza class를 의미
    }
}
public class Study0405 {
	// .java file에는 public class가 한 개만 올 수 있다.
	public static void main(String[] args) {
		System.out.println("Hello World!");
        Pizza p = new Pizza(10); // java특징x 객체지향언어 특징o
        p = new Pizza(30);
        System.out.println(p.money);
        // 생성자(메소드)호출

        // 1. 클래스도 Data Type
        // 2. 생성자 vs 일반함수(메소드)
        // 3. 클래스 파일 생성
        // new를 이용해서 클래스를 호출할 때 생성자가 자동으로 호출됨.
	}
}