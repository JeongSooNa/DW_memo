package Programmers;

public class 하샤드수 {
	public boolean solution(int x) {
        boolean answer = true;
        
        int mil = x/10000;
        int tha = x/1000;
        int hun = x/100;
        int ten = x/10;
        int one = x%10;
        int sum = mil+tha+hun+ten+one;
        if(x%sum!=0) answer = false;
        
        return answer;
    }
}
