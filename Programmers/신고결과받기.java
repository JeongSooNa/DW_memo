package Programmers;

public class 신고결과받기 {
	public static int[] solution(String[] id_list, String[] report, int k) {
        int idLen = id_list.length;
        int repLen = report.length;
		int[] answer = new int[id_list.length];
        String[][] array = new String[idLen][repLen];
        for(int i=0;i<idLen;i++) {
        	array[i] = report[i].split(" ");
        }
        
        
        
        
        return answer;
    }
	
	
	public static void main(String[] args) {
		String[] id_list = {"muzi", "frodo", "apeach", "neo"};
		String[] report = {"muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi"};
		int k = 2; //신고 2번 당하면 이용정지
		int[] result = solution(id_list,report,k);
		System.out.println(result);
	}
}
