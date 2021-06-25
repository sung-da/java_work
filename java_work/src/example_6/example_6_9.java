// double형인 배열의 모든 요소의 합과 평균을 구하는 프로그램을 작성하시오.
// 요소 수와 모든 요소의 값은 키보드로 입력받을 것

package example_6;

import java.util.Scanner;

public class example_6_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("요수 수 : ");
		int cnt = sc.nextInt();
		
		double[] a = new double[cnt];
		double sum = 0;
		
		for(int i = 0 ; i < cnt ; i++) {
			System.out.print("a["+i+"] = ");
			a[i] = sc.nextDouble();
			sum += a[i];
		}
		
		System.out.println("sum : " + sum);
		System.out.println("avg : " + sum / cnt);
		
		sc.close();
	}

}
