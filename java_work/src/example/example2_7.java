// 키보드에서 입력한 정수값에서 마지막 자릿수를 제외한 값과
// 마지막 자릿수 값만 표시하는 프로그램을 작성하세요

package example;

import java.util.Scanner;

public class example2_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 :");
		
		int i = sc.nextInt();
		
		System.out.println(i / 10);
		System.out.println(i % 10);
		
		sc.close();
		 

	}

}
