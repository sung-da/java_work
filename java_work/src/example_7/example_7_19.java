/* �迭 a�� ��� a[idx]�� x�� �����ϴ� insertArray() �޼��带 �ۼ��Ͻÿ�.
 * ���� �ÿ��� a[idx] ~ a[a.length-2] �� �ϳ��� �ڷ� �̵����Ѿ� �Ѵ�.
 * ��) �迭 a�� ��Ұ� {1,3,4,7,9,11} �� ��,
 *     �ε��� 2�� 99���� �Է��ϸ� {1,3,99,4,7,9} 
 */

package example_7;

import java.util.Scanner;

public class example_7_19 {
	
	static void insertArray(int[] a, int idx, int num) {

		if(idx >= 0 && idx< a.length) {					// �迭 �� ������ �ε��� ���� �ƴ� ��� ����ó��
			for(int i=a.length-1 ; i>idx ; i--) {		
				a[i] = a[i - 1];						
			}
			a[idx] = num;
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 a�� ����");
		
		System.out.print("��� �� : ");	//���� �Է�
		int num = sc.nextInt();			// �迭�� ������ ���������� ����
		
		int[] a = new int[num]; 		// �迭 a�� �Է¹��� num ������ ����
		
		
		// �ռ� ������ �迭�� ������ ���� �Է�
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("������ ����� �ε��� : ");
		int idx = sc.nextInt();			// �迭���� ���� �� �ε��� ��
		System.out.print("������ �� : ");
		int input = sc.nextInt();			// �迭�� ���� �� ��
		
		// �μ��� a�迭�� ���� �� �ε����� ��, ���ϰ��� ��� ��.
		insertArray(a, idx, input);
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}

	}

}
