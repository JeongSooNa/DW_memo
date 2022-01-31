package programmers;

class 소수만들기{

	public static int solution(int[] nums) {
        int answer = 0;
        int len = nums.length;
        
        
        for(int i=0;i<len;i++) {
        	for(int j=i+1;j<len;j++) {
        		for(int k=j+1;k<len;k++) {
        			int sum = nums[i]+nums[j]+nums[k];
        			for(int l=2;l<sum;l++) {
        				if(sum % l == 0) break;
        				answer++;
        			}
        		}
        	}
        }
        
        return answer;
    }
	
	//main
	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		System.out.println(solution(nums));
	}
}