// Ű���忡�� �Է��� 2���� ������ �� �������� ū ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �� ���� ������ "�����ϴ�."��� ǥ���Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		if (a == b)
			System.out.println("�� ���� �����ϴ�.");
		else {
			int min, max;
			if (a < b) {
				min = a;
				max = b;
			} else {
				min = b;
				max = a;
			}
			System.out.println("min���� "+ min);
			System.out.println("max���� "+ max);
		}
		
		scan.close();

	}

}
