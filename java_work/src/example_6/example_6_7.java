// ���� ������ �հ�, ���, �ְ���, �������� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
// ������� ������ �Է¹�����

package example_6;

import java.util.Scanner;

public class example_6_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��� �� : ");
		int people = sc.nextInt();
		
		int[] score = new int[people];
		
		int sum = 0;
		
		System.out.println("������ �Է��ϼ���.");
		for(int i=0 ; i < score.length ; i++) {
			System.out.print((i+1)+"�� ���� : ");
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
		
		
		System.out.println("�հ� : " + sum);
		System.out.println("��� : " + (double)sum/score.length);
		System.out.println("�ְ��� : " + max);
		System.out.println("������ : " + min);

		sc.close();
	}

}
