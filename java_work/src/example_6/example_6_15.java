/* 
 * 월을 1~12의 숫자로 표시하고 해당 월의 영어 단어를 입력하는 프로그램을 작성하시오.
 * 월은 난수 생성
 * 
 * 난이도0. 배열 작성 출력
 * 난이도1. 1번반복
 * 난이도2. 학습자 원하는 동안 반복해서 문제 출제
 * 난이도3. 동일 월을 연속해서 표시하지 않도록
 * 
 * hint 1-문자열 비교 구문 사용: equal(문자열),
 * 		2-랜덤문제 출제
 * 
 * <결과> - 난이도 2
 * 해당 월의 영어 단어를 입력하시오.
 * 첫글자는 대문자, 나머지는 소문자로 입력하세요
 * 12월 : December 학습자가 입력
 * 정답입니다. 다시 한번?(yes:1, no:0) 1
 * 10월 : June
 * 틀렸습니다.
 * 10월 : October
 * 정답입니다. 다시 한번?(yes:1, no:0) 0
 */


package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("해당 월의 영어 단어를 입력하시오."
				+ "\n첫글자는 대문자, 나머지는 소문자로 입력하세요");
		
		String[] month = {"January", "February", "March", "April",
				"May", "June", "July", "August", "September", 
				"October", "November", "December"};
		int restart = 1;
		int n;
		
		do {
			n = rand.nextInt(12)+1;
			String spell;

			do {
				System.out.print(n + "월 : ");
				spell = sc.next();
				if (!spell.equals(month[n-1]))
					System.out.println("틀렸습니다.");
			} while (!spell.equals(month[n-1]));
			
			System.out.println("정답입니다. 다시 한번?(yes:1, no:0)");
			restart = sc.nextInt();
			
		} while (restart == 1);
		
		sc.close();
		
	}

}
