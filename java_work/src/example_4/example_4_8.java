// �Է¹��� ������ ������ŭ "*"�� "+"�� ������ ���� ǥ���ϴ� ���α׷��� �ۼ��غ��ÿ�.
// ���������� ���ٷ� �����ϼ���

package example_4;

import java.util.Scanner;

public class example_4_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��� ǥ���ұ��? ");
		int num = scan.nextInt();
		/*
		for(int i = 0; i < num; i++) {
			System.out.print("*");
			System.out.print("+");
		}
		System.out.println("\n");
		*/
		if(num > 0) {
			int i = 0;
			while(i < num) {
				System.out.print("*");
				System.out.print("+");
				i++;
			}
			System.out.println();
		}
		scan.close();

	}

}
