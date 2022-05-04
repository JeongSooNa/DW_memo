package 상속;

class Parents{
	public void 공부하다(String language) {
		System.out.println(language+" 공부 중");
	}
}

class Student_A extends Parents{
	public void a() {
		공부하다("JAVA");
	}
}
class Student_B extends Parents{
	public void b() {
		공부하다("SQL");
	}
}
class Student_C extends Parents{
	public void c() {
		공부하다("HTML");
	}
}

public class School {
	public static void main(String[] args) {
		Student_A studyA = new Student_A();
		Student_B studyB = new Student_B();
		Student_C studyC = new Student_C();
		studyA.a();
		studyB.b();
		studyC.c();
	}
}
