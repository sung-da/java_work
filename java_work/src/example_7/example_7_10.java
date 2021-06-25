/* 다음 4개의 계산 문제 중 하나를 무작위로 줄제하는 암산 훈련 프로그램을 작성하시오.
 * 이때 x,y,z에 3자리의 정수값을 난수로 생성할 것.
 * x + y + z
 * x + y - z
 * x - y + z
 * x - y - z
 * <결과>
 * 암산 훈련!
 * 341 + 616 -742 = 215
 * 틀렸습니다.
 * 341 + 616 -742 = 216
 * 정답입니다.
 * 다시한번?<yes:1, no:0>
 */

package example_7;

import java.util.Random;
import java.util.Scanner;

public class example_7_10 {
	
	static boolean confirmRetry() {
		
		Scanner sc = new Scanner(System.in);
		int retry = 0;
		do {
			System.out.print("다시 한 번? (1:yes, 0:no)");
			retry = sc.nextInt();
		} while (retry!=0 && retry!=1);
		
		return retry == 1;	// 참인 경우 true 리턴
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("암산 훈련!");
		
		do {
			int x = rand.nextInt(900) + 100;	 // 100 ~ 999
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			int pattern = rand.nextInt(4);  // 0~4
	
			int answer;
			switch(pattern) {
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z; break;
			case 2 : answer = x - y + z; break;
			default : answer = x - y - z; break;
			}
			
			while(true) {
				// 식?a:b => 삼항연산자
				System.out.print(
						x + ((pattern<2)?" + ":" - ") + 
						y + ((pattern%2==0)?" + ":" - ") + 
					    z + " = "
				);
				
				int input = sc.nextInt();
				
				if(answer == input) {
					System.out.println("정답입니다.");
					break;
				}
				else
					System.out.println("오답입니다.");
			}
			
		} while (confirmRetry());
		
		
		
		/*
		int sum;
		int answer;
		int retry=0;
		
		System.out.println("암산 훈련!");
		
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
					
			do {
				System.out.printf("%d + %d + %d = ", x, y, z);
				answer = sc.nextInt();
				sum = x + y + z;
				if (sum != answer)
					System.out.println("틀렸습니다.");
			} while (sum != answer);
			System.out.println("정답입니다.");
			System.out.println("다시한번?<yes:1, no:0>");
			retry = sc.nextInt();
		} while(retry == 1);
		*/

	}

}
