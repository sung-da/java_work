// ���� �������� �Է¹޾Ƽ� �Ҽ����� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �Ҽ� : 2�̻� n�̸��� �� �� � ���ε� ���������� �ʴ� ����
// ��, 1�� �ڱ��ڽŸ����� ������ �������� �� 

package example_4;

import java.util.Scanner;

public class example_4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2�̻��� ������ : ");
			n = sc.nextInt();
			
		} while (n <2);
		
		int i;		
		for(i = 2; i<n ; i++) {
			if (n % i == 0) 
				break;
		}
		
		if (i == n)
			System.out.println("�Ҽ� �Դϴ�");
		else
			System.out.println("�Ҽ��� �ƴմϴ�");		
		
		sc.close();

	}

}
