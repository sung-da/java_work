// 배열의 요소를 입력받아 특정 값을 가지는 요소를 찾으시오.
// 동일값의 요소가 여러개 있으면 가장 앞에 위치한 요소를 찾는 프로그램을 작성하시오.
// 동일값의 요소가 여러개 있으면 가장 뒤에 위치한 요소를 찾는 프로그램을 작성하시오.

package example_6;

import java.util.Scanner;

public class example_6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i< n ; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("찾는 숫자 : ");
		int f = sc.nextInt();
		/*
		for(int i =0 ; i<n ; i++) {
			if(a[i] == f) {
				System.out.print("찾는 숫자는 a["+i+"]에 있습니다.");
				break;
			}
		}
		*/
		for(int i = n-1; i >= 0 ; i--) {
			if(a[i] == f) {
				System.out.print("찾는 숫자는 a["+i+"]에 있습니다.");
				break;
			}
		}

		sc.close();
	}

}
