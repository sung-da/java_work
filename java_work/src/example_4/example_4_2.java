// 3자리 양의 정수값(100~999)을 입력받는 프로그램을 작성하시오.
// 입력한 값이 3자리 양의 정수값이 아니면 다시 입력받도록 하세요.

package example_4;

import java.util.Scanner;

public class example_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		/*
		while (true) {
			System.out.print("3자리 양의 정수값 : ");
			int n = scan.nextInt();
			
			if (n>99 && n<1000) {
				System.out.println(n);
				break;
			}
			else {
				System.out.println("다시입력하세요");
				continue;
			}
				
		}*/
		/*
		System.out.print("세자리 정수값 입력 : ");
		int n = scan.nextInt();
		
		while (n < 100 || n > 999 ) {
			System.out.println("다시 입력하세요");
			System.out.print("세자리 정수값 입력 : ");
			n = scan.nextInt();
		}
		
		System.out.println("입력값 : "+ n);
		*/
		
		int x;
		
		do {
			System.out.print("세자리 정수값 입력 : ");
			x = scan.nextInt();
		} while(x < 100 || x > 999);
		System.out.println("입력값 : "+ x);
		
		scan.close();

	}

}
