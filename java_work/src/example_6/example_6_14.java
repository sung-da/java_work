// �迭�� a�� ��� ��Ҹ� �������� �迭 b�� �����ϴ� ���α׷��� �ۼ��Ͻÿ�.
// �� �迭�� ��Ҽ��� �����ϴٰ� �����ص� ����

package example_6;

import java.util.Scanner;

public class example_6_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		int[] b = new int[n];
		
		for(int i = 0 ; i<n ; i++) {
			System.out.print("a["+i+"]= ");
			a[i] = sc.nextInt();
		}
		
		for(int i= 0 ; i<n ; i++ ) {
			b[i] = a[n-1-i];
		}
		
		for (int i = 0 ; i <n ; i++) {
			System.out.println("b["+i+"] = " + b[i]);
		}
		sc.close();

	}

}
