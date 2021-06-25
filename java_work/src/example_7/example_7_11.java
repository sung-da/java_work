/* ������ �¿�� ����Ʈ�� ����, '���� * 2�� �ŵ�����' �� '���� / 2�� �ŵ� ����'�� 
 * ������ Ȯ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * pow2()
 * <���>
 * ���� x�� n��Ʈ ����Ʈ �մϴ�.
 * x : 100
 * n : 3
 * [a] x * (2�� 3��) = 800
 * [b] x / (2�� 3��) = 12
 * [c] x << 3 = 800
 * [d] x >> 3 = 800
 * [a]�� [c]�� ���� ��ġ�մϴ�.
 * [b]�� [d]�� ���� ��ġ�մϴ�.
 */

package example_7;

import java.util.Scanner;

public class example_7_11 {
	
	// 2�� �ŵ������� ��ȯ�ϴ� �޼���
	static int pow2(int n) {
		
		int pw = 1;
		
		while(n-->0) {
			pw *= 2;
			//n--;
		}
		
		return pw;
		
		/* - �� Ǯ��
		int result = 1;
		
		for(int i=1 ; i<=n ; i++) {
			result = result * 2;
		}
		
		return result;
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� x�� n��Ʈ ����Ʈ �մϴ�.");
		
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		
		// ����� Ǯ��
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int shiftLeft = x << n;
		int shiftright = x >> n;
		
		System.out.printf("[a] x * (2�� %d��) = %d\n", n, mPower);
		System.out.printf("[b] x / (2�� %d��) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, shiftLeft);
		System.out.printf("[d] x >> %d = %d\n", n, shiftright);
		
		// ���׿�����
		System.out.println("[a]�� [c]�� ���� " + ((mPower == shiftLeft)?"��ġ�մϴ�.":"����ġ�մϴ�."));
		System.out.println("[b]�� [d]�� ���� " + ((dPower == shiftright)?"��ġ�մϴ�.":"����ġ�մϴ�."));

		/* - �� Ǯ��
		int a = x * pow2(n);
		int b = x / pow2(n);
		int c = x << 3;
		int d = x >> 3;
		
		System.out.println("[a]" + a);
		System.out.println("[b]" + b);
		System.out.println("[c]" + c);
		System.out.println("[d]" + d);
		
		if (mPower == shiftLeft)
		System.out.println("[a]�� [c]�� ���� ��ġ�մϴ�.");
		if (dPower == shiftright)
		System.out.println("[c]�� [d]�� ���� ��ġ�մϴ�.");
		*/
	}

}
