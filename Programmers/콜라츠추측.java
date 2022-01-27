package Programmers;

public class 콜라츠추측 {
	public static int solution(int num) {
        int answer = 0;
        long count = 0;
        while(num!=1) {
        	if(num%2==0) num = num/2;
        	else count = num*3+1;
        	count++;
        }
        if(count>500) return -1;
        answer = (int)count;
        return answer;
    }
    // 어째서 런타임 오류가..
	
	public static void main(String[] args) {
		int x=8;
		System.out.println(solution(x));
	}
}
