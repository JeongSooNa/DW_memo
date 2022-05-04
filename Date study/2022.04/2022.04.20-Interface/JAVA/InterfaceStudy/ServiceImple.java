package 인터페이스;

// 서비스를 제공해주는 기능 제공
public interface ServiceImple {
	public abstract void 라면끓이는방법();
	void 찌개끓이는방법(); // public abstract 생략가능.
	
	public static void main(String[] args) {
//		ServiceImple s = new ServiceImple(); //인터페이스화 불가능
	}
}
