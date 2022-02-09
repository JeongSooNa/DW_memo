package Programmers;

public class 가운데글자가져오기 {
	public String solution(String s) {
        String answer = "";
        int len = s.length(); 
        if(len%2==1) answer = s.substring(len/2, len/2+1);
        else answer = s.substring(len/2-1,len/2+1);
        return answer;
    }
}
