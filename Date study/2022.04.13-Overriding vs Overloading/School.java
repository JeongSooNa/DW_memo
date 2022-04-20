package 상속2;

class Study{
	String parents = "백앤드";
	public void doStudy(String subjects) {
		System.out.println(subjects+"를 공부하다.");
	}
	public void doSleep() {
		System.out.println("꿀잠을 자다 zzzZ");
	}
}

class StudentA extends Study{ // extends Object 포함
	String subjects = "JAVA";
	public void doStudy() {
		System.out.println("JAVA를 공부하다.");
	}
}

class StudentB extends Study{
	public void doStudy() {
		System.out.println("SQL을 공부하다.");
	}
}

class StudentC extends Study{
	// 어노테이션
	@Override
	public void doSleep() {
		System.out.println("저는 열심히 공부합니다!");
	} // 부모 class의 Method를 재정의
	
	public void doStudy() {
		System.out.println("CSS를 공부하다.");
	}
	// Overloading
	public void doStu(String value) {
		System.out.println(value+"를 공부하다.");
	}
	public void doStu(String value1, String value2) {
		System.out.println(value1+"와 "+value2+"를 공부하다.");
	}
}

public class School {
	public static void main(String[] args) {
		// 방법 1.
		StudentA a = new StudentA();
		StudentB b = new StudentB();
		StudentC c = new StudentC();
		a.doStudy();
		// 방법 2. 
		new StudentA().doStudy();
		new StudentB().doStudy();
		new StudentC().doStudy();
		// 문제점 : 같은 기능을 하는 메소드가 중복됨.
		// 해결책 : 상속을 이용해서 중복된 코드 제거.
		a.doStudy(a.subjects); 	// 부모의 Method 사용
		a.doStudy(a.parents);	// 부모의 필드변수 사용
		// 어노테이션
		a.doSleep();
		c.doSleep(); // 부모 class의 기능은 @Override로 변경
	}
}

