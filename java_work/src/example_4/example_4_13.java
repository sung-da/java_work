// 0부터 양의 정수까지 카운트 업하는 프로그램을 작성하시오 (for문 사용)

package example_4;

import java.util.Scanner;

public class example_4_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("양의 정수 : ");
		int n = sc.nextInt();
		
		for (int i = 0; i <= n ; i++) {
			System.out.println(i);
		}

	}

}
