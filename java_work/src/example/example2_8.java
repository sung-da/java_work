// 2개의 실수값을 입력받아 그 합과 평균을 구하는 프로그램을 작성하세요

package example;

import java.util.Scanner;


public class example2_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		
		System.out.print("a값 :");
		double a = sc.nextDouble();
		
		System.out.print("b값 :");
		double b = sc.nextDouble();
		
		System.out.println(a + b);
		System.out.println((a + b) / 2);
		
		sc.close();
		 
		

	}

}
