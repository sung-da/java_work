// 3�ڸ� ���� ������(100~999)�� �Է¹޴� ���α׷��� �ۼ��Ͻÿ�.
// �Է��� ���� 3�ڸ� ���� �������� �ƴϸ� �ٽ� �Է¹޵��� �ϼ���.

package example_4;

import java.util.Scanner;

public class example_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		/*
		while (true) {
			System.out.print("3�ڸ� ���� ������ : ");
			int n = scan.nextInt();
			
			if (n>99 && n<1000) {
				System.out.println(n);
				break;
			}
			else {
				System.out.println("�ٽ��Է��ϼ���");
				continue;
			}
				
		}*/
		/*
		System.out.print("���ڸ� ������ �Է� : ");
		int n = scan.nextInt();
		
		while (n < 100 || n > 999 ) {
			System.out.println("�ٽ� �Է��ϼ���");
			System.out.print("���ڸ� ������ �Է� : ");
			n = scan.nextInt();
		}
		
		System.out.println("�Է°� : "+ n);
		*/
		
		int x;
		
		do {
			System.out.print("���ڸ� ������ �Է� : ");
			x = scan.nextInt();
		} while(x < 100 || x > 999);
		System.out.println("�Է°� : "+ x);
		
		scan.close();

	}

}
