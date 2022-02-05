package programmers;

public class 콜라츠추측 {
	public static int solution(int num) {
        int answer = 0;
        long num1 = (long)num;
        while(num1!=1) {
        	if(num1%2==0) num1 = num1/2;
        	else num1 = num1*3+1;
        	answer++;
        }
        if(answer>500) return -1;
        return answer;
    }
    // n이 int형일 때 n=626331 일 경우 숫자범위를 벗어나 long형으로 type을 바꿔줘야함. 
	
	public static void main(String[] args) {
		int x=626331;
		System.out.println(solution(x));
	}
}
