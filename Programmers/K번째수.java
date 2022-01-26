package Programmers;

import java.sql.Array;
import java.util.Arrays;

public class K번째수 {
	
	public static int[] solution(int[] array, int[][] commands) {
		int[] answer = new int[commands.length];
		int[][] com = commands;
		for(int i=0;i<commands.length;i++) {
			com[i][0] = commands[i][0]-1;
			com[i][1] = commands[i][1]-1;
			com[i][2] = commands[i][2]-1;
		}
		for(int i=0;i<commands.length;i++) {
			int[] arr = new int[com[i][1]-com[i][0]+1];
			for(int j=0;j<arr.length;j++) {
				arr[j]=array[com[i][0]+j];
			}
			Arrays.sort(arr);
			answer[i]=arr[com[i][2]];
		}
        return answer;
        //  100점!!!!!!!!
        
        /*
		int i0 = commands[0][0]-1;
		int j0 = commands[0][1]-1;
		int k0 = commands[0][2]-1;
		int i1 = commands[1][0]-1;
		int j1 = commands[1][1]-1;
		int k1 = commands[1][2]-1;
		int i2 = commands[2][0]-1;
		int j2 = commands[2][1]-1;
		int k2 = commands[2][2]-1;
		int array0[] = new int[j0-i0+1];
		int array1[] = new int[j1-i1+1];
		int array2[] = new int[j2-i2+1];
		for(int i=i0;i<=j0;i++) {
			array0[i-i0]=array[i];
		}
		for(int i=i1;i<=j1;i++) {
			array1[i-i1]=array[i];
		}
		for(int i=i2;i<=j2;i++) {
			array2[i-i2]=array[i];
		}
		//정렬 
		
		Arrays.sort(array0);
		Arrays.sort(array1);
		Arrays.sort(array2);
		answer[0] = array0[k0];
		answer[1] = array1[k1];
		answer[2] = array2[k2];
         */
        // 성공은 했는데 런타임error로 0점...
    }
	
	
	public static void main(String[] args) {
		int[] array = {1,5,2,6,3,7,4};
		int i0 = 2;
		int j0 = 5;
		int k0 = 3;
		int i1 = 4;
		int j1 = 4;
		int k1 = 1;
		int i2 = 1;
		int j2 = 7;
		int k2 = 3;
		int commands[][] = {{i0,j0,k0},{i1,j1,k1},{i2,j2,k2}};
		int result[] = solution(array,commands);
		System.out.println(result[0]);
		System.out.println(result[1]);
		System.out.println(result[2]);
		
		
		
	}
}
