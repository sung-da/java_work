// �� �������� ���� 10 ������ ��� "�� ���� ���� 10����"��� ǥ���ϰ�
// �׷��� ������ �� ���� ���� 11�̻�"��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�

package example_3;

import java.util.Scanner;

public class example3_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		//int diff;
		
		/*
		if (a >= b) 
			diff = a - b;
		else 
			diff = b - a;
		*/
		
		int diff = a>=b ? a-b : b-a;
		
		if (diff <= 10)
			System.out.println("�� ���� ���� 10����");
		else
			System.out.println("�� ���� ���� 11�̻�");
		
		scan.close();

	}

}
