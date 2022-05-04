package classStudy;

public class Home {

	public static void main(String[] args) {
		String name = "나";
		String className = "java";
		int studentCount = 15;
		Dw dw1 = new Dw();
		dw1.setName(name);
		dw1.setClassName(className);
		dw1.setStudentCount(studentCount);
		System.out.println("이름 : "+dw1.getName());
		System.out.println("과정 이름 : "+dw1.getClassName());
		System.out.println("학생 수 : "+dw1.getStudentCount());
		
		System.out.println();
		
		Dw dw2 = new Dw("정수", "반응형 웹&앱 개발",10); // 인스턴스화 하다.(파일을 불러오다.)
		// name, className, studentCount 무조건 set 해야하는 이슈.
		System.out.println(dw2.name);
		System.out.println(dw2.className);
		System.out.println(dw2.studentCount);
		
		Dw dw3 = null;
		if(dw3 == null) {
			dw3 = new Dw();
		}
	}

}

