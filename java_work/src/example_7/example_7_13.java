/* ���� x�� pos��° �ִ� ��Ʈ�� 1�� ������ ���� ��ȯ�ϴ� set �޼���, 
 * 0���� ������ ���� ��ȯ�ϴ� reset �޼���
 * �׸��� �ش� ��ġ�� ��Ʈ�� �������Ѽ� ��ȯ�ϴ� inverse�� �ۼ�����.
 * 
 * <���� ��>
 * ���� x�� pos ��° ��Ʈ�� �����մϴ�.
 * x : 1431655765
 * pos : 10
 * 
 * x		= 32bit ���� ex) 00000000 11111111 00000000 11111111
 * set()	=
 * reset()	=
 * inverse()=
 */

package example_7;

import java.util.Scanner;

public class example_7_13 {
	
	static void printBits(int x) {
		for(int i = 31 ; i>=0 ; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1':'0');
			/*���׿����ڸ� if������ Ǯ���� ��
			if ((x >>> i & 1) == 1) {
				System.out.print('1');
			} else {
				System.out.print('0');
			}
			*/
		}
	}
	
	// 0=>1�� �ٲ��, 1=>1�� ����
	static int set(int x, int pos) {
		int ret = x | (1 << pos);
		return ret;
	}
	
	// 1=>0�� �ٲ��, 0=>0�� ����
	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}
	
	// 1=>0�� �ٲ��, 0=>1�� ����
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x�� pos ��° ��Ʈ�� �����մϴ�.");
		
		System.out.print("���� x : ");
		int x = sc.nextInt();
		
		System.out.print("pos : ");
		int pos = sc.nextInt();
		
		System.out.print("x 		= ");
		printBits(x);
		
		System.out.print("\nset(x, pos)	= ");
		printBits( set(x, pos));
		
		System.out.print("\nreset(x, pos)	= " );
		printBits(reset(x, pos));
		
		System.out.print("\ninverse(x, pos)	= " );
		printBits(inverse(x, pos));
		
		
	}

}
