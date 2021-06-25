// float형 변수와 double형 변수에 값을 읽어서 표시하는 프로그램을 작성하시오.

package example_5;

import java.util.Scanner;

public class example_5_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("float형 변수 : ");
		float x = sc.nextFloat();
		
		System.out.print("double형 변수 : ");
		double y = sc.nextDouble();
		
		System.out.println(x);
		System.out.println(y);
		
		sc.close();
	}

}
