package Programmers;

public class 최대공약수와최소공배수 {
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int nNum[] = new int[n-1];
        int mNum[] = new int[m-1];
        for(int i=1;i<n;i++) {
        	if(n%i==0) {
        		nNum[i-1] =i;
        	}
        }
        for(int i=1;i<m;i++) {
        	if(m%i==0) {
        		mNum[i-1] =i;
        	}
        }
        for(int i=0;i<n-1;i++) {
        	System.out.println(nNum[i]);
        }
        for(int i=0;i<n-1;i++) {
        	for(int j=0;j<m-1;j++) {
        		if(nNum[i]==mNum[j] && nNum[i]!=0) answer[0]=nNum[i];
        	}
        }
        
        
        
        
        return answer;
    }
	// 소인수분해 로직을 짜야하나...
	
	//main
	public static void main(String[] args) {
		int n=3;
		int m=12;
		System.out.println(solution(n, m)[0]);
		System.out.println(solution(n, m)[1]);
	}
}
