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
	
	// 다시 이해! 여벌이 있는 학생도 도난당했을 경우 생각!!!
	
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
	public int solution1(int n, int[] lost, int[] reserve) {
		// 여분있는 학생이 도난
		// stu[] 에 -1,0,1
		int stu[] = new int[n];
		for(int l : lost) stu[l-1]--;
		for(int r : reserve) stu[r-1]++;
		for(int i : lost) {
			for(int j : reserve) {
				if(lost[i]==reserve[j]) reserve[j] = -1;
			}
		}
		for(int i : lost) {
			for(int j : reserve) {
				
			}
		} // 이게 아닌데.............
		
		return 0;
	}
	//( 인데 배열만들어서 해보자)

}
// https://programmers.co.kr/learn/courses/30/lessons/42862