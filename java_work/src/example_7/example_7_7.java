// 문자 c를 n개 표시하는 putChar 메서드와 
// 이 메서드를 내부에서 호출해 '*'을 n개 표시하는 putStar 메서드를 작성하시오.
// 이 메서드들을 사용해서 직각 삼각형을 만드는 프로그램을 작성하시오.
/*
 * <결과>
 * 왼쪽 아래가 직각인 삼각형을 표시
 * 단수 : 6
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 */

package example_7;

import java.util.Scanner;

public class example_7_7 {
	
	static void putChar(char c, int n) {
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(c);
		}
		
//		while(n>0) {
//			System.out.print(c);
//			n--;
//		}
		
	}
	
	static void putStars(int n) {
		putChar('*',n);

	}
	
	static void putDallors(int n) {
		putChar('$',n);

	}
	
	static void putExpr(int n, char chars) {
		putChar(chars,n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("왼쪽 아래가 직각인 삼각형을 표시");
		System.out.print("단수 : ");
		int n = sc.nextInt();
		System.out.print("문자 : ");
		char c = sc.next().charAt(0);
		
		for(int i=1 ; i<=n ; i++) {
			//putStars(i);
			//putDallors(i);
			putExpr(i, c);
			System.out.println();
		}
		
	}

}
