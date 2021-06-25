/* "양의 정수값: " 이라는 메세지에 정수값을 입력하면 값을 거꾸로 반환하는 readPlusInt 메서드를 작성하시오.
 * (0이나 음수가 입력되면 재입력하도록 할 것.)
 * <결과>
 * 양의 정수값 : 521
 * 반대로 반환 : 125
 */

package example_7;

import java.util.Scanner;

public class example_7_9 {
	
	static int readPlusInt() {
		Scanner sc = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("양의 정수값 : ");
			x = sc.nextInt();
		} while (x<=0);
			
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			int n = readPlusInt();
			
			// 숫자의 순서를 거꾸로 반환하는 처리 구문
			while(n>0) {
				System.out.print(n%10);		//나머지
				n = n/10;					// 몫
			}
			System.out.println();
			do {
				System.out.print("다시 한 번? (1:yes, 0:no)");
				x = sc.nextInt();
			} while (x!=0 && x!=1);
		} while (x==1);
		
	}

}
