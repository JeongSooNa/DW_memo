package programmers;

public class 최대공약수와최소공배수 {
	public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        int[] n1 = new int[n];
        int[] m1 = new int[m];
        for(int i=1;i<=n;i++) {
        	if(n%i==0) n1[i-1]=i;
        }
        for(int i=1;i<=n;i++) {
        	if(m%i==0) m1[i-1]=i;
        }
        for(int i : n1) {
        	for(int j : m1) {
        		if(i==j && (i!=0||j!=0)) answer[0]=i;
        	}
        }
        answer[1]=n*m/answer[0];
        
        return answer;
    }
	//  최소공배수 = n * m / 최대공약수
	
	//main
	public static void main(String[] args) {
		int n=3;
		int m=12;
		System.out.println(solution(n, m)[0]);
		System.out.println(solution(n, m)[1]);
	}
}
