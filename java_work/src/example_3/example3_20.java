// 0,1,2 중 하나의 난수를 생성해서
// 0이면 "가위", 1이면 "바위", 2면 "보"를 표시하는 프로그램을 작성하세요.

package example_3;

import java.util.Random;

public class example3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		System.out.println(n);
		/*
		if (n == 0)
			System.out.println("가위");
		else if (n == 1)
			System.out.println("바위");
		else 
			System.out.println("보");
		*/
		
		switch(n) {
		case 0:
			System.out.println("가위");
			break;
		case 1:
			System.out.println("바위");
			break;
		case 2:
			System.out.println("보");
			break;
		}

	}

}
