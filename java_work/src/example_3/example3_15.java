// Ű���忡�� �Է��� 3���� ���� �� �ּҰ��� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		System.out.print("���� c: ");
		int c = scan.nextInt();
		
		int min = a;
		
		if ( b < min ) min = b;
		if ( c < min ) min = c;
		
		System.out.println("�ּҰ��� "+ min);
		
		scan.close();

	}

}
