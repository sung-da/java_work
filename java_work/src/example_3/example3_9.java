// �Է��� �������� 10�� ����̸� "10�� ��� �Դϴ�."��� ǥ���ϰ�,
// �׷��� ������ "10�� ����� �ƴմϴ�."��� ǥ���ϴ� ���α׷��� �ۼ��϶�
// ���� ������ ���� ��� "���� �������� �Է��߽��ϴ�."��� ǥ���ϼ���

package example_3;

import java.util.Scanner;

public class example3_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = scan.nextInt();
		
		if (n > 0) {
			if (n % 10 == 0) {
				System.out.print("10�� ��� �Դϴ�.");
			} else {
				System.out.print("10�� ����� �ƴմϴ�.");
			}
		
		} else {
			System.out.print("���� �������� �Է��߽��ϴ�.");
		}	
		
		scan.close();

	}

}
