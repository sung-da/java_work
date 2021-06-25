// 배열의 나열 순서를 섞는(임의의 순서가 되도록 순서를 바꿈) 프로그램을 작성하시오.
/*
<결과>
요소수 : 3
a[0] = 22
a[1] = 57
a[2] = 11
a[3] = 32
요소를 섞었음
a[0] = 22
a[1] = 32
a[2] = 57
a[3] = 11

반복
1.2개의 요소를 선택
2.값을교환
*/

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요수 수 : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n*2 ; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		for (int i = 0 ; i <n ; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		sc.close();

	}

}
