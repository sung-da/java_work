/* 난수(a =< 난수 =< b)를 생성하는 반환하는 random 메서드를 작성하시오. 
 * 메서드 안에서 난수를 생성하는 표준 라이브러리를 호출하시오.(Random())
 * (참고, b<=a 인 경우 a값을 그대로 반환할 것.)
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
				
		System.out.println("난수 생성");
		System.out.print("하한값 : ");
		int min = sc.nextInt();
		System.out.print("상한값 : ");
		int max = sc.nextInt();
		
		System.out.println("생성한 난수는 "+ random(min, max) + "입니다.");
	}

}
