// 입력받은 정수값을 읽어서 절대값을 구하는 프로그램을 작성하시오.

package example_3;

import java.util.Scanner;

public class example3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		//System.out.println(Math.abs(n));
		
		if (n < 0) {
			System.out.println("절대값은 " + -n +"입니다.");
		} else {
			System.out.println("절대값은 " + n +"입니다.");
		}
		
		scan.close();

	}

}
