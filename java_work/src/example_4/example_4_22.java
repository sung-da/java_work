// ��ȣ����  '*'�� �����ؼ� ���� �ﰢ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// - ������ ��ġ�� ���� �Ʒ�
// - ������ ��ġ�� ���� ��

package example_4;

import java.util.Scanner;

public class example_4_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� �����ﰢ���� ǥ���ϰڽ��ϱ�? ");
		int num = sc.nextInt();
		/*
		for (int i = 0 ; i <= num ; i++) {
			for (int j = 0 ; j < i ; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		*/
		
		for (int i = num ; i >= 0 ; i--) {
			for (int j = 0 ; j <= i ; j++) {
				System.out.print("* ");				
			}
			System.out.println();
		}
		sc.close();

	}

}
