package programmers;

public class 정수제곱근판별 {
	public static long solution(long n) {
        long answer = 0;
        for(long i=1;i<=n;i++) {
        	if(n==i*i) {
        		answer=(i+1)*(i+1);
        		break;
        	}
        	else answer=-1;
        }
        return answer;
    }
	
	public static void main(String[] args) {
		long x=1;
		System.out.println(solution(x));
	}	
}
