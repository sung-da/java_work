/* "���� ������: " �̶�� �޼����� �������� �Է��ϸ� ���� �Ųٷ� ��ȯ�ϴ� readPlusInt �޼��带 �ۼ��Ͻÿ�.
 * (0�̳� ������ �ԷµǸ� ���Է��ϵ��� �� ��.)
 * <���>
 * ���� ������ : 521
 * �ݴ�� ��ȯ : 125
 */

package example_7;

import java.util.Scanner;

public class example_7_9 {
	
	static int readPlusInt() {
		Scanner sc = new Scanner(System.in);
		
		int x;
		do {
			System.out.print("���� ������ : ");
			x = sc.nextInt();
		} while (x<=0);
			
		return x;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x;
		
		do {
			int n = readPlusInt();
			
			// ������ ������ �Ųٷ� ��ȯ�ϴ� ó�� ����
			while(n>0) {
				System.out.print(n%10);		//������
				n = n/10;					// ��
			}
			System.out.println();
			do {
				System.out.print("�ٽ� �� ��? (1:yes, 0:no)");
				x = sc.nextInt();
			} while (x!=0 && x!=1);
		} while (x==1);
		
	}

}
