// �迭�� ���� ������ ����(������ ������ �ǵ��� ������ �ٲ�) ���α׷��� �ۼ��Ͻÿ�.
/*
<���>
��Ҽ� : 3
a[0] = 22
a[1] = 57
a[2] = 11
a[3] = 32
��Ҹ� ������
a[0] = 22
a[1] = 32
a[2] = 57
a[3] = 11

�ݺ�
1.2���� ��Ҹ� ����
2.������ȯ
*/

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		
		for(int i=0 ; i<n*2 ; i++) {
			int idx1 = rand.nextInt(n);
			int idx2 = rand.nextInt(n);
			
			int t = a[idx1];
			a[idx1] = a[idx2];
			a[idx2] = t;
		}
		
		for (int i = 0 ; i <n ; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		sc.close();

	}

}
