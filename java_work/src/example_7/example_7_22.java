/* 배열 z와 같은(요소수가 같고 모든 요소의 값이 같은 배열)을 생성해서 반환하는
 * cloneArray 메서드를 적성하시오.
 * 예) 배열 a의 요소가 {1,2,3,4,5} => 배열b의 요소가 {1,2,3,4,5}
 */

package example_7;

import java.util.Scanner;

public class example_7_22 {
	
	// 배열을 반환
	static int[] cloneArray(int[] x) {
		
		int[] c = new int[x.length];
		for(int i=0 ; i<x.length ;i++) {
			c[i] = x[i];
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요소 수 : ");
		int num = sc.nextInt();			
		
		int[] a = new int[num];
		
		
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
				
		int[] b = cloneArray(a);
		
		System.out.println("배열 a를 복사해서 배열 b를 생성");
		for(int i=0 ; i<num ;i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
