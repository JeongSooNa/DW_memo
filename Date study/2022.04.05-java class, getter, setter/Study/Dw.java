package 상속;

public class Dw {
	// 항상 class name 앞은 대문자.
	String name; // 학생 이름
	String className; // 과정 이름
	int studentCount; // 학생수

	// 1. 생성자에 parameter없이 필드변수 초기화.
	// getter, setter
	public Dw() {
		
	}
	// 오버로딩 : 메소드 이름은 동일, 파라미터(매개변수, 인자)는 다르게.
	public Dw(String name,String className, int studentCount) {
		// 생성자 이름은 class 이름과 동일.
		// return type이 없다.
		this.name = name;
		this.className = className;
		this.studentCount = studentCount;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	public int getStudentCount() {
		return studentCount;
	}

	public void setStudentCount(int studentCount) {
		this.studentCount = studentCount;
	}
}
