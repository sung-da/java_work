// double���� �迭�� ��� ����� �հ� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��� ���� ��� ����� ���� Ű����� �Է¹��� ��

package example_6;

import java.util.Scanner;

public class example_6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int cnt = sc.nextInt();
		
		double[] a = new double[cnt];
		double sum = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / cnt);
		
		sc.close();
	}

}
