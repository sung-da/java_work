/* 3���� int�� �μ� a,b,c���� �߰����� ���ϴ� med�޼��带 �ۼ��Ͻÿ�.
 * 
 */

package example_7;

import java.util.Scanner;

public class example_7_3 {
	
	static int med(int a, int b, int c) {
		
		int med;
		if (a > b)
			if (b > c)	// c b a
				med = b;
			else if (a < c) // b a c
				med = a;
			else
				med = c; // b c a
		else if (a > c) // c a b
			med = a;
		else if (b > c) // a c b
			med = c;
		else  
			med = b;  // a b c
		return med;
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
		
		System.out.println("�߰����� "+med(a,b,c));

	}

}
