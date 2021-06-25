// 1부터 n까지의 정수의 합을 구해서 반환하는 메서드를 작성하시오.

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
		
		System.out.print("정수 n : ");
		int n = stdIn.nextInt();
		
		System.out.println("1부터 n까지의 합 : " + sumUp(n));

	}

}
