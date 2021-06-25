// 3개의 정수값을 오름차순(작은순)으로 정렬하는 프로그램을 작성하시오.

package example_3;

import java.util.Scanner;

public class example3_19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		System.out.print("정수 c: ");
		int c = scan.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		
		System.out.println("오름차순 : "+ a + " " + b + " " + c);
		
		scan.close();

	}

}
