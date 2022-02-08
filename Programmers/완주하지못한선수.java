package Programmers;

import java.util.Arrays;

public class 완주하지못한선수 {
	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        int len=participant.length;
        int array[] = new int[len];
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len-1;j++) {
        		if(participant[i].equals(completion[j])) {
        			array[i]++;
        		}
        	}
        }
        for(int i=0;i<len;i++) {
        	if(array[i]==0) {
        		return participant[i];
        	}
        }
        // 여기에 동면이인 중 탈락자가 있다는 코드를 작성.
        for(int i=0;i<len;i++) {
        	if(array[i]==1) continue;
        	int count1 = 0;
        	for(int j=0;j<len-1;j++) {
        		if(participant[i].equals(completion[j])) count1++;
        	}
        	if(array[i]!=count1) answer=participant[i];
        }
        
        return answer;
    }
	
	public static String solution1(String[] participant, String[] completion) {
        String answer = "";
        // 0이면 그게 탈락자
        int len=participant.length;
        int array[] = new int[len];
        /*for(int i=0;i<len;i++) {
        	for(int j=0;j<len-1;j++) {
        		if(participant[i].equals(completion[j])) {
        			array[i]++;
        		}
        	}
        }
        for(int i=0;i<len;i++) {
        	if(array[i]==0) {
        		return participant[i];
        	}
        }*/ // 아래만 돌려도 성공.(효율성) 
        // 아닐때
        Arrays.sort(participant);
        Arrays.sort(completion);
        String comp[] = new String[len];
        comp[len-1]=null;
        for(int i=0;i<len-1;i++) {
        	comp[i]=completion[i];
        }
        // 이제 여기다 for문으로 서로 다를 때 추룰.
        for(int i=0;i<len;i++) {
        	if(!participant[i].equals(comp[i])) {
        		answer=participant[i];
        		break;
        	}
        }
        return answer;
    }
	
	public static void main(String[] args) {
		
	}
}
