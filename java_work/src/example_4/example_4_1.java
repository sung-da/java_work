// �������� ��ȣ�� �����ؼ� ǥ���ϴ� ���α׷��� 
// ���ϴ� ��ŭ �ݺ��ؼ� �Է� �� ǥ���ϵ��� �ۼ��Ͻÿ�.

package example_4;

import java.util.Scanner;

public class example_4_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int retry = 1;
				
		while (retry == 1) {
			System.out.print("�������� �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if (num > 0)
				System.out.println("����Դϴ�.");
			else if (num < 0)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("0�Դϴ�.");
			
			System.out.print("retry? Yes:1, No:0 ");
			retry = scan.nextInt();
						
		}
		
		/*
		int retry;
		
		do {
			System.out.print("�������� �Է��ϼ��� : ");
			int num = scan.nextInt();
			
			if (num > 0)
				System.out.println("����Դϴ�.");
			else if (num < 0)
				System.out.println("�����Դϴ�.");
			else
				System.out.println("0�Դϴ�.");
			
			System.out.print("�ٽ� �Է��Ͻðڽ��ϱ�? Yes:1, No:0 ");
			retry = scan.nextInt();
			
		} while (retry == 1);
		*/
		
		scan.close();

	}

}
