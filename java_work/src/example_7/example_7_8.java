/* ����(a =< ���� =< b)�� �����ϴ� ��ȯ�ϴ� random �޼��带 �ۼ��Ͻÿ�. 
 * �޼��� �ȿ��� ������ �����ϴ� ǥ�� ���̺귯���� ȣ���Ͻÿ�.(Random())
 * (����, b<=a �� ��� a���� �״�� ��ȯ�� ��.)
 * int random(int a, int b)
 */

package example_7;

import java.util.Random;
import java.util.Scanner;

public class example_7_8 {
	
	static int random(int a, int b) {
		
		
		if (b <= a)
			return a;
		else {
			Random rand = new Random();
			int r = a + rand.nextInt(b+1-a); // a ~ b(b+1 +a -a)    
			return r;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("���� ����");
		System.out.print("���Ѱ� : ");
		int min = sc.nextInt();
		System.out.print("���Ѱ� : ");
		int max = sc.nextInt();
		
		System.out.println("������ ������ "+ random(min, max) + "�Դϴ�.");
	}

}
