// �Է��� ���� ������ŭ '*'�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�(for�� ���)
// ���������� �ٹٲ� ���ڸ� ����Ͻÿ�.(�� ����O)
// ��, ���� ���� 1�̸��̸� �ٹٲ� ���ڸ� ǥ�� ���մϴ�(�� ����X)

package example_4;

import java.util.Scanner;

public class example_4_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� *�� ǥ���ұ��? ");
		int n = sc.nextInt();
		
		if (n > 0) {
			for (int i = 0 ; i<n ; i++) {
				System.out.print("*");
			}
			System.out.println("");
		}

		sc.close();
	}

}
