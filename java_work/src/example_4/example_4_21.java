// 기호문자 '*' 을 나열해서 n단의 정방형(정사각형)을 표시하는 프로그램을 작성하시오.(for)

package example_4;

import java.util.Scanner;

public class example_4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단의 정사각형을 표시하겠습니까? ");
		int num = sc.nextInt();
		/*
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= num ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		for(int i = 1 ; i <= num+2 ; i++) {     //세로
			for(int j = 1 ; j <= num ; j++) {   //가로
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
