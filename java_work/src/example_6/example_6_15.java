/* 
 * ���� 1~12�� ���ڷ� ǥ���ϰ� �ش� ���� ���� �ܾ �Է��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���� ����
 * 
 * ���̵�0. �迭 �ۼ� ���
 * ���̵�1. 1���ݺ�
 * ���̵�2. �н��� ���ϴ� ���� �ݺ��ؼ� ���� ����
 * ���̵�3. ���� ���� �����ؼ� ǥ������ �ʵ���
 * 
 * hint 1-���ڿ� �� ���� ���: equal(���ڿ�),
 * 		2-�������� ����
 * 
 * <���> - ���̵� 2
 * �ش� ���� ���� �ܾ �Է��Ͻÿ�.
 * ù���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���
 * 12�� : December �н��ڰ� �Է�
 * �����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0) 1
 * 10�� : June
 * Ʋ�Ƚ��ϴ�.
 * 10�� : October
 * �����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0) 0
 */


package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("�ش� ���� ���� �ܾ �Է��Ͻÿ�."
				+ "\nù���ڴ� �빮��, �������� �ҹ��ڷ� �Է��ϼ���");
		
		String[] month = {"January", "February", "March", "April",
				"May", "June", "July", "August", "September", 
				"October", "November", "December"};
		int restart = 1;
		int n;
		
		do {
			n = rand.nextInt(12)+1;
			String spell;

			do {
				System.out.print(n + "�� : ");
				spell = sc.next();
				if (!spell.equals(month[n-1]))
					System.out.println("Ʋ�Ƚ��ϴ�.");
			} while (!spell.equals(month[n-1]));
			
			System.out.println("�����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0)");
			restart = sc.nextInt();
			
		} while (restart == 1);
		
		sc.close();
		
	}

}
