// 4-14 프로그램을 수정해서 결과뿐만 아니라 계산식까지 표시하는 프로그램을 작성하시오.(for문 사용)
// 5를 입력받은 경우, 1 + 2 + 3 + 4 + 5 = 15

package example_4;

import java.util.Scanner;

public class example_4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= n ; i++) {
			total += i;
			System.out.print(i);
			if (i != n)
				System.out.print(" + ");
		}
		System.out.println(" = "+ total);

	}

}
