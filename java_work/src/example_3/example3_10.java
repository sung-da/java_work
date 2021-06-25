// 입력한 정수값을 3으로 나눈다. 그리고 그 결과에 따라 
// "이 값은 3으로 나누어집니다.",
// "이 값은 3으로 나눈 나머지는 1입니다."
// "이 값은 3으로 나눈 나머지는 2입니다."
// 중 하나를 표시하는 프로그램을 작성하시오.
// 단, 양수가 아닌 경우, "양수가 아닌 값을 입력했습니다."라고 표시하세요.

package example_3;

import java.util.Scanner;

public class example3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 3 == 0) {
				System.out.println("이 값은 3으로 나누어집니다.");
			} else if (n % 3 == 1) {
				System.out.println("이 값은 3으로 나눈 나머지는 1입니다.");
			} else {
				System.out.println("이 값은 3으로 나눈 나머지는 2입니다.");
			}
		} else {
			System.out.println("양수가 아닌 값을 입력했습니다.");
		}
		
		scan.close();

	}

}
