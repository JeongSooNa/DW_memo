// String형 배열 seoul의 element중 "Kim"의 위치 x를 찾아, 
// "김서방은 x에 있다"는 String을 반환하는 함수, solution을 완성하세요. 
// seoul에 "Kim"은 오직 한 번만 나타나며 잘못된 값이 입력되는 경우는 없습니다.
// seoul은 길이 1 이상, 1000 이하인 배열입니다.
// seoul의 원소는 길이 1 이상, 20 이하인 문자열입니다.
// "Kim"은 반드시 seoul 안에 포함되어 있습니다.

package Programmers;

public class 서울에서김서방찾기 {
	public static String solution(String[] seoul) {
		String answer = "";
		int result = 0;
		for(int i=0;i<seoul.length;i++) {
			if(seoul[i].equals("Kim")) result = i;
			// .equals 로 안하고 == 으로 해서 Programmers에서 오류..
		}
		String x = String.valueOf(result);
		// Integer.toString(result)
		answer = "김서방은 "+x+"에 있다"; 
		//여기서 문제가 있는데...
		return answer;

		
		// 이걸.. 문제를 이중배열인줄 알았네.....
//		String[][] array1 = new String[seoul.length][2];
//		for(int i=0;i<seoul.length;i++) {
//			seoul[i] = seoul[i].replace(" ",""); 
//			array1[i] = seoul[i].split(",");
//			if(array1[i][0]=="Kim") answer = "김서방은 0에 있다";
//			if(array1[i][1]=="Kim") answer = "김서방은 1에 있다";
//		}
	}
	
	//Main
	public static void main(String[] args) {
		String[] seoul = {"Jane","Kim"};
		String kim = solution(seoul);
		System.out.println(kim);
		
		// 이건 되는데....왜 +String+ 하면 String으로 받지 않을까..
		int y = 1;
		String x = Integer.toString(y);
		System.out.println(x);
		
	}
}
