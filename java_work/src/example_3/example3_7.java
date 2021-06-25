// 2개의 변수 a, b 값을 읽어서 a, b의 대소 관계를 다음과 같이 표시하는 프로그램을 작성하시오.
// "a가 크다.", "b가 크다.", "a와 b가 같다."

package example_3;

import java.util.Scanner;

public class example3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("변수 a : ");
		int a = scan.nextInt();
		
		System.out.print("변수 b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a가 크다.");
		} else if (a < b) {
			System.out.println("b가 크다.");
		} else {
			System.out.println("a와 b가 같다.");
		}
		
		scan.close();

	}

}
