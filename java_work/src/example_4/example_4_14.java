// 1���� n������ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�(for�� ���)

package example_4;

import java.util.Scanner;

public class example_4_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= n ; i++) {
			total += i;
		}
		System.out.println("�� : "+ total);

	}

}
