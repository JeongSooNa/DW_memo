package 삽입정렬;

public class InsertionSort {
	public static void main(String[] args) {
		int array[] = {8,5,6,2,4};
		for(int i=0;i<array.length-1;i++) {
			for(int j=i;j>=0;j--) {
				int tmp = 0;
				if(array[j]>array[j+1]) {
					tmp = array[j];
					array[j]=array[j+1];
					array[j+1]=tmp;
				}
				else break;
			}
		}
		for(int i : array) System.out.println(i);
	}
}
