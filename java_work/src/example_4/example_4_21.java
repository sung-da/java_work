// ��ȣ���� '*' �� �����ؼ� n���� ������(���簢��)�� ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.(for)

package example_4;

import java.util.Scanner;

public class example_4_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�� ���� ���簢���� ǥ���ϰڽ��ϱ�? ");
		int num = sc.nextInt();
		/*
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j <= num ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}*/
		for(int i = 1 ; i <= num+2 ; i++) {     //����
			for(int j = 1 ; j <= num ; j++) {   //����
				System.out.print("* ");
			}
			System.out.println();
		}
		sc.close();
	}

}
