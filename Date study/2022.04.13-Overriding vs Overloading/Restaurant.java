package 상속2;

class Manager{
	public Manager() {
		System.out.println("hello world!");
	}
	
	public int 급여를주다(int 월급){
		return 월급;
	}
	public String 요리를하다(String 식자재){
		return 식자재;
	}
}
class Chef extends Manager{
	public Chef() {
		// super는 부모class의 생성자를 의미!
		super(); // super라는 Method가 Default로 생성
	}
	
	@Override // 안써도 Default로 적용되나 적어주자!
	public int 급여를주다(int 월급){
		return 월급*3;
	}
	public String 요리를하다(String 식자재){
		return 식자재;
	}
	public String 요리를하다(String 식자재, String 비밀소스){
		return 식자재+비밀소스;
	}
}
public class Restaurant {
	public static void main(String[] args) {
		Chef chef = new Chef();
		System.out.println(chef.급여를주다(3));
	}
}