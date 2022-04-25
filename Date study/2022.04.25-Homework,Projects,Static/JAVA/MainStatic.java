package 스태틱;

public class MainStatic {
	public static void main(String[] args) {
		// Instance화
		StaticStudy stat1 = new StaticStudy();
		System.out.println(stat1.count); // int 초깃값 : 0
		stat1.count++;
		System.out.println(stat1.count);
		
		StaticStudy stat2 = new StaticStudy();
		System.out.println(stat2.count); // 초깃값이 아닌 기존 값으로 나옴.(공유)
		// 결론 : static은 변수, Method를 공유하여 사용한다.
		// key point : 값이 바뀌지 않는 변수를 주로 static으로 공유해 사용.
		// example)
		// 병원 진단코드, 질병코드
		
		// static으로 선언된 변수, Method는 인스턴스화(new)를 안해도 사용할 수 있다.
		System.out.println(StaticStudy.GAMGI);
		
		Chef.getInstance(); // Instance화가 된 Method를 static으로 공유.
		Chef c = Chef.getInstance();
		// 여러 class에서 instance화는 반복해 사용하면
		// Heap영역에 저장공간이 부족해 서버다운 발생.
		c.printHello();
	}
}
