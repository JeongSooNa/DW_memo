package Programmers;

public class 평균구하기 {
	public double solution(int[] arr) {
        double answer = 0;
        
        int len = arr.length;
        double sum = 0;
        for(int i=0;i<len;i++) {
        	sum += arr[i];
        }
        answer = sum / len;
        
        return answer;
    }
}
