// 숫자 맞추기 게임에서 숫자의 범위를 0~99까지로 설정하고 플레이어가 입력할 수 있는 횟수를 제한하도록 프로그램 작성하시오.
// 제한 횟수 내에 맞추지 못한 경우에는 정답을 표시하고 게임을 종료합니다.

package example_4;

import java.util.Scanner;
import java.util.Random;

public class example_4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("숫자 맞추기 게임 시작!");
		System.out.println("0부터 99사이의 숫자를 맞추세요");
		
		int answer = rand.nextInt(100);
		/*
		for(int i = 6; i>0 ; i--) {
			System.out.print("남은 횟수 "+i+"회, 어떤 숫자일까요? ");
			int n = sc.nextInt();
			
			if (n == answer) {
				System.out.println(i+"회만에 맞추었습니다.");
				break;
			} else {
				if (n < answer)
					System.out.println("더 큰 숫자입니다.");
				else if(n>answer)
					System.out.println("더 작은 숫자입니다.");
			}
			
		}*/
		
		final int MAX_NO = 6;
		
		int leftNo = MAX_NO;
		int x;
				
		do {
			System.out.println("남은 횟수 "+(leftNo--));
			System.out.print("예상 숫자를 입력 : ");
			x = sc.nextInt();
			if (x > answer)
				System.out.println("더 작은 숫자입니다.");
			else if (x < answer)
				System.out.println("더 큰 숫자입니다.");
		} while(x != answer && leftNo>0);
		
		if (x == answer)
			System.out.println((MAX_NO-leftNo)+"회만에 맞추었습니다.");
		else
			System.out.println("아쉽네요. 정답은 "+ answer);
	}

}
