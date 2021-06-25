/*
 * ������ ǥ���ϰ� �ش� ������ ���� �ܾ �Է��ϴ� ���� �н� ���α׷��� �ۼ��Ͻÿ�.
 * ���� ���� ����
 * 
 * ���̵�1. 1���ݺ�
 * ���̵�2. �н��� ���ϴ� ���� �ݺ��ؼ� ���� ����
 * ���̵�3. ���� ������ �����ؼ� ǥ������ �ʵ���
 * 
 *   <���> 
 * �ش� ������ ���� �ܾ �Է��Ͻÿ�.
 * �ҹ��ڷ� �Է��ϼ���
 * �Ͽ��� : sunday
 * �����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0) 1
 * ������ : friday
 * Ʋ�Ƚ��ϴ�.
 * ������ : wednesday
 * �����Դϴ�. �ٽ� �ѹ�?(yes:1, no:0) 0
*/

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		/*
		String[] dayString = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String[] day = {"������", "ȭ����", "������", "�����", "�ݿ���", "�����", "�Ͽ���"};
		
		System.out.println("�ش� ������ ����ܾ �Է��Ͻÿ�.(�ҹ����Է�)");
		
		int retry = 0;
		int randDay;
		int last;
		
		do {
			do {
				randDay = rand.nextInt(day.length);
			} while();
			
			//randDay = rand.nextInt(day.length);
			
			while(true) {
				System.out.print(day[randDay] + " : ");
				String answer = sc.next();
				
				if (answer.equals(dayString[randDay])) {
					break;
				} else {
					System.out.println("Ʋ�Ƚ��ϴ�.");
				}
			
			}				
			System.out.println("�����Դϴ�. �ٽ� �� �� �Ͻðھ��?(yes:1, no:0)");
			retry = sc.nextInt();
						
		} while (retry == 1);
		
		sc.close();
		*/
		
		String[] dayEnglish = {"monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"};
		String[] dayKorean = {"��", "ȭ", "��", "��", "��", "��", "��"};
		
		System.out.println("�ش� ������ ����ܾ �Է��Ͻÿ�.(�ҹ����Է�)");		
		
		int retry = 0;
		int last = -1;
		
		do {
			int day;
			
			do {
				day = rand.nextInt(7);
			} while (day == last);
			last = day;
				
			while(true) {
				System.out.print(dayKorean[day] + "���� : ");
				
				String answer = sc.next();
				
				if ( answer.equals(dayEnglish[day]) ) {
					System.out.println("����");
					break;
				} else {
					System.out.println("����");
				}
			}
			System.out.println("�ٽ� �� �� �Ͻðھ��?(yes:1, no:0)");
			retry = sc.nextInt();
		} while(retry ==1);

	}

}
