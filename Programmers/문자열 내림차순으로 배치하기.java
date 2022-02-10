package Programmers;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
	public static String solution(String s) {
        String answer = "";
        int len = s.length();
        String arr[] = new String[len];
        for(int i=0;i<len;i++) {
        	arr[i] = s.substring(i, i+1);
        }
        Arrays.sort(arr);
        for(int i=0;i<len;i++) {
        	answer += arr[len-1-i];
        }
        return answer;
    }
	
	public static void main(String[] args) {
		String x = "Zbcdefg";
		System.out.println(solution(x));
	}
}
