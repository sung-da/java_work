/* 6-21
 * 학습 수, 각 학급의 학생수, 그리고 모든 학생의 점수를 읽어서 합계와 평균을 구하는 프로그램을 작성하시오.
 * 합계와 평균은 학급 단위와 전교생을 대상으로 하는 것을 각각 구하시오.
 * <결과>
 * 학급 수 : 2
 * 
 * 1반의 학생수 : 3
 * 1반 1번의 점수 : 50
 * 1반 2번의 점수 : 63
 * 1반 3번의 점수 : 72
 * 
 * 2반의 학생수 : 2
 * 2반 1번의 점수 : 79
 * 2반 2번의 점수 : 43
 * 
 * 반  |  합계    평균
 * --------------------
 * 1반 |	 185    61.7
 * 2반 |	 122	61.0
 * --------------------
 * 합  |   307	61.4
 */

package example_6;

import java.util.Scanner;

public class example_6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("학급수 : ");
		int classNum = sc.nextInt();
		int[][] score = new int[classNum][];
		
		int totNumber = 0;	// 전교생 수
	
		for(int i=0 ; i<score.length ; i++) {	//반(classNum)
			System.out.printf("\n%d반의 학생수 : ", i+1);
			int num = sc.nextInt();
			score[i] = new int[num];
			totNumber += num;
			for(int j=0 ; j<score[i].length ; j++) {	//학생수(num)
				System.out.printf("%d반 %d번의 점수 : ", i+1, j+1);
				score[i][j] = sc.nextInt();
			}			
		}
		
		System.out.println("반	|	합계	  평균");
		System.out.println("----------------------------");
		int total = 0;	// 전교생 점수
		for(int i=0 ; i<score.length ; i++) {
			int sum = 0;	// 반총점
			for(int j=0 ; j<score[i].length ; j++) {
				sum += score[i][j];
			}
			total += sum;
			System.out.printf("%d반     | %7d%7.1f\n", i+1, sum ,(double)sum/score[i].length);
		}
		System.out.println("-----------------------------");
		System.out.printf("합	| %7d%7.1f", total, (double)total/totNumber);
	}

}
