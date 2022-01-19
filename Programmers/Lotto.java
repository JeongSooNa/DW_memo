package Programmers;

public class Lotto {
	public static int[] solution(int[] lottos, int[] win_nums){
		int collect = 0;
		int count = 0;
		int len = win_nums.length;
		for(int i=0;i<len;i++) {
			for(int j=0;j<len;j++) {
				if(lottos[i]==0) {
					count++;
					break;
				}
				if(lottos[i]==win_nums[j]) collect++;
			}
		}
		int answer2 = (len+1)-collect-0;
		if(answer2==len+1) --answer2;
		int answer1 = (len+1)-collect-count;
		int answer[]= {answer1,answer2};
		return answer;
	}
	public static void main(String[] args) {
		int[] lottos1 = {44,1,0,0,31,25};
		int[] win_nums1 = {31,10,45,1,6,19};
		int[] lottos2 = {0,0,0,0,0,0};
		int[] win_nums2 = {38,19,20,40,15,25};
		int[] lottos3 = {45,4,35,20,3,9};
		int[] win_nums3 = {20,9,3,45,4,35};
		int test1[] = solution(lottos1,win_nums1);
		System.out.println(test1[0]+", "+test1[1]);
		int test2[] = solution(lottos2,win_nums2);
		System.out.println(test2[0]+", "+test2[1]);
		int test3[] = solution(lottos3,win_nums3);
		System.out.println(test3[0]+", "+test3[1]);
	}
	
}
