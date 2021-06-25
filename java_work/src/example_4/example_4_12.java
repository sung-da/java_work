// 입력받은 양의 정수값을 0까지 카운트하는 프로그램을 작성하시오(for문 사용)

package example_4;

import java.util.Scanner;

public class example_4_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("양의 정수값 : ");
		int n = sc.nextInt();
		
		for (; n >= 0 ; n--) {
			System.out.println(n);
		}

	}

}
