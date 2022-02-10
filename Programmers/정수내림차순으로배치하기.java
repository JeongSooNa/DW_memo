package programmers;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
	public static long solution(long n) {
        long answer = 0;
        // log 이용해 len 구하기
        int len = (int)Math.log10(n)+1;
        long arr[] = new long[len];
        // 10제곱으로 나눠 배열에 각 자릿수 입력  
        for(int i=0;i<len;i++) {
        	arr[i] = (long)(n / Math.pow(10, len-i-1)) % 10;
        }
        //정렬
        Arrays.sort(arr);
        //정렬한 수에 10의 각 제곱 곱하여 return값 계산
        for(int i=0;i<len;i++) {
        	answer += arr[i]*Math.pow(10, i);
        }
        return answer;
    }
	
	public static void main(String[] args) {
		solution(118372);
	}
}

// public class 정수내림차순으로배치하기 {
// 	public static long solution(long n) {
//         long answer = 0;
//         int x1 = (int)n;
//         String x2 = Integer.toString(x1);
//         int len=x2.length();
//         String x3[] = new String[len];
//         for(int i=0;i<len;i++) {
//         	x3[i]=x2.substring(i,i+1);
//         }
//         int x4[] = new int[len];
//         for(int i=0;i<len;i++) {
//         	x4[i] = Integer.getInteger(x3[i]);
//         }
        
//         Arrays.sort(x4);
        
//         for(int i=0;i<len;i++) {
//         	x3[i] = Integer.toString(x4[i]);
//         }
//         x2="";
//         for(int i=0;i<len;i++) {
//         	x2 += x3[i];
//         }
//         x1= Integer.parseInt(x2);
//         answer = (long)x1;
//         return answer;
//     }
	
// 	public static void main(String[] args) {
// 		long x=1;
// 		System.out.println(solution(x));
// 	}
// }

// 문자형 이용하면 error long type만으로 해결!

// // 질문입니다!
// // 이것은 왜 오류가 뜨는가.. 라인에러는 아닌데 안됩니다!