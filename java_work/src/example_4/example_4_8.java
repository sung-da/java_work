// 입력받은 숫자의 개수만큼 "*"과 "+"를 번갈아 가며 표시하는 프로그램을 작성해보시오.
// 마지막에는 새줄로 변경하세요

package example_4;

import java.util.Scanner;

public class example_4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("몇개를 표시할까요? ");
		int num = scan.nextInt();
		/*
		for(int i = 0; i < num; i++) {
			System.out.print("*");
			System.out.print("+");
		}
		System.out.println("\n");
		*/
		if(num > 0) {
			int i = 0;
			while(i < num) {
				System.out.print("*");
				System.out.print("+");
				i++;
			}
			System.out.println();
		}
		scan.close();

	}

}
