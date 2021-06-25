// 2개의 정수값을 내림차순(큰거 -> 작은거)으로 정렬하는 프로그램을 작성하시오(함수사용X)
// a, b -> a변수에 큰값, b변수에 작은값 할당
// a = 1, b = 2  -> a = 2, b = 1
// a = 2, b = 1  -> a = 2, b = 1

package example_3;

import java.util.Scanner;

public class example3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("큰 값 : " + a);
		System.out.println("작은 값 : " + b);
		
		scan.close();

	}

}
