package 상속;

class Member{
	int count;
	
	public void countCoffee(int count) {
		this.count += count;
	}
	public int memberCount() {
		return this.count;
	}
	public String memberRank() {
		if(this.count>=30) return "골드 회원";
		else if(this.count>=20) return "실버 회원";
		else if(this.count>=10) return "브론즈 회원";
		else return "응애";
	}
}

public class Point {
	public static void main(String[] args) {
		Member alo = new Member();
		
		alo.countCoffee(5);
		System.out.println("몇 잔 먹었어? : "+alo.memberCount()+"잔");
		System.out.println(alo.memberRank());
		
		alo.countCoffee(5);
		System.out.println("몇 잔 먹었어? : "+alo.memberCount()+"잔");
		System.out.println(alo.memberRank());
		
		alo.countCoffee(10);
		System.out.println("몇 잔 먹었어? : "+alo.memberCount()+"잔");
		System.out.println(alo.memberRank());
		
		alo.countCoffee(10);
		System.out.println("몇 잔 먹었어? : "+alo.memberCount()+"잔");
		System.out.println(alo.memberRank());
		
		alo.countCoffee(10);
		System.out.println("몇 잔 먹었어? : "+alo.memberCount()+"잔");
		System.out.println(alo.memberRank());
	}
}
