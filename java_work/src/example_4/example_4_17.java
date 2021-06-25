// 입력한 개수만큼 * 을 표시하는 문제를 변경해서 
// 5개 단위로 줄바꿈해서 표시하는 프로그램을 작성하시오.(for문 사용)

package example_4;

import java.util.Scanner;

public class example_4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 *을 표시할까요? ");
		int n = sc.nextInt();
		/*		
		for (int i = 1 ; i <= n ; i++) {
			System.out.print("*");
			if (i % 5 == 0)
				System.out.println("");
		}*/
		
		for (int i = 0 ; i <n ; i++) {
			System.out.print("*");
			if (i % 5 == 4)
				System.out.println();
		}
		
		sc.close();

	}

}
