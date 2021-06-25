// n단 피라미드(이등변삼각형)를 표시하는 프로그램을 작성하시오.
// i번째 행에는 (i -1) * 2 + 1개의'*'기호를 표시
// 마지막행에는 (n - 1) * 2 + 1개의'*'기호를 표시

package example_4;

import java.util.Scanner;

public class example_4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 단의 피라미드를 표시하겠습니까? ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num ; i++) {
			for(int j = 0 ; j < num-1-i ; j++) {
				System.out.print(" ");
			}
			for(int k=0 ; k<i*2+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
