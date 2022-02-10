package Programmers;

public class 문자열을정수로바꾸기 {
	public static int solution(String s) {
        int answer = 0;
        answer = Integer.parseInt(s);
        return answer;
    }
	
	public static void main(String[] args) {
		String x = "-2";
		System.out.println(solution(x));
	}
}
