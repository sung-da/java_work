/*7-1
 * �Է��� int�� �������� ������ ��� -1, 0�� ��� 0, ����̸� 1�� ��ȯ�ϴ� signOf �ż��带 �ۼ��Ͻÿ�.
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
		
		System.out.print("���� x : ");
		int x = stdln.nextInt();
		int s = signOf(x);
		
		System.out.println(s);
		
		System.out.println(signOf(5));
		System.out.println(signOf(0));
		System.out.println(signOf(-5));
	}
}
