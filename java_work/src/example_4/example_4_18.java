// 입력한 정수값의 모든 약수와 그 개수를 표시하는 프로그램을 작성하시오(for문)

package example_4;

import java.util.Scanner;

public class example_4_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int n = sc.nextInt();
		int count = 0;
		
		for (int i = 1; i<=n ; i++) {
			if (n % i == 0)
				System.out.print(n);
		}
		/*
		Scanner sc = new Scanner(System.in);
		System.out.print("정수입력 : ");
		int n = sc.nextInt();
		int cnt = 0;
		
		System.out.print(n + "의 약수 : ");
		
		for(int i=1; i<=n; i++) {
			if(n % i == 0) {
				System.out.print(i);
				cnt++;
				if(i<n) {
				System.out.print(", ");
				}
			}
		}
		System.out.println("\n약수 개수 : " + cnt);
		sc.close();*/

	}

}
