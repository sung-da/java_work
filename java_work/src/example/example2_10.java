package example;

import java.util.Scanner;

public class example2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.print("반지름 :");
		double r = sc.nextDouble();
		
		double r2 = Math.pow(r, 2);
		double r3 = Math.pow(r, 3);
		
		System.out.print("구의 겉넓이 :");
		System.out.println(4 * PI * r2);
		
		System.out.print("구의 부피 :");
		System.out.println((4/3) * PI * r3);
		
		sc.close();
		

	}

}
