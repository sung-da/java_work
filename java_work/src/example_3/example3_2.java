// �Է¹��� �������� �о ���밪�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

package example_3;

import java.util.Scanner;

public class example3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("������ : ");
		int n = scan.nextInt();
		
		//System.out.println(Math.abs(n));
		
		if (n < 0) {
			System.out.println("���밪�� " + -n +"�Դϴ�.");
		} else {
			System.out.println("���밪�� " + n +"�Դϴ�.");
		}
		
		scan.close();

	}

}
