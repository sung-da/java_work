// ����� ���� int���� �迭�� ���� ��� ��ҿ� 1~10 ������ �����Ͻÿ�.
// ��� ���� Ű����� �Է¹��� ��

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("��� �� : ");
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		
		for(int i = 0 ; i<cnt ; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		sc.close();

	}

}
