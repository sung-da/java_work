// �������� �Է¹޾Ƽ� �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �������� �Է��� �հ谡 1000�� ���� �ʴ� �������� �̷�������� �ϼ���.

package example_4;

import java.util.Scanner;

public class example_4_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ������ ���ұ��? ");
		int count = sc.nextInt();
		
		int i;
		int sum = 0;
		
		for (i=0; i<count ; i++) {
			System.out.print("���� �Է�(����:0) : ");
			int n = sc.nextInt();
			if (n == 0)
				break;
			if (sum+n > 1000) {
				System.out.println("�հ谡 1000�� �Ѿ����ϴ�");
				break;
			}
			sum += n;
		}
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + sum / i);
		
		sc.close();

	}

}
