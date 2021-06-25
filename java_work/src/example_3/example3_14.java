// 두 정수값의 차가 10 이하인 경우 "두 값의 차는 10이하"라고 표시하고
// 그렇지 않으면 두 값의 차는 11이상"라고 표시하는 프로그램을 작성하시오

package example_3;

import java.util.Scanner;

public class example3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		//int diff;
		
		/*
		if (a >= b) 
			diff = a - b;
		else 
			diff = b - a;
		*/
		
		int diff = a>=b ? a-b : b-a;
		
		if (diff <= 10)
			System.out.println("두 값의 차는 10이하");
		else
			System.out.println("두 값의 차는 11이상");
		
		scan.close();

	}

}
