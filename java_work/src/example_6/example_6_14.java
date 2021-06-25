// 배열의 a의 모든 요소를 역순으로 배열 b에 복사하는 프로그램을 작성하시오.
// 두 배열의 요소수는 동일하다고 가정해도 좋음

package example_6;

import java.util.Scanner;

public class example_6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요수 수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		
		for(int i= 0 ; i<n ; i++ ) {
			b[i] = a[n-1-i];
		}
		
		for (int i = 0 ; i <n ; i++) {
			System.out.println("b["+i+"] = " + b[i]);
		}
		sc.close();

	}

}
