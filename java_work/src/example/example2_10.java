package example;

import java.util.Scanner;

public class example2_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		final double PI = 3.1416;
		
		System.out.print("������ :");
		double r = sc.nextDouble();
		
		double r2 = Math.pow(r, 2);
		double r3 = Math.pow(r, 3);
		
		System.out.print("���� �ѳ��� :");
		System.out.println(4 * PI * r2);
		
		System.out.print("���� ���� :");
		System.out.println((4/3) * PI * r3);
		
		sc.close();
		

	}

}
