// 3���� �������� �о �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ����� �Ǽ��� ǥ���ϼ���

package example_5;

import java.util.Scanner;

public class example_5_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = sc.nextInt();
		
		System.out.print("���� b : ");
		int b = sc.nextInt();
		
		System.out.print("���� c : ");
		int c = sc.nextInt();
		
		int sum;
		sum = a+b+c;
		
		double avg;
		//avg = sum / 3.0;
		avg = (double)sum / 3;
		
		System.out.printf("�հ� :%d\n", sum);
		System.out.printf("��� : %.3f\n", avg);
		
		sc.close();

	}

}
