// �迭�� ��Ҹ� �Է¹޾� Ư�� ���� ������ ��Ҹ� ã���ÿ�.
// ���ϰ��� ��Ұ� ������ ������ ���� �տ� ��ġ�� ��Ҹ� ã�� ���α׷��� �ۼ��Ͻÿ�.
// ���ϰ��� ��Ұ� ������ ������ ���� �ڿ� ��ġ�� ��Ҹ� ã�� ���α׷��� �ۼ��Ͻÿ�.

package example_6;

import java.util.Scanner;

public class example_6_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0 ; i< n ; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextInt();
		}
		
		System.out.print("ã�� ���� : ");
		int f = sc.nextInt();
		/*
		for(int i =0 ; i<n ; i++) {
			if(a[i] == f) {
				System.out.print("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				break;
			}
		}
		*/
		for(int i = n-1; i >= 0 ; i--) {
			if(a[i] == f) {
				System.out.print("ã�� ���ڴ� a["+i+"]�� �ֽ��ϴ�.");
				break;
			}
		}

		sc.close();
	}

}
