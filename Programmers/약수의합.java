package Programmers;

public class 약수의합 {
	public static int solution(int n) {
        int answer = 0;
        int array[] = new int[n];
        for(int i=1;i<=n;i++) {
        	if(n%i==0) array[i-1]=i;
        }
        for(int i=0;i<n;i++) {
        	answer += array[i];
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
