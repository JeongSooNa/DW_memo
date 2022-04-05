package 상속;

public class 붕어빵장사 {
	public static void main(String[] args) {
		붕어빵 boong1 = new 붕어빵("팥", 10);
		System.out.println("붕어빵종류 : "+boong1.붕어빵종류);
		System.out.println("붕어빵수량 : "+boong1.붕어빵수량+"개");
		
		System.out.println();
		
		붕어빵 boong2 = new 붕어빵();
		boong2.붕어빵종류 = "슈크림";
		boong2.붕어빵수량 = 15;
		System.out.println("붕어빵종류 : "+boong2.붕어빵종류);
		System.out.println("붕어빵수량 : "+boong2.붕어빵수량+"개");
	}
}
