// n�� �Ƕ�̵�(�̵�ﰢ��)�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// i��° �࿡�� (i -1) * 2 + 1����'*'��ȣ�� ǥ��
// �������࿡�� (n - 1) * 2 + 1����'*'��ȣ�� ǥ��

package example_4;

import java.util.Scanner;

public class example_4_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �Ƕ�̵带 ǥ���ϰڽ��ϱ�? ");
		int num = sc.nextInt();
		
		for (int i = 0; i < num ; i++) {
			for(int j = 0 ; j < num-1-i ; j++) {
				System.out.print(" ");
			}
			for(int k=0 ; k<i*2+1 ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		sc.close();
	}

}
