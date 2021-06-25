// 다음 프로그램 작성하세요
// 한 자리 양의 정수값(1이상 9이하의 값)을 랜덤으로 생성해서 표시
// 한 자리 음의 정수값(-1이상 -9이하의 값)을 랜덤으로 생성해서 표시
// 한 자리 양의 정수값(10이상 99이하의 값)을 랜덤으로 생성해서 표시

package example;

import java.util.Random;

public class example2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rand = new Random();
		
		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(99);
		
		System.out.println("한 자리 양의 정수 :" + n1);
		System.out.println("한 자리 음의 정수 :" + n2);
		System.out.println("두 자리 양의 정수 :" + n3);
		
		System.out.println("-----------------------------");
		
		int i = (int)(Math.random()*8+1);
		int j = (int)(Math.random()*-8-1);
		int k = (int)(Math.random()*89+10);
		
		System.out.println("한 자리 양의 정수 :" + i);
		System.out.println("한 자리 음의 정수 :" + j);
		System.out.println("두 자리 양의 정수 :" + k);

	}

}
