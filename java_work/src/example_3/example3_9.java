// 입력한 정수값이 10의 배수이면 "10의 배수 입니다."라고 표시하고,
// 그렇지 않으면 "10의 배수가 아닙니다."라고 표시하는 프로그램을 작성하라
// 만약 음수를 읽은 경우 "음의 정수값을 입력했습니다."라고 표시하세요

package example_3;

import java.util.Scanner;

public class example3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 10 == 0) {
				System.out.print("10의 배수 입니다.");
			} else {
				System.out.print("10의 배수가 아닙니다.");
			}
		
		} else {
			System.out.print("음의 정수값을 입력했습니다.");
		}	
		
		scan.close();

	}

}
