package Programmers;

public class 핸드폰번호가리기 {
	public static String solution(String phone_number) {
        String answer = "";
        String endNum = phone_number.substring(phone_number.length()-4,phone_number.length());
        for(int i=0;i<phone_number.length()-4;i++) {
        	answer += "*";
        }
        
        return answer+endNum;
    }
	
	public static void main(String[] args) {
		String x = "01066723171";
		System.out.println(solution(x));
	}
}
