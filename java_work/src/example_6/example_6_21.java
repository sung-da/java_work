/* 6-21
 * �н� ��, �� �б��� �л���, �׸��� ��� �л��� ������ �о �հ�� ����� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * �հ�� ����� �б� ������ �������� ������� �ϴ� ���� ���� ���Ͻÿ�.
 * <���>
 * �б� �� : 2
 * 
 * 1���� �л��� : 3
 * 1�� 1���� ���� : 50
 * 1�� 2���� ���� : 63
 * 1�� 3���� ���� : 72
 * 
 * 2���� �л��� : 2
 * 2�� 1���� ���� : 79
 * 2�� 2���� ���� : 43
 * 
 * ��  |  �հ�    ���
 * --------------------
 * 1�� |	 185    61.7
 * 2�� |	 122	61.0
 * --------------------
 * ��  |   307	61.4
 */

package example_6;

import java.util.Scanner;

public class example_6_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
				
		System.out.print("�б޼� : ");
		int classNum = sc.nextInt();
		int[][] score = new int[classNum][];
		
		int totNumber = 0;	// ������ ��
	
		for(int i=0 ; i<score.length ; i++) {	//��(classNum)
			System.out.printf("\n%d���� �л��� : ", i+1);
			int num = sc.nextInt();
			score[i] = new int[num];
			totNumber += num;
			for(int j=0 ; j<score[i].length ; j++) {	//�л���(num)
				System.out.printf("%d�� %d���� ���� : ", i+1, j+1);
				score[i][j] = sc.nextInt();
			}			
		}
		
		System.out.println("��	|	�հ�	  ���");
		System.out.println("----------------------------");
		int total = 0;	// ������ ����
		for(int i=0 ; i<score.length ; i++) {
			int sum = 0;	// ������
			for(int j=0 ; j<score[i].length ; j++) {
				sum += score[i][j];
			}
			total += sum;
			System.out.printf("%d��     | %7d%7.1f\n", i+1, sum ,(double)sum/score[i].length);
		}
		System.out.println("-----------------------------");
		System.out.printf("��	| %7d%7.1f", total, (double)total/totNumber);
	}

}
