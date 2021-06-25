/*7-1
 * 입력한 int형 정수값이 음수인 경우 -1, 0인 경우 0, 양수이면 1을 반환하는 signOf 매서드를 작성하시오.
 * 
 */

package example_7;

import java.util.Scanner;

public class example_7_1 {
/*
	public static void signOf(int i) {
		if (i<0) {
			System.out.println(-1);
		} else if (i>0) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
	
*/

	public static int signOf(int n) {
		int sign = 0;
		if (n>0) {
			sign =1;
		} else if (n<0) {
			sign = -1;
		} 
		return sign;
	}
	
	public static void main(String[] args) {
		
		Scanner stdln = new Scanner(System.in);
		
		System.out.print("정수 x : ");
		int x = stdln.nextInt();
		int s = signOf(x);
		
		System.out.println(s);
		
		System.out.println(signOf(5));
		System.out.println(signOf(0));
		System.out.println(signOf(-5));
	}
}
