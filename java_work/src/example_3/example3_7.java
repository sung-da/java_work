// 2���� ���� a, b ���� �о a, b�� ��� ���踦 ������ ���� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// "a�� ũ��.", "b�� ũ��.", "a�� b�� ����."

package example_3;

import java.util.Scanner;

public class example3_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� a : ");
		int a = scan.nextInt();
		
		System.out.print("���� b : ");
		int b = scan.nextInt();
		
		if (a > b) {
			System.out.println("a�� ũ��.");
		} else if (a < b) {
			System.out.println("b�� ũ��.");
		} else {
			System.out.println("a�� b�� ����.");
		}
		
		scan.close();

	}

}
