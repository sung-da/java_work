// �Է��� ������ŭ * �� ǥ���ϴ� ������ �����ؼ� 
// 5�� ������ �ٹٲ��ؼ� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for�� ���)

package example_4;

import java.util.Scanner;

public class example_4_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� *�� ǥ���ұ��? ");
		int n = sc.nextInt();
		/*		
		for (int i = 1 ; i <= n ; i++) {
			System.out.print("*");
			if (i % 5 == 0)
				System.out.println("");
		}*/
		
		for (int i = 0 ; i <n ; i++) {
			System.out.print("*");
			if (i % 5 == 4)
				System.out.println();
		}
		
		sc.close();

	}

}
