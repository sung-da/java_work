// 입력받은 정수값부터 0까지 카운트다운하는 프로그램을 작성하라.
// 카운트다운 종료 후의 변수값을 확인할 수 있도록 프로그램하세요.

package example_4;

import java.util.Scanner;

public class example_4_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 입력 : ");
		int n = scan.nextInt();
		
		do {
			System.out.println(n);
			n = n -1;
		} while(n >= 0);

	}

}
