package Programmers;

public class X만큼간격이있는n개의숫자 {
	public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long temp = x;
        for(int i=0;i<n;i++) {
        	answer[i] += temp;
        	temp += x;
        }
        return answer;
    }
}
