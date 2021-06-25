// 입력한 값의 개수만큼 '*'을 표시하는 프로그램을 작성하시오(for문 사용)
// 마지막에는 줄바꿈 문자를 출력하시오.(줄 변경O)
// 단, 읽은 값이 1미만이면 줄바꿈 문자를 표시 안합니다(줄 변경X)

package example_4;

import java.util.Scanner;

public class example_4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("몇 개의 *을 표시할까요? ");
		int n = sc.nextInt();
		
		if (n > 0) {
			for (int i = 0 ; i<n ; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
