package Programmers;

public class 부족한금액계싼하기 {
	public long solution(int price, int money, int count) {
        long answer = -1;
        long pay = price;
        long price1 = (long)price;
        long money1 = (long)money;
        for(long i=2;i<=count;i++) price1 += pay*i;
        if(price1>money1) answer=price1-money1;
        else answer = 0;
        return answer;
    }
	// int형 변수를 long type으로 바꾸어주어야 100점.
}
