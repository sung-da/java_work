// ���� c�� n�� ǥ���ϴ� putChar �޼���� 
// �� �޼��带 ���ο��� ȣ���� '*'�� n�� ǥ���ϴ� putStar �޼��带 �ۼ��Ͻÿ�.
// �� �޼������ ����ؼ� ���� �ﰢ���� ����� ���α׷��� �ۼ��Ͻÿ�.
/*
 * <���>
 * ���� �Ʒ��� ������ �ﰢ���� ǥ��
 * �ܼ� : 6
 * *
 * **
 * ***
 * ****
 * *****
 * ******
 */

package example_7;

import java.util.Scanner;

public class example_7_7 {
	
	static void putChar(char c, int n) {
		
		for(int i=0 ; i<n ; i++) {
			System.out.print(c);
		}
		
//		while(n>0) {
//			System.out.print(c);
//			n--;
//		}
		
	}
	
	static void putStars(int n) {
		putChar('*',n);

	}
	
	static void putDallors(int n) {
		putChar('$',n);

	}
	
	static void putExpr(int n, char chars) {
		putChar(chars,n);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Ʒ��� ������ �ﰢ���� ǥ��");
		System.out.print("�ܼ� : ");
		int n = sc.nextInt();
		System.out.print("���� : ");
		char c = sc.next().charAt(0);
		
		for(int i=1 ; i<=n ; i++) {
			//putStars(i);
			//putDallors(i);
			putExpr(i, c);
			System.out.println();
		}
		
	}

}
