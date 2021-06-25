/* 6-20
 * 행에 따라 열의 개수가 다른 2차원 배열 생성하시오.
 * 행수, 열수 각 요소의 값은 키보드로 입력 받음
 * 
 * <결과>
 * 불규칙한 2차원 배열을 생성
 * 행 수 : 3
 * 0행의 열수 : 5
 * 1행의 열수 : 3
 * 2행의 열수 : 4
 * 
 * 각 요소의 값을 입력합니다.
 * c[0][1] : 1
 * c[0][2] : 2
 * c[0][3] : 3
 * c[0][4] : 4
 * c[0][5] : 5
 * 
 * c[1][0] : 6
 * c[1][1] : 7
 * c[1][2] : 8
 * 
 * c[2][0] : 9
 * c[2][1] : 10
 * c[2][2] : 11
 * c[2][3] : 12
 * 
 * 배열 c의 각 요소 값을 출력
 * 1  2  3  4  5
 * 6  7  8 
 * 9  10 11 12
 */

package example_6;

import java.util.Scanner;

public class example_6_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("불규칙한 2차원 배열을 생성");
		
		System.out.print("행 수 : ");
		int row = sc.nextInt();
		/*
		int[] column = new int[row];
		
		for(int i=0 ; i<row ; i++) {
			System.out.printf("%d행의 열수 : ", i);
			column[i] = sc.nextInt();
		}
		
		int[][] c = new int[row][]; 
		
		c[0] = new int[column[0]];
		c[1] = new int[column[1]];
		c[2] = new int[column[2]];
		
		System.out.println("각 요소의 값을 입력");
		for(int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column[i] ; j++) {
				System.out.printf("c[%d][%d]: ", i, j);
				c[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("배열 c의 각 요소 값을 출력");
		for(int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column[i] ; j++) {
				System.out.printf("%4d", c[i][j]);
			}
			System.out.println();
		}
		*/
		
		//강사님 풀이
		
		int[][] c = new int[row][]; 
		
		for(int i=0 ; i<c.length ; i++) {
			System.out.printf("%d행의 열수 : ", i);
			int column = sc.nextInt();
			c[i] = new int[column];
		}
		
		System.out.println("각 요소의 값을 입력");
		for(int i=0 ; i<c.length ; i++) {
			for (int j=0 ; j<c[i].length ; j++) {
				System.out.printf("c[%d][%d]: ", i, j);
				c[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0 ; i<row ; i++) {
			for (int j=0; j<c[i].length ; j++) {
				System.out.printf("%5d", c[i][j]);
			}
			System.out.println();
		}
	}

}
