/* �迭 a�� ��� �߿��� �ּҰ��� ���ϴ� minOf �޼��带 �ۼ��Ͻÿ�.
 * (�谳������ �迭�� ����ؼ� Ǯ��)
 * ���� Ű�� ���� ����� ����� ���� ���� ����� ü���� ���Ͻÿ�.
 * 
 * <���� ��>
 * ��� �� : 4
 * 4���� ����� ü���� �Է�
 * 1�� ���� : 175
 * 1�� ü�� : 72
 * 2�� ���� : 163
 * 2�� ü�� : 82
 * 3�� ���� : 150
 * 3�� ü�� : 49
 * 4�� ���� : 181
 * 4�� ü�� : 76
 * ���� Ű�� ���� ��� ���� : 150
 * ���� ���� ����� ü�� : 49
 */

package example_7;

import java.util.Scanner;

public class example_7_16 {
	
	static int minOf(int[] arr) {
		int min = arr[0];
		for(int i=1 ; i<arr.length ; i++) {
			if (min>arr[i])
				min = arr[i];
		}
		return min;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� Ű�� ���� ����� ����� ���� ���� ����� ü���� ���Ͻÿ�.");
		
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		for(int i=0 ; i<num ; i++) {
			System.out.print((i+1)+"�� ���� : ");
			height[i] = sc.nextInt();
			System.out.print((i+1)+"�� ü�� : ");
			weight[i] = sc.nextInt();
		}
		
		System.out.println("���� Ű�� ���� ��� ���� : " + minOf(height));
		System.out.println("���� ���� ����� ü�� : "+ minOf(weight));

	}

}
