package 스태틱;

public class Chef {
	private static Chef chef = null; // static으로 선언된 class 변수
	public static Chef getInstance() {
		if(chef == null) {
			chef = new Chef();
		}
		return chef;
	}
	
	public void printHello() {
		System.out.println("Hello World");
	}
}
