package Programmers;

public class 모의고사 {
	public int[] solution(int[] answers) {
        int len = answers.length;
        int first[] = {1,2,3,4,5};
        int second[] = {2,1,2,3,2,4,2,5};
        int third[] = {3,3,1,1,2,2,4,4,5,5};
        int count[] = new int[3];
        // 맞춘 갯수 count 배열에 입력
        for(int i=0;i<len;i++) {
        	if(answers[i]==first[i%5]) count[0]++;
        	if(answers[i]==second[i%8]) count[1]++;
        	if(answers[i]==third[i%10]) count[2]++;
        }
		int max = 0;
		// 최다 득점 점수 확인
		for(int i=0;i<3;i++) {
			if(max<count[i]) max=count[i];
		}
		// return할 배열의 길이 구하기
		int count_num = 0;
		for(int i=0;i<3;i++) {
			if(max==count[i]) count_num++;
		}
		int[] answer = new int[count_num];
		// return할 배열에 수포자 입력
		for(int i=0;i<3;i++) {
			if(max==count[i]) answer[i]=i+1;
		}
        return answer;
    }
}
