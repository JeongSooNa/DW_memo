package Programmers;

import java.util.HashSet;
import java.util.Set;

public class 폰켓몬 {
	public static int solution(int[] nums) {
        int answer = 0;
        
        int len1 = nums.length/2;
        Set<Integer> set = new HashSet<>();
        for(int i : nums) {
        	set.add(i);
        }
        // set<> 안에는 중복 데이터가 저장 불가하여. 중복제거에 이용.
        int len2 = set.size();
        answer = len1;
        if(len1>len2) answer = len2;
        return answer;
    }
	
	public static void main(String[] args) {
		int x[] = {3,3,3,2,2,4};
		System.out.println(solution(x));
		
	}
}
