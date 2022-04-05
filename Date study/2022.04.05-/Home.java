public class Home {

	public static void main(String[] args) {
		String name = "나정수";
		String className = "java";
		int studentCount = 15;

		Dw dw = new Dw();
		dw.setName(name);
		dw.setClassName(className);
		dw.setStudentCount(studentCount);
		System.out.println("이름 : "+dw.getName());
		System.out.println("과정 이름 : "+dw.getClassName());
		System.out.println("학생 수 : "+dw.getStudentCount());
	}

}
