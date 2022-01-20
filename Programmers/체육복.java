package Programmers;

public class 체육복 {
	public int solution(int n, int[] lost, int[] reserve) {
		if(n<2||n>30) return 0;
		int count = 0;
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) {
					count++;
					reserve[j] = n+2;
					break;
				}
			}
		}
		int result = n - lost.length + count;
		return result;
	} // 성공 (65.0점)
	
	//나누어서! 도난당한학생/빌려주는학생
	public int solution1(int n, int[] lost, int[] reserve) {
		if(n<2||n>30) return 0;
		int result = n-lost.length;
		// 도난o,여벌o, 중복x 확인 code (Programmers 에서 영향x)
		if(lost.length==0||lost.length>n) return 0;
		for(int i=0;i<lost.length;i++) {
			for(int j=i+1;j<lost.length;j++) {
				if(lost[i]==lost[j]) return 0;
			}
		}
		if(reserve.length==0||reserve.length>n) return 0;
		for(int i=0;i<reserve.length;i++) {
			for(int j=i+1;j<reserve.length;j++) {
				if(reserve[i]==reserve[j]) return 0;
			}
		}
		
		int count = 0;
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]+1 || lost[i]==reserve[j]-1) {
					count++;
				}
			}
		}
		
		return 0;
	}
}
// https://programmers.co.kr/learn/courses/30/lessons/42862