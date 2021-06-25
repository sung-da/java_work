// 삼각형의 밑변과 높이를 입력받아 삼각형의 넓이를 구하는 프로그램을 작성하세요
// (실수계산)밑변 * 높이 / 2

package example;

import java.util.Scanner;

public class example2_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("밑변 :");
		double a = sc.nextDouble();
		
		System.out.print("높이 :");
		double b = sc.nextDouble();
		
		System.out.print("삼각형의 넓이 :");
		System.out.println((a * b) / 2);
		
		sc.close();
		 

	}

}
