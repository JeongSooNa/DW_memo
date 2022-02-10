package Programmers;

public class 자릿수더하기 {
	public int solution(int n) {
        int answer = 0;
        int len = (int)Math.log10(n)+1;
        int arr[] = new int[len];
        for(int i=0;i<len;i++) {
        	arr[i] = (int)(n / Math.pow(10, i)) % 10;
        }
        for(int i=0;i<len;i++) {
        	answer += arr[i];
        }
        return answer;
    }
}
