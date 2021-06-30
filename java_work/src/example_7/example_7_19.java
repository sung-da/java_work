/* 배열 a의 요소 a[idx]에 x를 삽입하는 insertArray() 메서드를 작성하시오.
 * 삽입 시에는 a[idx] ~ a[a.length-2] 를 하나씩 뒤로 이동시켜야 한다.
 * 예) 배열 a의 요소가 {1,3,4,7,9,11} 일 때,
 *     인덱스 2에 99값을 입력하면 {1,3,99,4,7,9} 
 */

package example_7;

import java.util.Scanner;

public class example_7_19 {
	
	static void insertArray(int[] a, int idx, int num) {

		if(idx >= 0 && idx< a.length) {					// 배열 내 존재한 인덱스 값이 아닌 경우 예외처리
			for(int i=a.length-1 ; i>idx ; i--) {		
				a[i] = a[i - 1];						
			}
			a[idx] = num;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a에 삽입");
		
		System.out.print("요소 수 : ");	//값을 입력
		int num = sc.nextInt();			// 배열의 개수를 정수형으로 저장
		
		int[] a = new int[num]; 		// 배열 a를 입력받은 num 개수로 선언
		
		
		// 앞서 선언한 배열의 공간에 값을 입력
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("삽입할 요소의 인덱스 : ");
		int idx = sc.nextInt();			// 배열에서 삽입 할 인덱스 값
		System.out.print("삽입할 값 : ");
		int input = sc.nextInt();			// 배열에 삽입 할 값
		
		// 인수로 a배열과 삽입 할 인덱스와 값, 리턴값은 없어도 됨.
		insertArray(a, idx, input);
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
