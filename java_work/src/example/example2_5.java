// 키보드에서 입력한 정수 값을 표시하는 프로그램을 작성해보세요

package example;

import java.util.Scanner;

public class example2_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수값: ");
		int i = sc.nextInt();
		System.out.println(i);
		sc.close();

	}

}