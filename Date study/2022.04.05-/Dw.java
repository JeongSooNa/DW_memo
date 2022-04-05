public class Dw {
	// 항상 class name 앞은 대문자.
	String name; // 학생 이름
	String className; // 과정 이름
	int studentCount; // 학생수

	// 1. 생성자에 parameter없이 필드변수 초기화.
	// getter, setter

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
