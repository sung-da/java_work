/* 6-20
 * �࿡ ���� ���� ������ �ٸ� 2���� �迭 �����Ͻÿ�.
 * ���, ���� �� ����� ���� Ű����� �Է� ����
 * 
 * <���>
 * �ұ�Ģ�� 2���� �迭�� ����
 * �� �� : 3
 * 0���� ���� : 5
 * 1���� ���� : 3
 * 2���� ���� : 4
 * 
 * �� ����� ���� �Է��մϴ�.
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
 * �迭 c�� �� ��� ���� ���
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
		
		System.out.println("�ұ�Ģ�� 2���� �迭�� ����");
		
		System.out.print("�� �� : ");
		int row = sc.nextInt();
		/*
		int[] column = new int[row];
		
		for(int i=0 ; i<row ; i++) {
			System.out.printf("%d���� ���� : ", i);
			column[i] = sc.nextInt();
		}
		
		int[][] c = new int[row][]; 
		
		c[0] = new int[column[0]];
		c[1] = new int[column[1]];
		c[2] = new int[column[2]];
		
		System.out.println("�� ����� ���� �Է�");
		for(int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column[i] ; j++) {
				System.out.printf("c[%d][%d]: ", i, j);
				c[i][j] = sc.nextInt();
			}
		}
		
		
		System.out.println("�迭 c�� �� ��� ���� ���");
		for(int i=0 ; i<row ; i++) {
			for (int j=0 ; j<column[i] ; j++) {
				System.out.printf("%4d", c[i][j]);
			}
			System.out.println();
		}
		*/
		
		//����� Ǯ��
		
		int[][] c = new int[row][]; 
		
		for(int i=0 ; i<c.length ; i++) {
			System.out.printf("%d���� ���� : ", i);
			int column = sc.nextInt();
			c[i] = new int[column];
		}
		
		System.out.println("�� ����� ���� �Է�");
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
