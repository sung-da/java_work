// Ű���忡�� �Է��� �������� +5 �Ǵ� -5 ������ ���� �������� �����غ�����

package example;

import java.util.Random;
import java.util.Scanner;

public class example2_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("������ :");
		int num = sc.nextInt();
		
		System.out.println("�� :" + (num -5 + rand.nextInt(11)));
		 

	}

}
