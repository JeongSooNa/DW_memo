package Programmers;

public class 문자열내p와y의개수 {
	boolean solution(String s) {
        boolean answer = true;
        int len = s.length();
        int count_p = 0;
        int count_y = 0;
        for(int i=0;i<len;i++) {
        	if(s.substring(i,i+1).toLowerCase().equals("p")) count_p++;
        	if(s.substring(i,i+1).toLowerCase().equals("y")) count_y++;
        }
        if(count_p!=count_y) answer = false;
        return answer;
    }
}
