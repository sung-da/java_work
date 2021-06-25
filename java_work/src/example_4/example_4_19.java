// 1부터 n까지의 정수값에 각 값을 제곱해서 표시하는 프로그램을 작송하시오

package example_4;

import java.util.Scanner;

public class example_4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i<=n ; i++) {
			System.out.println(i+"의 제곱은 "+ (i*i)+"입니다.");
		}
		sc.close();
	}

}
