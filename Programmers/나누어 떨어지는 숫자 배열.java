package Programmers;

import java.util.Arrays;

public class 나누어떨어지는숫자배열 {
	public static int[] solution(int[] arr, int divisor) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) count++;
		}
		int len = count;
		int[] answer = {-1};
		if(len==0) return answer;
		answer = new int[len];
		count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%divisor==0) {
				answer[count]=arr[i];
				count++;
			}
		}
		Arrays.sort(answer);
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
