package programmers;

public class 소수찾기 {
	public static int solution(int n) {
        int answer = 0;
        for(int i=2;i<=n;i++) {
        	int tmp=0;
        	for(int j=2;j<=i;j++) {
        		if(i%j==0) tmp++;
        	}
        	if(tmp==1) answer++;
        }
        return answer;
    }
	// 이렇게 하면 무슨 시간초과가..
	
	public static int solution1(int n) {
        int answer = 0;
        int[] array = new int[n];
        for(int i=0;i<n;i++) array[i]=i+1;
        for(int i=1;i<n;i++) {
        	int tmp=0;
        	for(int j=2;j<=array[i];j++) {
        		if(array[i]%j==0) tmp++;
        	}
        	if(tmp==1) answer++;
        }
        return answer;
    }
	// 배열로 해도 시간초과가 뜨는데 코드를 어떻게 줄이거나 간단히 하지..
	
	
	public static void main(String[] args) {
		int x=5;
		System.out.println(solution1(x));
	}
}
