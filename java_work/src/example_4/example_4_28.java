// 정수값을 입력받아서 음수가 아닌 값의 합계와 평균을 구하는 프로그램을 작성하시오.
// 입력받는 음수의 개수는 평균을 구할때 제외하시오.

package example_4;

import java.util.Scanner;

public class example_4_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 정수를 더할까요? ");
		int num = sc.nextInt();
		
		
		int sum = 0;
		int count = 0;
		
		int i;
		for(i=0 ; i<num ; i++) {
			System.out.print("정수입력 : ");
			int n = sc.nextInt();
			
			if (n < 0) {
				System.out.println("음수는 더하지 않습니다.");
				continue;
			} 
			sum += n;
			count++;
		}
		System.out.println("합계 : " + sum);
		if(i != 0)
			System.out.println("평균 : " + sum / count);
		
		sc.close();

	}

}
