// 4-14 ���α׷��� �����ؼ� ����Ӹ� �ƴ϶� ���ı��� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for�� ���)
// 5�� �Է¹��� ���, 1 + 2 + 3 + 4 + 5 = 15

package example_4;

import java.util.Scanner;

public class example_4_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int n = sc.nextInt();
		
		int total = 0;
		
		for (int i = 1; i <= n ; i++) {
			total += i;
			System.out.print(i);
			if (i != n)
				System.out.print(" + ");
		}
		System.out.println(" = "+ total);

	}

}
