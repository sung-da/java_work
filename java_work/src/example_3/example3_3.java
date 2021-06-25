// 2개의 양의 정수값을 읽어서, 후자가 전자의 약수이면 "B는 A의 약수이다."라고 표시하고,
// 그렇지 않으면 "B는 A의 약수가 아니다."라고 표시하는 프로그램을 작성하시요.
// 약수 -> 어떤수로 나누어 떨어지는 수

package example_3;

import java.util.Scanner;

public class example3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 A : ");
		int A = scan.nextInt();
		
		System.out.print("정수값 B : ");
		int B = scan.nextInt();
		
		if (A % B == 0) {
			System.out.print("B는 A의 약수이다.");
		} else {
			System.out.print("B는 A의 약수가 아니다.");
		}

	}

}
