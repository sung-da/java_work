// 2개의 정수값을 읽어서 두 값의 차를 표시하는 프로그램을 작성하시오

package example_3;

import java.util.Scanner;

public class example3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		int diff;
		
		if (a >= b)
			diff = a - b;
		else
			diff = b - a;
			
		System.out.println("두 값의 차는: "+ diff);
		
		scan.close();

	}

}
