// Ű���忡�� �Է��� 3���� ���� �� �߾Ӱ��� ���ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ���� ��� 2,3,1�� �߾Ӱ��� 2 / 1,2,1�� �߾Ӱ��� 1 / 3,3,3 �߾Ӱ��� 3

package example_3;

import java.util.Scanner;

public class example3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		System.out.print("���� c: ");
		int c = scan.nextInt();
		
		int mid;
		
		if (a >= b)
			if (b >= c)
				mid = b;
			else if (a <= c)
				mid = a;
			else
				mid = c;
		else if (a > c)
			mid = a;
		else if (b > c)
			mid = c;
		else
			mid = b;
		
		System.out.println("�߰����� " + mid);
		
		scan.close();

	}

}