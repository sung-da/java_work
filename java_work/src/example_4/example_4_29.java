// 5���� ������ ������ �׷��� ��ü �հ�(�׷캰 �հ� �ƴ� ��ü �׷��� ��)�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��ü 10���� �׷��� ������ �� �������� Ű����� �Է��Ѵ�. �� ��, 99999�� �Է��ϸ� ��ü�Է� �����ϰ�
// 88888�� �Է��ϸ� ���� �а� �ִ� �׷��� �Է��� �����Ͻÿ�.

package example_4;

import java.util.Scanner;

public class example_4_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("������ ���մϴ�.");
		
		int sum = 0;
				
	loop:   // �̸��ִ� �ݺ� - label
		for(int i = 1; i<=10 ; i++) {
			System.out.println(i+"�׷�");
			for (int j=1; j<=5; j++) {
				System.out.print("���� : ");
				int n = sc.nextInt();
				if (n == 99999)
					break loop;
				else if (n == 88888)
					//break;
					continue loop;
				else
					sum += n;
			}			

		}
		System.out.println("�հ� : "+ sum);
		sc.close();
	}

}
