// 키보드에서 입력한 2개의 정수값 중 작은값과 큰 값을 표시하는 프로그램을 작성하시오.
// 두 값이 같으면 "같습니다."라고 표시하시오.

package example_3;

import java.util.Scanner;

public class example3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		if (a == b)
			System.out.println("두 값이 같습니다.");
		else {
			int min, max;
			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			System.out.println("min값은 "+ min);
			System.out.println("max값은 "+ max);
		}
		
		scan.close();

	}

}
