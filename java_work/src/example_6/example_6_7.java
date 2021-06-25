// 시험 점수의 합계, 평균, 최고점, 최저점을 구하는 프로그램을 작성하시오.
// 사람수와 점수는 입력받을것

package example_6;

import java.util.Scanner;

public class example_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사람 수 : ");
		int people = sc.nextInt();
		
		int[] score = new int[people];
		
		int sum = 0;
		
		System.out.println("점수를 입력하세요.");
		for(int i=0 ; i < score.length ; i++) {
			System.out.print((i+1)+"번 점수 : ");
			//int n = sc.nextInt();
			score[i] = sc.nextInt();
			sum += score[i];
		}
		
		int max = score[0];
		int min = score[0];
		
		for (int i = 0 ; i <people; i++) {
			if(score[i] > max) max = score[i];
			if(score[i] < min) min = score[i];
		}
		
		
		System.out.println("합계 : " + sum);
		System.out.println("평균 : " + (double)sum/score.length);
		System.out.println("최고점 : " + max);
		System.out.println("최저점 : " + min);

		sc.close();
	}

}
