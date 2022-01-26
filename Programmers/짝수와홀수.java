package Programmers;

public class 짝수와홀수 {
	public String solution(int num) {
        String answer = "";
        if(num>=0) {
        	if(num%2==0) answer="Even";
        	if(num%2==1) answer="Odd";
        }
        return answer;
    }
}
