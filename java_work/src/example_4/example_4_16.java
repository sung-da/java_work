// ���庰 ǥ�� ü�� ����ǥ�� ǥ���ϴ� ���α׷��� �ۼ�����.
// ǥ�� ü�� = (���� - 100) * 0.9
// �̶� ǥ���� ������ ���� (�ּҰ�/�ִ밪/������)�� ���������� �Է¹��� ��

package example_4;

import java.util.Scanner;

public class example_4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ǥ�� ü�� ����ǥ");
		
		System.out.print("�ּҰ� : ");
		int min = sc.nextInt();
		
		System.out.print("�ִ밪 : ");
		int max = sc.nextInt();
		
		System.out.print("������ : ");
		int mount = sc.nextInt();
		
		System.out.println("����| ǥ��ü��");
				
		for (int i = min ; i <= max ; i += mount) {
			System.out.println(i +"|"+ (i - 100) * 0.9);
		}

	}

}
