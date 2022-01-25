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
	public static int solution1(int n, int[] lost, int[] reserve) {
		// 여분있는 학생이 도난
		// stu[] 에 -1,0,1
		int stu[] = new int[n];
		int count = 0;
		for(int l : lost) stu[l-1]--;
		for(int r : reserve) stu[r-1]++;
		
		for(int i=0;i<lost.length;i++) {
			for(int j=0;j<reserve.length;j++) {
				if(lost[i]==reserve[j]-1 || lost[i]==reserve[j]+1) {
					stu[lost[i]-1]++;
					stu[reserve[j]-1]--;
					reserve[j] = -2;
					break;
				}
			}
		}
		for(int i : stu) {
			if(i >= 0) count++;
		}

		
		return count; 
	} //성공 80점....
	
	public static void main(String[] args) {
		int n = 10;
		int[] lost = {1,3,5,9};
		int[] reserve = {4,8};
		int result = solution1(n,lost,reserve);
		System.out.println(result);
	}
}
// https://programmers.co.kr/learn/courses/30/lessons/42862