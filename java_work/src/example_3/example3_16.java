// 키보드에서 입력한 3개의 정수 중 중앙값을 구해서 표시하는 프로그램을 작성하시오.
// 예를 들어 2,3,1의 중앙값은 2 / 1,2,1의 중앙값은 1 / 3,3,3 중앙값은 3

package example_3;

import java.util.Scanner;

public class example3_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 a: ");
		int a = scan.nextInt();
		
		System.out.print("정수 b: ");
		int b = scan.nextInt();
		
		System.out.print("정수 c: ");
		int c = scan.nextInt();
		
		int mid;
		
		if (a >= b)
			if (b >= c)
				mid = b;
			else if (a <= c)
				mid = a;
			else
				mid = c;
		else if (a > c)
			mid = a;
		else if (b > c)
			mid = c;
		else
			mid = b;
		
		System.out.println("중간값은 " + mid);
		
		scan.close();

	}

}
