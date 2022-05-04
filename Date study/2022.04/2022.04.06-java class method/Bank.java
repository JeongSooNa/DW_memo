package 상속;

//--- 은행프로그램 개발 ---
//지유는 총 입금금액, 출금금액, 잔고금액을 보고싶다.
//(주)상원IT에 프로그램 개발을 의뢰했다.
//총 입금금액, 출금금액, 잔고금액을 
//확인할 수 있게 해야한다.
//조건)
//출금은 현재잔고보다 많을 수 없다.
//한번 입금할 때 50만원 이하로 할 수 있다.
//입금 시 잔고가 100만원이 넘으면 이자 10%를 지급한다.
class BankLog {
	int money;

	public void inMoney(int money) {
		if (money > 500000) {
			System.out.println("입금은 50만원 이하로 할 수 있습니다.");
			return;
		}
		System.out.println("입금 금액 : " + money + "원");
		this.money += money;
		if (this.money >= 1000000) {
			System.out.println("이자 " + Math.round(this.money * 0.1) + "원이 지급되었습니다.");
			this.money *= 1.1;
		}
	}

	public void outMoney(int money) {
		if (money > this.money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		System.out.println("출금 급액 : " + money + "원");
		this.money -= money;
	}

	public int getMoney() {
		return this.money;
	}

}

public class Bank {
	public static void main(String[] args) {
		BankLog bank = new BankLog();

		bank.inMoney(600000);
		System.out.println("---");

		bank.inMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.inMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.inMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.outMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.outMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.outMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		System.out.println("---");

		bank.outMoney(500000);
		System.out.println("잔고 금액 : " + bank.money + "원");
		
		
		// 총 입금금액, 출금금액도 누적하여 더하려면
		// BankLog class에 입금, 출금 전역변수도 만들어 기록 및 출력한다.
		
	}
}
