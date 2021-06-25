// 양의 정수값을 입력받아서 소수인지 판정하는 프로그램을 작성하시오.
// 소수 : 2이상 n미만인 수 중 어떤 수로도 나누어지지 않는 정수
// 즉, 1과 자기자신만으로 나누어 떨어지는 수 

package example_4;

import java.util.Scanner;

public class example_4_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		do {
			System.out.print("2이상의 정수값 : ");
			n = sc.nextInt();
			
		} while (n <2);
		
		int i;		
		for(i = 2; i<n ; i++) {
			if (n % i == 0) 
				break;
		}
		
		if (i == n)
			System.out.println("소수 입니다");
		else
			System.out.println("소수가 아닙니다");		
		
		sc.close();

	}

}
