// 2���� ���� �������� �о, ���ڰ� ������ ����̸� "B�� A�� ����̴�."��� ǥ���ϰ�,
// �׷��� ������ "B�� A�� ����� �ƴϴ�."��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ��� -> ����� ������ �������� ��

package example_3;

import java.util.Scanner;

public class example3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ A : ");
		int A = scan.nextInt();
		
		System.out.print("������ B : ");
		int B = scan.nextInt();
		
		if (A % B == 0) {
			System.out.print("B�� A�� ����̴�.");
		} else {
			System.out.print("B�� A�� ����� �ƴϴ�.");
		}

	}

}
