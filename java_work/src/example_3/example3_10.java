// �Է��� �������� 3���� ������. �׸��� �� ����� ���� 
// "�� ���� 3���� ���������ϴ�.",
// "�� ���� 3���� ���� �������� 1�Դϴ�."
// "�� ���� 3���� ���� �������� 2�Դϴ�."
// �� �ϳ��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��, ����� �ƴ� ���, "����� �ƴ� ���� �Է��߽��ϴ�."��� ǥ���ϼ���.

package example_3;

import java.util.Scanner;

public class example3_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 3 == 0) {
				System.out.println("�� ���� 3���� ���������ϴ�.");
			} else if (n % 3 == 1) {
				System.out.println("�� ���� 3���� ���� �������� 1�Դϴ�.");
			} else {
				System.out.println("�� ���� 3���� ���� �������� 2�Դϴ�.");
			}
		} else {
			System.out.println("����� �ƴ� ���� �Է��߽��ϴ�.");
		}
		
		scan.close();

	}

}
