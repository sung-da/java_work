// 1���� n������ �������� �� ���� �����ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�

package example_4;

import java.util.Scanner;

public class example_4_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i<=n ; i++) {
			System.out.println(i+"�� ������ "+ (i*i)+"�Դϴ�.");
		}
		sc.close();
	}

}
