// 정수값을 입력받아서 합계와 평균을 구하는 프로그램을 작성하시오.
// 정수값의 입력은 합계가 1000을 넘지 않는 범위에서 이루어지도록 하세요.

package example_4;

import java.util.Scanner;

public class example_4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 더할까요? ");
		int count = sc.nextInt();
		
		int i;
		int sum = 0;
		
		for (i=0; i<count ; i++) {
			System.out.print("정수 입력(종료:0) : ");
			int n = sc.nextInt();
			if (n == 0)
				break;
			if (sum+n > 1000) {
				System.out.println("합계가 1000을 넘었습니다");
				break;
			}
			sum += n;
		}
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + sum / i);
		
		sc.close();

	}

}
