// ���� ���߱� ���ӿ��� ������ ������ 0~99������ �����ϰ� �÷��̾ �Է��� �� �ִ� Ƚ���� �����ϵ��� ���α׷� �ۼ��Ͻÿ�.
// ���� Ƚ�� ���� ������ ���� ��쿡�� ������ ǥ���ϰ� ������ �����մϴ�.

package example_4;

import java.util.Scanner;
import java.util.Random;

public class example_4_30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("���� ���߱� ���� ����!");
		System.out.println("0���� 99������ ���ڸ� ���߼���");
		
		int answer = rand.nextInt(100);
		/*
		for(int i = 6; i>0 ; i--) {
			System.out.print("���� Ƚ�� "+i+"ȸ, � �����ϱ��? ");
			int n = sc.nextInt();
			
			if (n == answer) {
				System.out.println(i+"ȸ���� ���߾����ϴ�.");
				break;
			} else {
				if (n < answer)
					System.out.println("�� ū �����Դϴ�.");
				else if(n>answer)
					System.out.println("�� ���� �����Դϴ�.");
			}
			
		}*/
		
		final int MAX_NO = 6;
		
		int leftNo = MAX_NO;
		int x;
				
		do {
			System.out.println("���� Ƚ�� "+(leftNo--));
			System.out.print("���� ���ڸ� �Է� : ");
			x = sc.nextInt();
			if (x > answer)
				System.out.println("�� ���� �����Դϴ�.");
			else if (x < answer)
				System.out.println("�� ū �����Դϴ�.");
		} while(x != answer && leftNo>0);
		
		if (x == answer)
			System.out.println((MAX_NO-leftNo)+"ȸ���� ���߾����ϴ�.");
		else
			System.out.println("�ƽ��׿�. ������ "+ answer);
	}

}
