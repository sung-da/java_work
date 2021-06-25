// 1부터 n까지의 합을 구하는 프로그램을 작성하시오(for문 사용)

package example_4;

import java.util.Scanner;

public class example_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= n ; i++) {
			total += i;
		}
		System.out.println("합 : "+ total);

	}

}
