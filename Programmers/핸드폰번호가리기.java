package Programmers;

public class 핸드폰번호가리기 {
	public static String solution(String phone_number) {
        String answer = "";
        int cutNum = 4;
        int len = phone_number.length();
        // 사용할 상수를 알아보기 쉽게 변수로 지정해주기!
        String endNum = phone_number.substring(len-cutNum,len);
        for(int i=0;i<len-cutNum;i++) {
        	answer += "*";
        }
        
        return answer+endNum;
    }
	
	public static void main(String[] args) {
		String x = "01066723171";
		System.out.println(solution(x));
	}
}
