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
        int[] array = new int[numbers.length];
        // left=-1 / right=1 로 지정하는 배열 생성
        for(int i=0;i<numbers.length;i++) {
        	if(numbers[i]==1||numbers[i]==4||numbers[i]==7) {
        		array[i]=-1;
        	}
        	if(numbers[i]==3||numbers[i]==6||numbers[i]==9) {
        		array[i]=1;
        	}
        }
        // 2/5/8/0 array 가 0일 때 오른손일까 왼손일까 확인하는 로직 생성
        // ...이걸 어떻게 해
        
        // numbers : 순서대로 누를 번호가 담긴 배열
        // hand : 왼손,오른손 잡이 문자열 ("left" / "right")
        // answer : LRLLLRLLRRL 이런식으로
        
        
        return answer;
    }
	public static void main(String[] args) {
		int[] numbers = {1,3,4,5,8,2,1,4,5,9,5};
		String hand = "right";
		String result = solution(numbers,hand);
		System.out.println(result);
		// L R L L L R L L R! R L
	}
}
