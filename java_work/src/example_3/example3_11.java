// �Է��� ������ ���� ��/��/��/��/�� �� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// 0 ~ 49 ��
// 50 ~ 59 ��
// 60 ~ 69 ��
// 70 ~ 79 ��
// 80 ~ 100 ��
// ������ �����ȿ� ���� ���, "�߸��� �����Դϴ�."�� ǥ���ϼ���.

package example_3;

import java.util.Scanner;

public class example3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int score = scan.nextInt();
		
		if (score >= 0 && score <= 49)
			System.out.println("��");
		else if (score >= 50 && score <= 59)
			System.out.println("��");
		else if (score >= 60 && score <= 69)
			System.out.println("��");
		else if (score >= 70 && score <= 79)
			System.out.println("��");
		else if (score >= 80 && score <= 100)
			System.out.println("��");
		else 
			System.out.println("�߸��� ����");
		
		scan.close();

	}

}
