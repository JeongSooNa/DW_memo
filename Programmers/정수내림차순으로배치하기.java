package programmers;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
	public static long solution(long n) {
        long answer = 0;
        int x1 = (int)n;
        String x2 = Integer.toString(x1);
        int len=x2.length();
        String x3[] = new String[len];
        for(int i=0;i<len;i++) {
        	x3[i]=x2.substring(i,i+1);
        }
        int x4[] = new int[len];
        for(int i=0;i<len;i++) {
        	x4[i] = Integer.getInteger(x3[i]);
        }
        
        Arrays.sort(x4);
        
        for(int i=0;i<len;i++) {
        	x3[i] = Integer.toString(x4[i]);
        }
        x2="";
        for(int i=0;i<len;i++) {
        	x2 += x3[i];
        }
        x1= Integer.parseInt(x2);
        answer = (long)x1;
        return answer;
    }
	
	public static void main(String[] args) {
		long x=1;
		System.out.println(solution(x));
	}
}

// 질문입니다!
// 이것은 왜 오류가 뜨는가.. 라인에러는 아닌데 안됩니다!