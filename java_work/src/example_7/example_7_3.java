/* 3개의 int형 인수 a,b,c에서 중간값을 구하느 med메서드를 작성하시오.
 * 
 */

package example_7;

import java.util.Scanner;

public class example_7_3 {
	
	static int med(int a, int b, int c) {
		
		int med;
		if (a > b)
			if (b > c)	// c b a
				med = b;
			else if (a < c) // b a c
				med = a;
			else
				med = c; // b c a
		else if (a > c) // c a b
			med = a;
		else if (b > c) // a c b
			med = c;
		else  
			med = b;  // a b c
		return med;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("정수 a : ");
		int a = stdIn.nextInt();
		System.out.print("정수 b : ");
		int b = stdIn.nextInt();
		System.out.print("정수 c : ");
		int c = stdIn.nextInt();
		
		System.out.println("중간값은 "+med(a,b,c));

	}

}
