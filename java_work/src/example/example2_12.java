// 키보드에서 입력한 정수값을 +5 또는 -5 범위의 랜덤 정수값을 생성해보세요

package example;

import java.util.Random;
import java.util.Scanner;

public class example2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("정수값 :");
		int num = sc.nextInt();
		
		System.out.println("값 :" + (num -5 + rand.nextInt(11)));
		 

	}

}
