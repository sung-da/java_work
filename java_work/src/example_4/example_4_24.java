// n단의 숫자 피라미드 표시하는 프로그램을 작성하시오.

package example_4;

import java.util.Scanner;

public class example_4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단의 피라미드를 표시하겠습니까? ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			// 공백 for문
			for(int j = 1 ; j <= num-i ; j++) {
				System.out.print(" ");
			}
			// 층 숫자 for문
			for(int k=1 ; k <= i*2-1 ; k++) {	
				if (i > 9)
					System.out.print(i%10);
				else
					System.out.print(i);
			}
			System.out.println();
		}
		sc.close();

		
	}

}
