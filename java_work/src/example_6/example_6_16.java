/*
 * 요일을 표시하고 해당 요일의 영어 단어를 입력하는 영어 학습 프로그램을 작성하시오.
 * 요일 난수 생성
 * 
 * 난이도1. 1번반복
 * 난이도2. 학습자 원하는 동안 반복해서 문제 출제
 * 난이도3. 동일 요일을 연속해서 표시하지 않도록
 * 
 *   <결과> 
 * 해당 요일의 영어 단어를 입력하시오.
 * 소문자로 입력하세요
 * 일요일 : sunday
 * 정답입니다. 다시 한번?(yes:1, no:0) 1
 * 수요일 : friday
 * 틀렸습니다.
 * 수요일 : wednesday
 * 정답입니다. 다시 한번?(yes:1, no:0) 0
*/

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		/*
		String[] dayString = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String[] day = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
		
		System.out.println("해당 요일의 영어단어를 입력하시오.(소문자입력)");
		
		int retry = 0;
		int randDay;
		int last;
		
		do {
			do {
				randDay = rand.nextInt(day.length);
			} while();
			
			//randDay = rand.nextInt(day.length);
			
			while(true) {
				System.out.print(day[randDay] + " : ");
				String answer = sc.next();
				
				if (answer.equals(dayString[randDay])) {
					break;
				} else {
					System.out.println("틀렸습니다.");
				}
			
			}				
			System.out.println("정답입니다. 다시 한 번 하시겠어요?(yes:1, no:0)");
			retry = sc.nextInt();
						
		} while (retry == 1);
		
		sc.close();
		*/
		
		String[] dayEnglish = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String[] dayKorean = {"월", "화", "수", "목", "금", "토", "일"};
		
		System.out.println("해당 요일의 영어단어를 입력하시오.(소문자입력)");		
		
		int retry = 0;
		int last = -1;
		
		do {
			int day;
			
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
				
			while(true) {
				System.out.print(dayKorean[day] + "요일 : ");
				
				String answer = sc.next();
				
				if ( answer.equals(dayEnglish[day]) ) {
					System.out.println("정답");
					break;
				} else {
					System.out.println("오답");
				}
			}
			System.out.println("다시 한 번 하시겠어요?(yes:1, no:0)");
			retry = sc.nextInt();
		} while(retry ==1);

	}

}
