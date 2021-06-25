// 입력한 정수값이 5로 나누어 떨어지면 "5로 나누어 떨어집니다."라고 표시하고
// 그렇지 않으면 "5로 나누어 떨어지지 않습니다."라고 표시하는 프로그램을 작성하시오.
// 만약, 음수를 입력한 경우에는 "음의 정수값을 입력했습니다."라고 표시하시오.

package example_3;

import java.util.Scanner;

public class example3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 5 == 0) {
				System.out.print("5로 나누어 떨어집니다.");
			} else {
				System.out.print("5로 나누어 떨어지지 않습니다.");
			}
		
		} else {
			System.out.print("음의 정수값을 입력했습니다.");
		}	
		
		scan.close();

	}
}
