// �������� �Է¹޾Ƽ� ������ �ƴ� ���� �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Է¹޴� ������ ������ ����� ���Ҷ� �����Ͻÿ�.

package example_4;

import java.util.Scanner;

public class example_4_28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ ���ұ��? ");
		int num = sc.nextInt();
		
		
		int sum = 0;
		int count = 0;
		
		int i;
		for(i=0 ; i<num ; i++) {
			System.out.print("�����Է� : ");
			int n = sc.nextInt();
			
			if (n < 0) {
				System.out.println("������ ������ �ʽ��ϴ�.");
				continue;
			} 
			sum += n;
			count++;
		}
		System.out.println("�հ� : " + sum);
		if(i != 0)
			System.out.println("��� : " + sum / count);
		
		sc.close();

	}

}
