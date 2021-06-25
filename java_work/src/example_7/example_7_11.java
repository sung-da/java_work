/* 정수를 좌우로 시프트한 값이, '정수 * 2의 거듭제곱' 및 '정수 / 2의 거듭 제곱'과 
 * 같은지 확인하는 프로그램을 작성하시오.
 * pow2()
 * <결과>
 * 정수 x를 n비트 시프트 합니다.
 * x : 100
 * n : 3
 * [a] x * (2의 3승) = 800
 * [b] x / (2의 3승) = 12
 * [c] x << 3 = 800
 * [d] x >> 3 = 800
 * [a]와 [c]의 값이 일치합니다.
 * [b]와 [d]의 값이 일치합니다.
 */

package example_7;

import java.util.Scanner;

public class example_7_11 {
	
	// 2의 거듭제곱을 반환하는 메서드
	static int pow2(int n) {
		
		int pw = 1;
		
		while(n-->0) {
			pw *= 2;
			//n--;
		}
		
		return pw;
		
		/* - 내 풀이
		int result = 1;
		
		for(int i=1 ; i<=n ; i++) {
			result = result * 2;
		}
		
		return result;
		*/
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x를 n비트 시프트 합니다.");
		
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		
		// 강사님 풀이
		int mPower = x * pow2(n);
		int dPower = x / pow2(n);
		int shiftLeft = x << n;
		int shiftright = x >> n;
		
		System.out.printf("[a] x * (2의 %d승) = %d\n", n, mPower);
		System.out.printf("[b] x / (2의 %d승) = %d\n", n, dPower);
		System.out.printf("[c] x << %d = %d\n", n, shiftLeft);
		System.out.printf("[d] x >> %d = %d\n", n, shiftright);
		
		// 삼항연산자
		System.out.println("[a]와 [c]의 값이 " + ((mPower == shiftLeft)?"일치합니다.":"불일치합니다."));
		System.out.println("[b]와 [d]의 값이 " + ((dPower == shiftright)?"일치합니다.":"불일치합니다."));

		/* - 내 풀이
		int a = x * pow2(n);
		int b = x / pow2(n);
		int c = x << 3;
		int d = x >> 3;
		
		System.out.println("[a]" + a);
		System.out.println("[b]" + b);
		System.out.println("[c]" + c);
		System.out.println("[d]" + d);
		
		if (mPower == shiftLeft)
		System.out.println("[a]와 [c]의 값이 일치합니다.");
		if (dPower == shiftright)
		System.out.println("[c]와 [d]의 값이 일치합니다.");
		*/
	}

}
