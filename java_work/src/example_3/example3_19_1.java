// 3���� �������� ��������(������)���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_19_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		System.out.print("���� c: ");
		int c = scan.nextInt();
		
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		if (b > c) {
			int temp = b;
			b = c;
			c = temp;
		}
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		
		
		System.out.println("�������� : "+ a + " " + b + " " + c);
		
		scan.close();

	}

}
