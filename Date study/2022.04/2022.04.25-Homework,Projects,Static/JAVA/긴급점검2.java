package test;

class Dw{
	String className;
	String studentName;
	
	public Dw(String className, String studentName) {
		this.className = className;
		this.studentName = studentName;
	}
}

public class 긴급점검2 {
	
	public static Dw printStudent() {
		return new Dw("스마트웹&앱과정", "홍길동");
	}
	
	public static void main(String[] args) {
		System.out.println("결과 화면");
		System.out.println();
		System.out.println("클래스이름 : "+printStudent().className+", 학생이름 : "+printStudent().studentName);
	}
}
