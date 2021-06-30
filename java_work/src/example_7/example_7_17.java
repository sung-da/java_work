/* 배열 a로부터 key와 같은 값을 가지는 요소를 탐색하는 linearSearch 메서도와
 * linearSearchR 메서드를 작성하시오.
 * 단, 키와 같은 값을 가지는 요소가 여러개인 경우, linearSearch는 가장 앞에 위치한 요소를 찾으며,
 * linearSearchR은 가장 뒤에 위치한 요소를 찾을것.
 * 
 * <실행 예>
 * 요소 수 : 6
 * x[0] : 5
 * x[1] : 22
 * x[2] : 74
 * x[3] : 32
 * x[4] : 120
 * x[5] : 22
 * 찾는 값 : 22
 * 해당 값의 요소가 여러개 존재합니다.
 * 가장 앞에 위치한 값은 x[1]에 있습니다.
 * 가장 뒤에 위치한 값은 x[5]에 있습니다. 
 */

package example_7;

import java.util.Scanner;

public class example_7_17 {
	
	static int linearSearch(int key, int[] arr) {
		
		for(int i=0 ; i<arr.length ; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int linearSearchR(int key, int[] arr) {
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			if (arr[i] == key) 
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a로부터 key와 같은 값을 가지는 요소를 탐색");
		
		System.out.print("요소 수 : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0 ; i<num ;i++) {
			System.out.printf("x" + "[%d] = ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("찾는 값 : ");
		int key = sc.nextInt();
		
		int idxTop = linearSearch(key, x);
		int idxBtm = linearSearchR(key, x);
		
		if(idxTop == -1) {
			System.out.println("해당 값의 요소가 존재하지 않습니다.");
		} else if (idxTop == idxBtm) {
			System.out.println("해당 값 x[" + idxTop +"]에 있습니다.");
		} else {
			System.out.println("해당 값의 요소가 여러개 존재합니다.");
			System.out.println("가장 앞에 위치한 값은 :" + idxTop);
			System.out.println("가장 뒤에 위치한 값은 :" + idxBtm);
		}

	}

}
