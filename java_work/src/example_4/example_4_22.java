// 기호문자  '*'을 나열해서 직각 삼각형을 표시하는 프로그램을 작성하시오.
// - 직각의 위치가 왼쪽 아래
// - 직각의 위치가 왼쪽 위

package example_4;

import java.util.Scanner;

public class example_4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단의 직각삼각형을 표시하겠습니까? ");
		int num = sc.nextInt();
		/*
		for (int i = 0 ; i <= num ; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		*/
		
		for (int i = num ; i >= 0 ; i--) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		sc.close();

	}

}
