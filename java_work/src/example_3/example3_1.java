// 키보드로 입력한 정수값이 음이면 "이 값은 음의 값입니다."
// 라고 표시하는 프로그램을 작성하시오.

package example_3;

import java.util.Scanner;

public class example3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		if (n < 0) {
			System.out.println("이 값은 음의 값입니다.");
		}
		
		scan.close();

	}

}
