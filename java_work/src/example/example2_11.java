// ���� ���α׷� �ۼ��ϼ���
// �� �ڸ� ���� ������(1�̻� 9������ ��)�� �������� �����ؼ� ǥ��
// �� �ڸ� ���� ������(-1�̻� -9������ ��)�� �������� �����ؼ� ǥ��
// �� �ڸ� ���� ������(10�̻� 99������ ��)�� �������� �����ؼ� ǥ��

package example;

import java.util.Random;

public class example2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Random rand = new Random();
		
		int n1 = 1 + rand.nextInt(9);
		int n2 = -1 - rand.nextInt(9);
		int n3 = 10 + rand.nextInt(99);
		
		System.out.println("�� �ڸ� ���� ���� :" + n1);
		System.out.println("�� �ڸ� ���� ���� :" + n2);
		System.out.println("�� �ڸ� ���� ���� :" + n3);
		
		System.out.println("-----------------------------");
		
		int i = (int)(Math.random()*8+1);
		int j = (int)(Math.random()*-8-1);
		int k = (int)(Math.random()*89+10);
		
		System.out.println("�� �ڸ� ���� ���� :" + i);
		System.out.println("�� �ڸ� ���� ���� :" + j);
		System.out.println("�� �ڸ� ���� ���� :" + k);

	}

}
