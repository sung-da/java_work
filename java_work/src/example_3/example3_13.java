// 2���� �������� �о �� ���� ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�

package example_3;

import java.util.Scanner;

public class example3_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		int diff;
		
		if (a >= b)
			diff = a - b;
		else
			diff = b - a;
			
		System.out.println("�� ���� ����: "+ diff);
		
		scan.close();

	}

}
