// �μ� m�� ������ ��(��)�� ������ ǥ���ϴ� pringSeason �޼��带 �ۼ��Ͻÿ�.
// m���� ���� ��(3,4,5), ����(6,7,8), ����(9,10,11), �ܿ�(12,1,2) �� ǥ���ϰ�
// �� ���� ���� ���� �ƹ��͵� ǥ������ �ʵ��� �ۼ��Ͻÿ�.

package example_7;

import java.util.Scanner;

public class example_7_6 {
	
	// �޼��� ����
	static void printSeason(int m) {
		if (m == 3 || m==4 || m==5)
			System.out.println("��");
		else if (m == 6 || m == 7 || m == 8)
			System.out.println("����");
		else if (m == 9 || m == 10 || m == 11)
			System.out.println("����");
		else if (m == 12 || m == 1 || m == 2)
			System.out.println("�ܿ�");
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("��(��) : ");
			month = stdIn.nextInt();
		} while (month <1 || month > 12);
		
		printSeason(month);
		
//		System.out.print("��(��) : ");
//		int a = stdIn.nextInt();
//		printSeason(a);
		
		

	}

}
