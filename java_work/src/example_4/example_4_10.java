// ���� ������(n)�� �о 1���� n���� ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// while��

package example_4;

import java.util.Scanner;

public class example_4_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		int x;
		
		do {
			System.out.print("���� ������ : ");
			x = scan.nextInt();
		} while(x <= 0);
		
		int total = 1;
		int i = 1;
		
		while(i <= x) {
			total = total * i;
			i++;
		}
		System.out.println("��� : " + total);
		
		scan.close();

	}

}
