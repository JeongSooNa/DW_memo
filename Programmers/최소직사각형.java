package Programmers;

public class 최소직사각형 {
	public static int solution(int[][] sizes) {
        int answer = 0;
        int len = sizes.length;
        int max1 = 0;
        int max2 = 0;
        for(int i=0;i<len;i++) {
        	int tmp=0;
        	if(sizes[i][0]>sizes[i][1]) {
        		tmp = sizes[i][0];
        		sizes[i][0] = sizes[i][1];
        		sizes[i][1] = tmp;
        	}
        }
        for(int i=0;i<len;i++) {
        	if(max1<sizes[i][0]) max1=sizes[i][0];
        }
        for(int i=0;i<len;i++) {
        	if(max2<sizes[i][1]) max2=sizes[i][1];
        }
        answer = max1*max2;
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
