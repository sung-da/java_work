/* ���� 4���� ��� ���� �� �ϳ��� �������� �����ϴ� �ϻ� �Ʒ� ���α׷��� �ۼ��Ͻÿ�.
 * �̶� x,y,z�� 3�ڸ��� �������� ������ ������ ��.
 * x + y + z
 * x + y - z
 * x - y + z
 * x - y - z
 * <���>
 * �ϻ� �Ʒ�!
 * 341 + 616 -742 = 215
 * Ʋ�Ƚ��ϴ�.
 * 341 + 616 -742 = 216
 * �����Դϴ�.
 * �ٽ��ѹ�?<yes:1, no:0>
 */

package example_7;

import java.util.Random;
import java.util.Scanner;

public class example_7_10 {
	
	static boolean confirmRetry() {
		
		Scanner sc = new Scanner(System.in);
		int retry = 0;
		do {
			System.out.print("�ٽ� �� ��? (1:yes, 0:no)");
			retry = sc.nextInt();
		} while (retry!=0 && retry!=1);
		
		return retry == 1;	// ���� ��� true ����
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.println("�ϻ� �Ʒ�!");
		
		do {
			int x = rand.nextInt(900) + 100;	 // 100 ~ 999
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
			
			int pattern = rand.nextInt(4);  // 0~4
	
			int answer;
			switch(pattern) {
			case 0 : answer = x + y + z; break;
			case 1 : answer = x + y - z; break;
			case 2 : answer = x - y + z; break;
			default : answer = x - y - z; break;
			}
			
			while(true) {
				// ��?a:b => ���׿�����
				System.out.print(
						x + ((pattern<2)?" + ":" - ") + 
						y + ((pattern%2==0)?" + ":" - ") + 
					    z + " = "
				);
				
				int input = sc.nextInt();
				
				if(answer == input) {
					System.out.println("�����Դϴ�.");
					break;
				}
				else
					System.out.println("�����Դϴ�.");
			}
			
		} while (confirmRetry());
		
		
		
		/*
		int sum;
		int answer;
		int retry=0;
		
		System.out.println("�ϻ� �Ʒ�!");
		
		do {
			int x = rand.nextInt(900) + 100;
			int y = rand.nextInt(900) + 100;
			int z = rand.nextInt(900) + 100;
					
			do {
				System.out.printf("%d + %d + %d = ", x, y, z);
				answer = sc.nextInt();
				sum = x + y + z;
				if (sum != answer)
					System.out.println("Ʋ�Ƚ��ϴ�.");
			} while (sum != answer);
			System.out.println("�����Դϴ�.");
			System.out.println("�ٽ��ѹ�?<yes:1, no:0>");
			retry = sc.nextInt();
		} while(retry == 1);
		*/

	}

}
