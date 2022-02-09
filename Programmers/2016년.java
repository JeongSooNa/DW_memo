package Programmers;

public class _2016년 {
	public static String solution(int a, int b) {
        String answer = "";
        int mon[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int count=0;
        for(int i=0;i<a-1;i++) count += mon[i];
        count += b;
        if(count%7==1) answer="FRI";
        else if(count%7==2) answer="SAT";
        else if(count%7==3) answer="SUN";
        else if(count%7==4) answer="MON";
        else if(count%7==5) answer="TUE";
        else if(count%7==6) answer="WED";
        else answer="THU";
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
