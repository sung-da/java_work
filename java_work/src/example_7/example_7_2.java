/* 7-2
 * 3���� int �� �μ� a,b,c �� �ּҰ��� ���ϴ� min �޼��带 �ۼ��Ͻÿ�.
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
		
		System.out.print("���� a : ");
		int a = stdIn.nextInt();
		System.out.print("���� b : ");
		int b = stdIn.nextInt();
		System.out.print("���� c : ");
		int c = stdIn.nextInt();
		
		System.out.println("�ּҰ��� "+min(a,b,c));

	}

}
