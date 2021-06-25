// 2개의 정수값을 입력받아 두 정수 사이에 있는 모든 정수값
// 작은 수부터 큰 순으로 표시하는 프로그램을 작성하시오.

package example_4;

import java.util.Scanner;

public class example_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = scan.nextInt();
		
		System.out.print("정수 b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a + " ");
			a = a +1;
		} while (a <= b);

	}

}
