// �迭�� ��� ���� ���� ����� ���� �Է¹޾Ƽ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ǥ�� ������ �迭 �ʱⰪ�� ���� ��������, �� ����� ���� ��ǥ�� �����ϰ� {}�� ���� ���·�

package example_6;

import java.util.Scanner;

public class example_6_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int cut = sc.nextInt();
		
		int[] a = new int[cut];
		
		for(int i = 0 ; i<a.length ; i++) {
			System.out.print("a["+i+"] = ");
			int n = sc.nextInt();
			a[i] = n;
		}
		
		System.out.print("a = {");
		if (cut >= 2)
			for(int i = 0 ; i < cut ; i++) {			
				System.out.print( a[i]);
				if (i < cut-1)
					System.out.print(",");
			}
		else if (cut >= 1)
			System.out.print( a[cut-1]);
		System.out.print("}");
		sc.close();
	}

}
