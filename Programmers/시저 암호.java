package Programmers;

public class 시저암호 {
	public static String solution(String s, int n) {
        String answer = "";
        String low[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String upp[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        int len = s.length();
        String arr[] = new String[len];
        for(int i=0;i<len;i++) {
        	for(int j=0;j<26;j++) {
        		if(s.substring(i,i+1).equals(low[j])) {
        			arr[i]=low[(j+n)%26];
        			break;
        		}
        		else if(s.substring(i,i+1).equals(upp[j])) {
        			arr[i]=upp[(j+n)%26];
        			break;
        		}
        		else arr[i]=s.substring(i,i+1);
        	}
        }
        for(String i : arr) answer +=i;
        return answer;
    }
	public static void main(String[] args) {
		// ASCCI CODE로 풀고싶은데 어렵네
		char x = 'a';
		int y = (int)x;
		System.out.println(x);
		System.out.println(y);
		
		String s = "A Bcz";
		System.out.println(s.substring(2,3));
		System.out.println(solution(s, 1));
	}
}
