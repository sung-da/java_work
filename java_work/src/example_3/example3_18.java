// 2���� �������� ��������(ū�� -> ������)���� �����ϴ� ���α׷��� �ۼ��Ͻÿ�(�Լ����X)
// a, b -> a������ ū��, b������ ������ �Ҵ�
// a = 1, b = 2  -> a = 2, b = 1
// a = 2, b = 1  -> a = 2, b = 1

package example_3;

import java.util.Scanner;

public class example3_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a: ");
		int a = scan.nextInt();
		
		System.out.print("���� b: ");
		int b = scan.nextInt();
		
		if (a < b) {
			int temp = a;
			a = b;
			b = temp;
		}
		System.out.println("ū �� : " + a);
		System.out.println("���� �� : " + b);
		
		scan.close();

	}

}
