// ���� �������� �о �Է¹��� ������ �ڸ����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// while��

package example_4;

import java.util.Scanner;

public class example_4_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		/*
		int ret = 1;
		while (ret == 1) {
			System.out.print("���� ������ : ");
			int n = scan.nextInt();

			if (n > 0) {
				String len = Integer.toString(n);
				System.out.println("�ڸ��� : "+ len.length());
				
				System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�? Yes:1, No:0 ");
				ret = scan.nextInt();
				
				scan.close();
			} else {
				System.out.println("�ٽ� �Է��ϼ���");
			}
			*/
		
		int x;
		
		do {
			System.out.print("���� ������ : ");
			x = scan.nextInt();
		} while(x <= 0);
		
		int digit = 0;
		
		while(x > 0) {
			x = x /10;
			digit++;
		}
		System.out.print("�ڸ��� : "+ digit);

	}

}
