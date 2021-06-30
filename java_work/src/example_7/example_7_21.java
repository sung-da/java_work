/* �迭 a�� �迭 b�� ��ü ��Ұ��� ��ȯ�ϴ� exchangeArray() �ż��帣�� �ۼ��Ͻÿ�.
 * �� �迭�� ��� ���� ���� �ʴٸ� ���� ���� �迭�� ���� ���߾� ��ȯ�Ͻÿ�.
 * ��> �迭 a�� ��Ұ� {1,2,3,4,5,6,7}�̰� �迭�� ��Ұ� {5,4,3,2,1}�� ��, 
 * 		�迭 a{5,4,3,2,1,6,7}�� �ǰ� �迭b�� {1,2,3,4,5}�� �˴ϴ�.
 * 
 * <���� ��>
 */

package example_7;

import java.util.Scanner;

public class example_7_21 {
	
	static void exchangeArray(int[] a, int[] b) {
		
		int n;
		if(a.length < b.length)
			n = a.length;
		else
			n = b.length;
		
		for(int i=0 ; i<n ; i++) {
			int temp = a[i];
			a[i] = b[i];
			b[i] = temp;
		}
		
//		if (a.length > b.length) {
//			for(int i=0 ; i<b.length ; i++) {
//				int temp = a[i];
//				a[i] = b[i];
//				b[i] = temp;
//			}
//		} else {
//			for(int i=0 ; i<a.length ; i++) {
//				int temp = a[i];
//				a[i] = b[i];
//				b[i] = temp;
//			}
//		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��� �� : ");
		int Anum = sc.nextInt();			
		
		int[] a = new int[Anum]; 	
		
		// �ռ� ������ �迭�� ������ ���� �Է�
		for(int i=0 ; i<Anum ;i++) {
			System.out.print("a[" + i + "] = ");
			a[i] = sc.nextInt();
		}
		
		
		System.out.print("�迭 b�� ��� �� : ");	
		int Bnum = sc.nextInt();		
		
		int[] b = new int[Bnum]; 		
		
		// �ռ� ������ �迭�� ������ ���� �Է�
		for(int i=0 ; i<Bnum ;i++) {
			System.out.print("b[" + i + "] = ");
			b[i] = sc.nextInt();
		}
		
		exchangeArray(a,b);
		
		System.out.println("�迭 a�� b�� ��ü ��Ҹ� ��ȯ");
		for(int i=0 ; i<Anum ;i++) {
			System.out.println("a[" + i + "] = " + a[i]);
		}
		System.out.println();
		for(int i=0 ; i<Bnum ;i++) {
			System.out.println("b[" + i + "] = " + b[i]);
		}
	}

}
