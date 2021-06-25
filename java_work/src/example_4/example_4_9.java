// 양의 정수값을 읽어서 입력받은 숫자의 자리수를 출력하는 프로그램을 작성하시오.
// while문

package example_4;

import java.util.Scanner;

public class example_4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		/*
		int ret = 1;
		while (ret == 1) {
			System.out.print("양의 정수값 : ");
			int n = scan.nextInt();

			if (n > 0) {
				String len = Integer.toString(n);
				System.out.println("자리수 : "+ len.length());
				
				System.out.print("다시 입력하시겠습니까? Yes:1, No:0 ");
				ret = scan.nextInt();
				
				scan.close();
			} else {
				System.out.println("다시 입력하세요");
			}
			*/
		
		int x;
		
		do {
			System.out.print("양의 정수값 : ");
			x = scan.nextInt();
		} while(x <= 0);
		
		int digit = 0;
		
		while(x > 0) {
			x = x /10;
			digit++;
		}
		System.out.print("자리수 : "+ digit);

	}

}
