// 2���� �Ǽ��� �߿��� ū ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�

package example_3;

import java.util.Scanner;

public class example3_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�Ǽ��� a: ");
		double a = scan.nextDouble();
		
		System.out.print("�Ǽ��� b: ");
		double b = scan.nextDouble();
		
		/*
		if (a > b) {
			System.out.println("a�� b���� Ů�ϴ�");
		} else if (a < b) {
			System.out.println("b�� a���� Ů�ϴ�");
		}
		*/
		/*
		double max;
		
		if (a > b)
			max = a;
		else
			max = b;
		*/
		
		double max = a > b ? a: b;
		
		System.out.println("���߿� ū ���� " + max);
		
		scan.close();

	}

}
