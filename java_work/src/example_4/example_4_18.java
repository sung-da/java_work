// �Է��� �������� ��� ����� �� ������ ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�(for��)

package example_4;

import java.util.Scanner;

public class example_4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i<=n ; i++) {
			if (n % i == 0)
				System.out.print(n);
		}
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int n = sc.nextInt();
		int cnt = 0;
		
		System.out.print(n + "�� ��� : ");
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.print(i);
				cnt++;
				if(i<n) {
				System.out.print(", ");
				}
			}
		}
		System.out.println("\n��� ���� : " + cnt);
		sc.close();*/

	}

}
