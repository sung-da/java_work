/* 6-19
 * 6명의 두 과목(국어, 수학)의 점수로부터 과목별/학생별 평균을 구하시오. 
 * 2차원 배열 사용, 평균은 소수점 첫째자리까지
 * 
 * <결과>
 * 6명의 국어, 수학 점수를 입력
 * 1번 국어: 72
 * 	  수학 : 80
 * 2번 국어 : 35
 * 	  수학 : 58
 * 3번 국어 : 82
 * 	  수학 : 91
 * 4번 국어 : 72
 * 	  수학 : 45
 * 5번 국어 : 56
 * 	  수학 : 35
 * 6번 국어 : 89
 * 	  수학 : 75
 * 
 * No.	국어	수학	평균
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 평균
 */

package example_6;

import java.util.Scanner;

public class example_6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int[][] score = new int[6][2];
		
		System.out.println("6명의 국어, 수학 점수를 입력하세요");

		for(int i=0 ; i<6 ; i++) {
			System.out.printf(i+1 +"번 국어 : ");
			score[i][0] = sc.nextInt();
			System.out.print("   수학 : ");
			score[i][1] = sc.nextInt();
		}
		
		System.out.println("No.   국어     수학	   평균");
		for (int i=0 ; i<6 ; i++) {
			System.out.print(i+1);
			
			for (int j=0 ; j<2 ; j++) {
				System.out.printf("  %5d",score[i][j]);
			}
			
			double avg;
			avg = (double)(score[i][0] + score[i][1])/2;
			System.out.println("\t\t"+avg);
		}
		
		int koreanSum=0;
		int mathSum=0;
		for(int i=0 ; i<6 ; i++) {
			koreanSum += score[i][0];
			mathSum += score[i][1];
		}
		
		double korAvg = koreanSum /6;
		double mathAvg = mathSum/6;
		System.out.println("평균"+ korAvg +"\t"+ mathAvg);
		*/
		
		// 강사님 풀이
		final int number = 6;
		int[][] score = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		for(int i=0; i<6; i++) {
			System.out.printf(i+1 +"번 국어 : ");
			score[i][0] = sc.nextInt();		// 국어
			System.out.print("   수학 : ");
			score[i][1] = sc.nextInt();		// 수학
			
			sumStudent[i] = score[i][0] + score[i][1];	//학생별 점수 합계
			
			sumSubject[0] += score[i][0];		//국어점수합계
			sumSubject[1] += score[i][1];		//수학점수합계
		}
		
		
		System.out.println("No.   국어   수학    평균");
		for(int i=0 ; i<number ; i++) {
			System.out.printf("%2d%6d%6d%7.1f\n", i+1, score[i][0], score[i][1], (double)sumStudent[i]/2);
		}
		
		System.out.printf("평균%7.1f%6.1f", (double)sumSubject[0]/6, (double)sumSubject[1]/6);
	}

}
