// 2���� �������� �Է¹޾� �� ���� ���̿� �ִ� ��� ������
// ���� ������ ū ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_4;

import java.util.Scanner;

public class example_4_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = scan.nextInt();
		
		System.out.print("���� b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			int t = a;
			a = b;
			b = t;
		}
		
		do {
			System.out.print(a + " ");
			a = a +1;
		} while (a <= b);

	}

}
