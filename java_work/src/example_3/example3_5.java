// 제어문을 사용하여 정수값을 읽어 부호 (양수/음수/0) 을 판정하는 프로그램을 작성하세요.

package example_3;

import java.util.Scanner;

public class example3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		if (n < 0) {
			System.out.println("이 값은 음의 값입니다.");
		} else if (n > 0) {
			System.out.println("이 값은 양의 값입니다.");
		} else {
			System.out.println("이 값은 0입니다.");
		}
		
		scan.close();

	}

}
