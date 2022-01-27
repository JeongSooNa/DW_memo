package Programmers;

public class 행렬의덧셈 {
	public int[][] solution(int[][] arr1, int[][] arr2) {
        int len = arr1.length;
        int jlen = arr1[0].length;        
		int[][] answer = new int[len][jlen];
		for(int i=0;i<len;i++) {
			for(int j=0;j<jlen;j++) {
				answer[i][j]=arr1[i][j]+arr2[i][j];
			}
		}
        return answer;
    }
}
