// ����� ����Ͽ� �������� �о� ��ȣ (���/����/0) �� �����ϴ� ���α׷��� �ۼ��ϼ���.

package example_3;

import java.util.Scanner;

public class example3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = scan.nextInt();
		
		if (n < 0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		} else if (n > 0) {
			System.out.println("�� ���� ���� ���Դϴ�.");
		} else {
			System.out.println("�� ���� 0�Դϴ�.");
		}
		
		scan.close();

	}

}
