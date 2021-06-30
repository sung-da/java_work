/* 배열 a로부터 요소 a[idx]를 삭제하는 aryRmv 메서드를 작성하시오.
 * a[idx]의 삭제 후, 그 뒤에 있는 요소들을 앞으로 하나씩 이동하시오.
 * 이동 후에 비게되는 마지막 요소 a[a.length-1]의 값은 이동하기 전의 마지막 값을 유지하시오.
 * 예) 배열 a의 요소가 {1,3,4,7,9,11} 일 때,
 *     3값(인덱스 1)을 삭제하면 {1,4,7,9,11,11}
 * 
 * <실행 예>
 * 요소 수 : 6
 * a[0] : 1
 * a[1] : 3
 * a[2] : 4
 * a[3] : 7
 * a[4] : 9
 * a[5] : 11
 * 삭제할 요소의 인덱스 : 2
 * a[0] : 1
 * a[1] : 4
 * a[2] : 7
 * a[3] : 9
 * a[4] : 11
 * a[5] : 11
 */

package example_7;

import java.util.Scanner;

public class example_7_18 {
	
	// 매개변수 : a배열, 삭제할 인덱스
	// 리턴값 : 없음
	// 함수 동작 : 삭제할 요소의 인텍스에 다음 인덱스의 값을 입력, 배열의 마지막 인덱스 전까지
	static void aryRmv(int[] a, int idx) {
		
		if(idx >= 0 && idx< a.length) {					// 배열 내 존재한 인덱스 값이 아닌 경우 예외처리
			for(int i=idx ; i<a.length-1 ; i++) {		// 인덱스 ~ 마지막 인덱스 전까지
				a[i] = a[i + 1];						// 다음 인덱스에 해당하는 값을 앞의 인덱스 위치에 입력
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a로부터 요소 a[idx]를 삭제");
		
		System.out.print("요소 수 : ");	//값을 입력
		int num = sc.nextInt();			// 배열의 개수를 정수형으로 저장
		
		int[] a = new int[num]; 		// 배열 a를 입력받은 num 개수로 선언
		
		
		// 앞서 선언한 배열의 공간에 값을 입력
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("삭제할 요소의 인덱스 : ");
		int idx = sc.nextInt();			// 배열에서 삭제할 인덱스 값
		
		
		// 인수로 a배열과 삭제할 인덱스, 리턴값은 없어도 됨.
		aryRmv(a, idx);
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		

	}

}
