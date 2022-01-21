package Programmers;

import java.util.Arrays;

public class 두개뽑아서더하기 {
	
	public static int[] solution(int[] numbers) {
        int array[] = new int[10];
        int len = numbers.length;
        for(int k=0;k<10;k++) {
        	for(int i=0;i<len;i++) {
        		for(int j=i+1;j<len;j++) {
        			array[k] = numbers[i]+numbers[j];
        		}
        	}
        } //뭔가... 바꿔야해 배열이 너무 많이 생겨...
        //중복 제거하기
        int temp = 0;
        for(int i=0;i<10;i++) {
    		for(int j=i+1;j<10;j++) {
    			temp++;
    			if(array[i]==array[j]) temp--;
    		}
    	}
        int answer[] = new int[temp];
        Arrays.sort(answer);
        
        return answer;
    } 
	
	
	
	public static void main(String[] args) {
		int numbers[] = {2,1,3,4,1};
		int result[] = solution(numbers);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
}
