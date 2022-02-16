# SDOKU

- java로 sdoku program을 구현하고 싶다.

- 생각 중 찾은 규칙!

> array[2][2][2][2] 행렬을 만든다.

> array[i][j] 각각 4개의 index에는 1~4의 정수값이 들어간다.

> 가장 중요한 규칙!! : 같은 숫자끼리 행렬 index가 중복되지 않는다. (이것 하나로 정의가 가능할까? 아직 모른다. error가 있을수도.)

> 2 * 2 행렬로 적용해 보았을 때 가능하다. 그럼 3 * 3도 되지 않을까?

```java
package memo;

public class sdoku {
	public static void main(String[] args) {
		int array[][][][] = new int[2][2][2][2];
		int min = 1;
		int max = 5;
		int random = (int) ((Math.random() * (max - min)) + min);
		System.out.println(random); // random number
		for(int i=0;i<2;i++) {
			for(int j=0;j<2;j++) {
				for(int k=0;k<2;k++) {
					for(int l=0;l<2;l++) {
						while(true) {
							array[i][j][k][l]= (int)((Math.random() * (max - min)) + min);
							// 와..
							// 여기에 이제 1,2,3,4 가 겹치지 않아야 이어지게 해야하는데..
							// 이게 행렬이 [][][]가 2개뿐이라 [][] 4개를 어떻게 다 비교하지..
							// 큰일이네
							break;
						}
					}
				}
			}
		}
		
		// 여기서부터 행렬 출력 code
		for(int i:array[0][0][0]) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:array[0][0][1]) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		for(int i:array[0][1][0]) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:array[0][1][1]) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		for(int i:array[1][0][0]) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:array[1][0][1]) {
			System.out.print(i);
		}
		System.out.println();
		System.out.println();
		for(int i:array[1][1][0]) {
			System.out.print(i);
		}
		System.out.println();
		for(int i:array[1][1][1]) {
			System.out.print(i);
		}
	}
}

```