package Programmers;

public class 키패드누르기 {
//	* 엄지손가락은 상하좌우 4가지 방향으로만 이동할 수 있으며
//	  키패드 이동 한 칸은 거리로 1에 해당합니다.
//	* 왼쪽 열의 3개의 숫자 1, 4, 7을 입력할 때는 왼손 엄지손가락을 사용합니다.
//	* 오른쪽 열의 3개의 숫자 3, 6, 9를 입력할 때는 오른손 엄지손가락을 사용합니다.
//	* 가운데 열의 4개의 숫자 2, 5, 8, 0을 입력할 때는
//	  두 엄지손가락의 현재 키패드의 위치에서 더 가까운 엄지손가락을 사용합니다.
//	* 만약 두 엄지손가락의 거리가 같다면, 오른손잡이는 오른손 엄지손가락,
//	  왼손잡이는 왼손 엄지손가락을 사용합니다.
	public static String solution(int[] numbers, String hand) {
        String answer = "";
        // start line
        
        // hand 쉽게 바꾸기
        if(hand.equals("right")) hand="R";
        if(hand.equals("left")) hand="L";
        // 1,2,...을 [0,0]배열처럼 만들기 위해 key생성
        int[][] key = {{3,1},{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        int[][] k = new int[numbers.length][2];
        for(int i=0;i<numbers.length;i++) {
        	k[i] = key[numbers[i]];
        }
        // 문자를 담을 배열도 생성
        String[] rl = new String[numbers.length];
        // for 문으로 오른손/왼손 가려내기
        // 먼저 좌/우 손의 현재 위치를 나타내는 변수 생성
        int[] left = {3,0};
        int[] right = {3,2};
        for(int i=0;i<numbers.length;i++) {
        	//왼손
        	if(k[i][1]==0) {
        		rl[i]="L";
        		left=k[i];
        	}
        	//오른손
        	else if(k[i][1]==2) {
        		rl[i]="R";
        		right=k[i];
        	}
        	//가운데열이라 골라야 할 때
        	else {
        		int lLength = Math.abs(k[i][0]-left[0])+Math.abs(k[i][1]-left[1]);
        		int rLength = Math.abs(k[i][0]-right[0])+Math.abs(k[i][1]-right[1]);
        		if(lLength>rLength) {
        			rl[i]="R";
        			right=k[i];
        		}
        		if(lLength<rLength) {
        			rl[i]="L";
        			left=k[i];
        		}
        		if(lLength==rLength) {
        			rl[i]=hand;
        			if(hand.equals("R"))right=k[i];
        			if(hand.equals("L"))left=k[i];
        		}
        	}
        }
        for(int i = 0;i<rl.length;i++) {
        	answer += rl[i];
        }
        
        // finish line
        return answer;
    }
	
	
	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		System.out.println(solution(numbers,hand));
	}
}
