// ��(��)�� ���������� �Է¹޾Ƽ� �ش��ϴ� ���� ������ ǥ���ϴ� ���α׷��� �ۼ�
// ���ϴ� ��ŭ �Է� �� ����� �� �ְ� �ϰ�, 1~12 �̿��� ���� �ԷµǴ� ���, ���Էµǵ��� �� ��
// do-while�� ���

package example_4;

import java.util.Scanner;

public class example_4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ret = 1;
		/*
		do {
			System.out.print("��(��)�� �Է� : ");
			int month = sc.nextInt();
			
			if (month > 0 && month <13) {
				if (month == 3 || month == 4 || month == 5)
					System.out.println("��");
				else if (month == 6 || month == 7 || month == 8)
					System.out.println("����");
				else if (month == 9 || month == 10 || month == 11)
					System.out.println("����");
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("�ܿ�");
			} else 
				continue;

			
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? (yes: 1, no: 0)");
			ret = sc.nextInt();
			
		} while (ret == 1);
		*/
		
		do {
			System.out.print("��(��)�� �Է� : ");
			int month = sc.nextInt();
			
			if (month > 0 && month <13) {
				if (month == 3 || month == 4 || month == 5)
					System.out.println("��");
				else if (month == 6 || month == 7 || month == 8)
					System.out.println("����");
				else if (month == 9 || month == 10 || month == 11)
					System.out.println("����");
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("�ܿ�");
			} else 
				continue;

			
			System.out.println("�ٽ� �Ͻðڽ��ϱ�? (yes: 1, no: 0)");
			ret = sc.nextInt();
			
		} while (ret == 1);

	}

}
