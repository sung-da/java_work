// 양의 정수값(n)을 읽어서 1부터 n까지 곱을 구하는 프로그램을 작성하시오.
// while문

package example_4;

import java.util.Scanner;

public class example_4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("양의 정수값 : ");
			x = scan.nextInt();
		} while(x <= 0);
		
		int total = 1;
		int i = 1;
		
		while(i <= x) {
			total = total * i;
			i++;
		}
		System.out.println("결과 : " + total);
		
		scan.close();

	}

}
