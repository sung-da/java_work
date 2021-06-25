/* -- 비트 연산자(꼭 해볼것!!) --
 * 정수 x를 오른쪽으로 n비트 회전한 값을 반환하는 rotateRight 메서드와
 * 왼쪽으로 n비트 회전한 값을 반환하는 rotateLeft 메서드를 작성하시오.
 * int rotateRight();
 * int rotateLeft();
 * 
 * 오른쪽으로 회전
 * 0000 0010
 * 0000 0001
 * 1000 0000
 * 0100 0000
 * 
 * 왼쪽으로 회전
 * 0100 0000
 * 1000 0000
 * 0000 0001
 * 0000 0010 
 * 
 * int 4byte = 32bit
 * 
 * <실행 예>
 * x : 1565857138
 * n : 6
 * 회전 전 =
 * 오른쪽 회전 후 =
 * 왼쪽 회전 후 =
 */

package example_7;

import java.util.Scanner;

public class example_7_12 {
	
	// bit를 출력하는 함수  - 비트연산자 (|,&)
	// x>>>y 정수 x의 각 비트를 y만큼 오른쪽으로 이동
	static void printBits(int x) {
		
		for(int i=31 ; i>=0 ; i--) {
			System.out.print( ((x >>> i & 1) == 1)? '1':'0');		
		}
	}

	
	static int rotateRight(int x, int n) {
		if(n<0)
			return rotateLeft(x, -n);
		int ret;
		n = n % 32;
		ret =( n==0? x : (x >>> n) | (x << (32-n)) );
		
		return ret;
	}
	
	static int rotateLeft(int x, int n) {
		int ret;
		n = n % 32;
		ret = ( n==0? x : (x << n) | (x >>> (32-n)) );
		return ret;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 x를 n비트 회전");
		
		System.out.print("x : ");
		int x = sc.nextInt();
		System.out.print("n : ");
		int n = sc.nextInt();
		
		System.out.print("회전 전		= ");
		printBits(x);
		
		System.out.print("\n오른쪽 회전 후	= ");
		printBits(rotateRight(x, n));
		
		System.out.print("\n왼쪽 회전 후	= ");
		printBits(rotateLeft(x, n));
		

	}

}
