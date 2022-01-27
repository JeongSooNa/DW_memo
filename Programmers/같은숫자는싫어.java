package Programmers;

public class 같은숫자는싫어 {
	public static int[] solution(int []arr) {
//		배열 arr의 크기(배열 길이) : 1,000,000 이하의 자연수
//		배열 arr의 원소(인덱스 값)의 크기 : 0보다 크거나 같고 9보다 작거나 같은 정수
		
        int len = arr.length;
        int count = 0;
        int check[] = new int[len];  
        for(int i=0;i<len-1;i++) {
        	if(arr[i]==arr[i+1])count++;
        }
        int[] answer = new int[count];
        for(int i=0;i<len-count;i++) {
        	for(int j=0;j<len-1;j++) {
        		if(arr[j]!=arr[j+1]) answer[i]=arr[j];
        		
        	}
        	
        }
        // 이걸 카운트 하면서 이중for문을 돌리거나 해야 되는데..
        
        return answer;
    }
	public static void main(String[] args) {
		int[] arr = {4,4,4,3};
//		int result = solution(arr);
//		System.out.println(result);
	}
}
