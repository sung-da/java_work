/* �迭 z�� ����(��Ҽ��� ���� ��� ����� ���� ���� �迭)�� �����ؼ� ��ȯ�ϴ�
 * cloneArray �޼��带 �����Ͻÿ�.
 * ��) �迭 a�� ��Ұ� {1,2,3,4,5} => �迭b�� ��Ұ� {1,2,3,4,5}
 */

package example_7;

import java.util.Scanner;

public class example_7_22 {
	
	// �迭�� ��ȯ
	static int[] cloneArray(int[] x) {
		
		int[] c = new int[x.length];
		for(int i=0 ; i<x.length ;i++) {
			c[i] = x[i];
		}
		
		return c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��� �� : ");
		int num = sc.nextInt();			
		
		int[] a = new int[num];
		
		
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
				
		int[] b = cloneArray(a);
		
		System.out.println("�迭 a�� �����ؼ� �迭 b�� ����");
		for(int i=0 ; i<num ;i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}

	}

}
