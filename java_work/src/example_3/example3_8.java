// �Է��� �������� 5�� ������ �������� "5�� ������ �������ϴ�."��� ǥ���ϰ�
// �׷��� ������ "5�� ������ �������� �ʽ��ϴ�."��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ����, ������ �Է��� ��쿡�� "���� �������� �Է��߽��ϴ�."��� ǥ���Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 5 == 0) {
				System.out.print("5�� ������ �������ϴ�.");
			} else {
				System.out.print("5�� ������ �������� �ʽ��ϴ�.");
			}
		
		} else {
			System.out.print("���� �������� �Է��߽��ϴ�.");
		}	
		
		scan.close();

	}
}
