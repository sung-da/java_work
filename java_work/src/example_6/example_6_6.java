// 배열의 요소 수와 개별 요소의 값을 입력받아서 표시하는 프로그램을 작성하시오.
// 표시 형식은 배열 초기값과 같은 형식으로, 각 요소의 값을 쉼표로 연결하고 {}로 감싼 형태로

package example_6;

import java.util.Scanner;

public class example_6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요소 수 : ");
		int cut = sc.nextInt();
		
		int[] a = new int[cut];
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print("a["+i+"] = ");
			int n = sc.nextInt();
			a[i] = n;
		}
		
		System.out.print("a = {");
		if (cut >= 2)
			for(int i = 0 ; i < cut ; i++) {			
				System.out.print( a[i]);
				if (i < cut-1)
					System.out.print(",");
			}
		else if (cut >= 1)
			System.out.print( a[cut-1]);
		System.out.print("}");
		sc.close();
	}

}
