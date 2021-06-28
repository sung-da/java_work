/* 정수 x의 pos번째 있는 비트를 1로 변경한 값을 반환하는 set 메서드, 
 * 0으로 변경한 값을 반환하는 reset 메서드
 * 그리고 해당 위치의 비트를 반전시켜서 반환하는 inverse를 작성하자.
 * 
 * <실행 예>
 * 정수 x의 pos 번째 비트를 변경합니다.
 * x : 1431655765
 * pos : 10
 * 
 * x		= 32bit 형태 ex) 00000000 11111111 00000000 11111111
 * set()	=
 * reset()	=
 * inverse()=
 */

package example_7;

import java.util.Scanner;

public class example_7_13 {
	
	static void printBits(int x) {
		for(int i = 31 ; i>=0 ; i--) {
			System.out.print(((x >>> i & 1) == 1)? '1':'0');
			/*삼항연산자를 if문으로 풀었을 때
			if ((x >>> i & 1) == 1) {
				System.out.print('1');
			} else {
				System.out.print('0');
			}
			*/
		}
	}
	
	// 0=>1로 바꿔라, 1=>1로 유지
	static int set(int x, int pos) {
		int ret = x | (1 << pos);
		return ret;
	}
	
	// 1=>0로 바꿔라, 0=>0로 유지
	static int reset(int x, int pos) {
		return x & ~(1 << pos);
	}
	
	// 1=>0로 바꿔라, 0=>1로 유지
	static int inverse(int x, int pos) {
		return x ^ (1 << pos);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x의 pos 번째 비트를 변경합니다.");
		
		System.out.print("정수 x : ");
		int x = sc.nextInt();
		
		System.out.print("pos : ");
		int pos = sc.nextInt();
		
		System.out.print("x 		= ");
		printBits(x);
		
		System.out.print("\nset(x, pos)	= ");
		printBits( set(x, pos));
		
		System.out.print("\nreset(x, pos)	= " );
		printBits(reset(x, pos));
		
		System.out.print("\ninverse(x, pos)	= " );
		printBits(inverse(x, pos));
		
		
	}

}
