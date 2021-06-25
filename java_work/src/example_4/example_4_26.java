// 정수값을 연속해 입력받아 합계와 평균을 구하는 프로그램을 작성하시오.
// (0 입력 받으면 프로그램을 종료)

package example_4;

import java.util.Scanner;

public class example_4_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 더할까요? ");
		int count = sc.nextInt();
		
		int i;
		int sum = 0;
		
		for (i = 0; i < count ; i++) {
			System.out.print("정수 입력(종료:0) : ");
			int n = sc.nextInt();
			if (n == 0)
				break;
			sum += n;
		}
		
		System.out.println("합계 : "+ sum);
		
		System.out.println("평균 : "+ sum / i);
		
		
		sc.close();
		

	}

}
