// 키보드에서 입력한 정수값에서 10을 더한 값과 10을 뺀 값을 출력해보세요

package example;

import java.util.Scanner;

public class example2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 :");
		int i = sc.nextInt();
		System.out.println(i + 10);
		System.out.println(i - 10);
		sc.close();

	}

}
