// 1���� n������ ������ ���� ���ؼ� ��ȯ�ϴ� �޼��带 �ۼ��Ͻÿ�.

package example_7;

import java.util.Scanner;

public class example_7_4 {
	
	static int sumUp(int n) {
		
		int sum = 0;
		
		for(int i=1 ; i<=n ; i++) {
			sum += i;
		}
		
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("���� n : ");
		int n = stdIn.nextInt();
		
		System.out.println("1���� n������ �� : " + sumUp(n));

	}

}
