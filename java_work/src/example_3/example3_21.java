// ���� 1 ~ 12�� ���������� �Է¹޾Ƽ� �ش��ϴ� ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� �Է��ϼ���(1 ~ 12) : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("���� ������ �ܿ��̳׿�.");
			break;
		case 3: case 4: case 5:
			System.out.println("���� ������ ���̳׿�.");
			break;
		case 6: case 7: case 8:
			System.out.println("���� ������ �����̳׿�.");
			break;
		case 9: case 10: case 11:
			System.out.println("���� ������ �����̳׿�.");
			break;
		default:
			System.out.println("�߸��� ���� �Է��ϼ̽��ϴ�");
			break;
				
		}
		scan.close();

	}

}
