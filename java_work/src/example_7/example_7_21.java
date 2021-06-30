/* 배열 a와 배열 b의 전체 요소값을 교환하는 exchangeArray() 매서드르르 작성하시오.
 * 두 배열의 요소 수가 같지 않다면 작은 쪽의 배열에 수에 맞추어 교환하시오.
 * 예> 배열 a의 요소가 {1,2,3,4,5,6,7}이고 배열의 요소가 {5,4,3,2,1}일 때, 
 * 		배열 a{5,4,3,2,1,6,7}이 되고 배열b는 {1,2,3,4,5}가 됩니다.
 * 
 * <실행 예>
 */

package example_7;

import java.util.Scanner;

public class example_7_21 {
	
	static void exchangeArray(int[] a, int[] b) {
		
		int n;
		if(a.length < b.length)
			n = a.length;
		else
			n = b.length;
		
		for(int i=0 ; i<n ; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
		
//		if (a.length > b.length) {
//			for(int i=0 ; i<b.length ; i++) {
//				int temp = a[i];
//				a[i] = b[i];
//				b[i] = temp;
//			}
//		} else {
//			for(int i=0 ; i<a.length ; i++) {
//				int temp = a[i];
//				a[i] = b[i];
//				b[i] = temp;
//			}
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("배열 a의 요소 수 : ");
		int Anum = sc.nextInt();			
		
		int[] a = new int[Anum]; 	
		
		// 앞서 선언한 배열의 공간에 값을 입력
		for(int i=0 ; i<Anum ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		
		System.out.print("배열 b의 요소 수 : ");	
		int Bnum = sc.nextInt();		
		
		int[] b = new int[Bnum]; 		
		
		// 앞서 선언한 배열의 공간에 값을 입력
		for(int i=0 ; i<Bnum ;i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}
		
		exchangeArray(a,b);
		
		System.out.println("배열 a와 b의 전체 요소를 교환");
		for(int i=0 ; i<Anum ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for(int i=0 ; i<Bnum ;i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
