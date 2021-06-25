// 10진 정수를 8진수와 16진수로 표시하는 프로그램을 작성하시오.(print 서식문자 활용)

package example_5;

import java.util.Scanner;

public class example_5_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수 입력 : ");
		int n = sc.nextInt();
		
		System.out.printf("8진수는 %o입니다.\n", n);
		System.out.printf("16진수는 %x입니다.\n", n);
		
		sc.close();

	}

}
