package programmers;

public class 하샤드수 {
	public static boolean solution(int x) {
	      	boolean answer = true;
	        
	        int mil = x/10000;
	        x = x%10000;
	        int tha = x/1000;
	        x = x%1000;
	        int hun = x/100;
	        x = x%100;
	        int ten = x/10;
	        x = x%10;
	        int sum = mil+tha+hun+ten+x;
	        if(x%sum!=0) answer = false;
	        else answer = true;
	        return answer;
	} // 이렇게 했는데 64점??
	
	public static boolean solution1(int x) {
      	boolean answer = true;
      	
      	String x_1 = Integer.toString(x);
      	int len = 0;
      	if(x<10) len = 1;
      	if(x>=10&&x<100) len = 2;
      	if(x>=100&&x<1000) len = 3;
      	if(x>=1000&&x<10000) len = 4;
      	if(x>=10000) len = 5;
      	String[] x_2 = new String[len];
      	for(int i=0;i<len;i++) {
      		x_2[i] = x_1.substring(i,i+1);
      	}
      	int x_3[] = new int[len];
      	for(int i=0;i<len;i++) {
      		x_3[i] = Integer.parseInt(x_2[i]);
      	}
      	int sum = 0;
      	for(int i=0;i<len;i++) {
      		sum += x_3[i];
      	}
      	if(x%sum==0) answer = true;
      	else answer = false;
        return answer;
	} // 100점!! 문자로 바꿨다가 어캐 막 했는데 100이상의 수가 돌아간다..!
	
	public static void main(String[] args) {
		int x = 132;
		System.out.println(solution1(x));
		
		String sd = "123456";
		System.out.println(sd.substring(1,2));
	}
}
