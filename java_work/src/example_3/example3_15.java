// 키보드에서 입력한 3개의 정수 중 최소값을 구하는 프로그램을 작성하시오.

package example_3;

import java.util.Scanner;

public class example3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		System.out.print("정수 c: ");
		int c = scan.nextInt();
		
		int min = a;
		
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		
		System.out.println("최소값은 "+ min);
		
		scan.close();

	}

}
