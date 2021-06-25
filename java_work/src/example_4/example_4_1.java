// 정수값의 부호를 판정해서 표시하는 프로그램을 
// 원하는 만큼 반복해서 입력 및 표시하도록 작성하시오.

package example_4;

import java.util.Scanner;

public class example_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int retry = 1;
				
		while (retry == 1) {
			System.out.print("정수값을 입력하세요 : ");
			int num = scan.nextInt();
			
			if (num > 0)
				System.out.println("양수입니다.");
			else if (num < 0)
				System.out.println("음수입니다.");
			else
				System.out.println("0입니다.");
			
			System.out.print("retry? Yes:1, No:0 ");
			retry = scan.nextInt();
						
		}
		
		/*
		int retry;
		
		do {
			System.out.print("정수값을 입력하세요 : ");
			int num = scan.nextInt();
			
			if (num > 0)
				System.out.println("양수입니다.");
			else if (num < 0)
				System.out.println("음수입니다.");
			else
				System.out.println("0입니다.");
			
			System.out.print("다시 입력하시겠습니까? Yes:1, No:0 ");
			retry = scan.nextInt();
			
		} while (retry == 1);
		*/
		
		scan.close();

	}

}
