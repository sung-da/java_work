// ���� �ٸ� ��Ұ� ������ ���� ������ �ʵ��� [6-10] ���α׷��� �����Ͻÿ�
// �ߺ��� �ȵ�, �迭�� 10 ����

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int cnt;
		do {
			System.out.print("��� �� : ");
			cnt = sc.nextInt();
		} while (cnt > 10);
		
		int[] a = new int[cnt];
		
		
		for(int i = 0 ; i<cnt ; i++) {
			int j;
			do {
				a[i] = rand.nextInt(10)+1;
				for (j = 0 ; j < cnt ; j++) {
					if (a[i] == a[j])
						break;
				}
			} while (j<i);
		}
		
		for (int i = 0 ; i <cnt ; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		sc.close();

	}

}
