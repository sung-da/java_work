// 0,1,2 �� �ϳ��� ������ �����ؼ�
// 0�̸� "����", 1�̸� "����", 2�� "��"�� ǥ���ϴ� ���α׷��� �ۼ��ϼ���.

package example_3;

import java.util.Random;

public class example3_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		int n = rand.nextInt(3);
		System.out.println(n);
		/*
		if (n == 0)
			System.out.println("����");
		else if (n == 1)
			System.out.println("����");
		else 
			System.out.println("��");
		*/
		
		switch(n) {
		case 0:
			System.out.println("����");
			break;
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("��");
			break;
		}

	}

}
