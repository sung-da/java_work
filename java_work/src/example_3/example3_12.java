// 2개의 실수값 중에서 큰 값을 표시하는 프로그램을 작성하시오

package example_3;

import java.util.Scanner;

public class example3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("실수값 a: ");
		double a = scan.nextDouble();
		
		System.out.print("실수값 b: ");
		double b = scan.nextDouble();
		
		/*
		if (a > b) {
			System.out.println("a가 b보다 큽니다");
		} else if (a < b) {
			System.out.println("b가 a보다 큽니다");
		}
		*/
		/*
		double max;
		
		if (a > b)
			max = a;
		else
			max = b;
		*/
		
		double max = a > b ? a: b;
		
		System.out.println("둘중에 큰 값은 " + max);
		
		scan.close();

	}

}
