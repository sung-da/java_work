// 3개의 정수값을 읽어서 합계와 평균을 구하는 프로그램을 작성하시오.
// 평균을 실수로 표현하세요

package example_5;

import java.util.Scanner;

public class example_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = sc.nextInt();
		
		System.out.print("정수 b : ");
		int b = sc.nextInt();
		
		System.out.print("정수 c : ");
		int c = sc.nextInt();
		
		int sum;
		sum = a+b+c;
		
		double avg;
		//avg = sum / 3.0;
		avg = (double)sum / 3;
		
		System.out.printf("합계 :%d\n", sum);
		System.out.printf("평균 : %.3f\n", avg);
		
		sc.close();

	}

}
