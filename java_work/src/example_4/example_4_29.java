// 5개의 정수로 구성된 그룹의 전체 합계(그룹별 합계 아닌 전체 그룹의 합)을 구하는 프로그램을 작성하시오.
// 전체 10개의 그룹이 있으며 각 정수값은 키보드로 입력한다. 이 때, 99999를 입력하면 전체입력 종료하고
// 88888을 입력하면 현재 읽고 있는 그룹의 입력을 종료하시오.

package example_4;

import java.util.Scanner;

public class example_4_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 더합니다.");
		
		int sum = 0;
				
	loop:   // 이름있는 반복 - label
		for(int i = 1; i<=10 ; i++) {
			System.out.println(i+"그룹");
			for (int j=1; j<=5; j++) {
				System.out.print("정수 : ");
				int n = sc.nextInt();
				if (n == 99999)
					break loop;
				else if (n == 88888)
					//break;
					continue loop;
				else
					sum += n;
			}			

		}
		System.out.println("합계 : "+ sum);
		sc.close();
	}

}
