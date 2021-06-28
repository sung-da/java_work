/* 배열 a가 가진 모든 요소의 합을 구하는 sumOf() 메서드를 작성하시오.
 * (매개변수로 배열을 사용해서 풀이해 보세요)
 * 
 * <실행 예>
 * 요소수 : 5
 * x[0] : 22
 * x[1] : 5
 * x[2] : 11
 * x[3] : 32
 * x[4] : 120
 * x = [22, 5, 11, 32, 120]
 * 모든 요소의 합은 : 
 */

package example_7;

import java.util.Scanner;

public class example_7_15 {
	
	
	static int sumOf(int[] a) {
		int sum = 0;
		for(int i=0 ; i<a.length ; i++) {
			sum += a[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("배열 a가 가진 모든 요소의 합");
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0 ; i<n ;i++) {
			System.out.printf("a[%d] = ", i);
			a[i] = sc.nextInt();
		}
		
		System.out.print("a = [");
		for(int i=0 ; i<n ; i++) {
			System.out.print(a[i]);
			if (i != n-1)
				System.out.print(",");
		}
		System.out.print("]\n");

		System.out.println("모든 요소의 합은 " + sumOf(a));
		
	}

}
