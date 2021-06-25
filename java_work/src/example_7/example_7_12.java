/* -- ��Ʈ ������(�� �غ���!!) --
 * ���� x�� ���������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rotateRight �޼����
 * �������� n��Ʈ ȸ���� ���� ��ȯ�ϴ� rotateLeft �޼��带 �ۼ��Ͻÿ�.
 * int rotateRight();
 * int rotateLeft();
 * 
 * ���������� ȸ��
 * 0000 0010
 * 0000 0001
 * 1000 0000
 * 0100 0000
 * 
 * �������� ȸ��
 * 0100 0000
 * 1000 0000
 * 0000 0001
 * 0000 0010 
 * 
 * int 4byte = 32bit
 * 
 * <���� ��>
 * x : 1565857138
 * n : 6
 * ȸ�� �� =
 * ������ ȸ�� �� =
 * ���� ȸ�� �� =
 */

package example_7;

import java.util.Scanner;

public class example_7_12 {
	
	// bit�� ����ϴ� �Լ�  - ��Ʈ������ (|,&)
	// x>>>y ���� x�� �� ��Ʈ�� y��ŭ ���������� �̵�
	static void printBits(int x) {
		
		for(int i=31 ; i>=0 ; i--) {
			System.out.print( ((x >>> i & 1) == 1)? '1':'0');		
		}
	}

	
	static int rotateRight(int x, int n) {
		if(n<0)
			return rotateLeft(x, -n);
		int ret;
		n = n % 32;
		ret =( n==0? x : (x >>> n) | (x << (32-n)) );
		
		return ret;
	}
	
	static int rotateLeft(int x, int n) {
		int ret;
		n = n % 32;
		ret = ( n==0? x : (x << n) | (x >>> (32-n)) );
		return ret;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x�� n��Ʈ ȸ��");
		
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		
		System.out.print("ȸ�� ��		= ");
		printBits(x);
		
		System.out.print("\n������ ȸ�� ��	= ");
		printBits(rotateRight(x, n));
		
		System.out.print("\n���� ȸ�� ��	= ");
		printBits(rotateLeft(x, n));
		

	}

}
