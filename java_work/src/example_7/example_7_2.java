/* 7-2
 * 3개의 int 형 인수 a,b,c 중 최소값을 구하는 min 메서드를 작성하시오.
 * min(a,b,c)
 */

package example_7;

import java.util.Scanner;

public class example_7_2 {
	
	static int min(int a, int b, int c) {
		int min = a;
		if (b < min) {
			min = b;
		} else if (c < min) {
			min = c;
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		System.out.println("최소값은 "+min(a,b,c));

	}

}
