// n���� ���� �Ƕ�̵� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_4;

import java.util.Scanner;

public class example_4_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Ƕ�̵带 ǥ���ϰڽ��ϱ�? ");
		int num = sc.nextInt();
		
		for (int i = 1; i <= num ; i++) {
			// ���� for��
			for(int j = 1 ; j <= num-i ; j++) {
				System.out.print(" ");
			}
			// �� ���� for��
			for(int k=1 ; k <= i*2-1 ; k++) {	
				if (i > 9)
					System.out.print(i%10);
				else
					System.out.print(i);
			}
			System.out.println();
		}
		sc.close();

		
	}

}
