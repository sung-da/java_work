/* 6-19
 * 6���� �� ����(����, ����)�� �����κ��� ����/�л��� ����� ���Ͻÿ�. 
 * 2���� �迭 ���, ����� �Ҽ��� ù°�ڸ�����
 * 
 * <���>
 * 6���� ����, ���� ������ �Է�
 * 1�� ����: 72
 * 	  ���� : 80
 * 2�� ���� : 35
 * 	  ���� : 58
 * 3�� ���� : 82
 * 	  ���� : 91
 * 4�� ���� : 72
 * 	  ���� : 45
 * 5�� ���� : 56
 * 	  ���� : 35
 * 6�� ���� : 89
 * 	  ���� : 75
 * 
 * No.	����	����	���
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * ���
 */

package example_6;

import java.util.Scanner;

public class example_6_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		int[][] score = new int[6][2];
		
		System.out.println("6���� ����, ���� ������ �Է��ϼ���");

		for(int i=0 ; i<6 ; i++) {
			System.out.printf(i+1 +"�� ���� : ");
			score[i][0] = sc.nextInt();
			System.out.print("   ���� : ");
			score[i][1] = sc.nextInt();
		}
		
		System.out.println("No.   ����     ����	   ���");
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
		System.out.println("���"+ korAvg +"\t"+ mathAvg);
		*/
		
		// ����� Ǯ��
		final int number = 6;
		int[][] score = new int[number][2];
		int[] sumStudent = new int[number];
		int[] sumSubject = new int[2];
		
		for(int i=0; i<6; i++) {
			System.out.printf(i+1 +"�� ���� : ");
			score[i][0] = sc.nextInt();		// ����
			System.out.print("   ���� : ");
			score[i][1] = sc.nextInt();		// ����
			
			sumStudent[i] = score[i][0] + score[i][1];	//�л��� ���� �հ�
			
			sumSubject[0] += score[i][0];		//���������հ�
			sumSubject[1] += score[i][1];		//���������հ�
		}
		
		
		System.out.println("No.   ����   ����    ���");
		for(int i=0 ; i<number ; i++) {
			System.out.printf("%2d%6d%6d%7.1f\n", i+1, score[i][0], score[i][1], (double)sumStudent[i]/2);
		}
		
		System.out.printf("���%7.1f%6.1f", (double)sumSubject[0]/6, (double)sumSubject[1]/6);
	}

}
