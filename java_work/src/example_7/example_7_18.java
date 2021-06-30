/* �迭 a�κ��� ��� a[idx]�� �����ϴ� aryRmv �޼��带 �ۼ��Ͻÿ�.
 * a[idx]�� ���� ��, �� �ڿ� �ִ� ��ҵ��� ������ �ϳ��� �̵��Ͻÿ�.
 * �̵� �Ŀ� ��ԵǴ� ������ ��� a[a.length-1]�� ���� �̵��ϱ� ���� ������ ���� �����Ͻÿ�.
 * ��) �迭 a�� ��Ұ� {1,3,4,7,9,11} �� ��,
 *     3��(�ε��� 1)�� �����ϸ� {1,4,7,9,11,11}
 * 
 * <���� ��>
 * ��� �� : 6
 * a[0] : 1
 * a[1] : 3
 * a[2] : 4
 * a[3] : 7
 * a[4] : 9
 * a[5] : 11
 * ������ ����� �ε��� : 2
 * a[0] : 1
 * a[1] : 4
 * a[2] : 7
 * a[3] : 9
 * a[4] : 11
 * a[5] : 11
 */

package example_7;

import java.util.Scanner;

public class example_7_18 {
	
	// �Ű����� : a�迭, ������ �ε���
	// ���ϰ� : ����
	// �Լ� ���� : ������ ����� ���ؽ��� ���� �ε����� ���� �Է�, �迭�� ������ �ε��� ������
	static void aryRmv(int[] a, int idx) {
		
		if(idx >= 0 && idx< a.length) {					// �迭 �� ������ �ε��� ���� �ƴ� ��� ����ó��
			for(int i=idx ; i<a.length-1 ; i++) {		// �ε��� ~ ������ �ε��� ������
				a[i] = a[i + 1];						// ���� �ε����� �ش��ϴ� ���� ���� �ε��� ��ġ�� �Է�
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 a�κ��� ��� a[idx]�� ����");
		
		System.out.print("��� �� : ");	//���� �Է�
		int num = sc.nextInt();			// �迭�� ������ ���������� ����
		
		int[] a = new int[num]; 		// �迭 a�� �Է¹��� num ������ ����
		
		
		// �ռ� ������ �迭�� ������ ���� �Է�
		for(int i=0 ; i<num ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("������ ����� �ε��� : ");
		int idx = sc.nextInt();			// �迭���� ������ �ε��� ��
		
		
		// �μ��� a�迭�� ������ �ε���, ���ϰ��� ��� ��.
		aryRmv(a, idx);
		
		for(int i=0 ; i<num ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		

	}

}
