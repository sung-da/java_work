/* �迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž���ϴ� linearSearch �޼�����
 * linearSearchR �޼��带 �ۼ��Ͻÿ�.
 * ��, Ű�� ���� ���� ������ ��Ұ� �������� ���, linearSearch�� ���� �տ� ��ġ�� ��Ҹ� ã����,
 * linearSearchR�� ���� �ڿ� ��ġ�� ��Ҹ� ã����.
 * 
 * <���� ��>
 * ��� �� : 6
 * x[0] : 5
 * x[1] : 22
 * x[2] : 74
 * x[3] : 32
 * x[4] : 120
 * x[5] : 22
 * ã�� �� : 22
 * �ش� ���� ��Ұ� ������ �����մϴ�.
 * ���� �տ� ��ġ�� ���� x[1]�� �ֽ��ϴ�.
 * ���� �ڿ� ��ġ�� ���� x[5]�� �ֽ��ϴ�. 
 */

package example_7;

import java.util.Scanner;

public class example_7_17 {
	
	static int linearSearch(int key, int[] arr) {
		
		for(int i=0 ; i<arr.length ; i++) {
			if (arr[i] == key) {
				return i;
			}
		}
		return -1;
	}
	
	static int linearSearchR(int key, int[] arr) {
		
		for(int i=arr.length-1 ; i>=0 ; i--) {
			if (arr[i] == key) 
				return i;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�迭 a�κ��� key�� ���� ���� ������ ��Ҹ� Ž��");
		
		System.out.print("��� �� : ");
		int num = sc.nextInt();
		
		int[] x = new int[num];
		
		for(int i=0 ; i<num ;i++) {
			System.out.printf("x" + "[%d] = ", i);
			x[i] = sc.nextInt();
		}
		
		System.out.print("ã�� �� : ");
		int key = sc.nextInt();
		
		int idxTop = linearSearch(key, x);
		int idxBtm = linearSearchR(key, x);
		
		if(idxTop == -1) {
			System.out.println("�ش� ���� ��Ұ� �������� �ʽ��ϴ�.");
		} else if (idxTop == idxBtm) {
			System.out.println("�ش� �� x[" + idxTop +"]�� �ֽ��ϴ�.");
		} else {
			System.out.println("�ش� ���� ��Ұ� ������ �����մϴ�.");
			System.out.println("���� �տ� ��ġ�� ���� :" + idxTop);
			System.out.println("���� �ڿ� ��ġ�� ���� :" + idxBtm);
		}

	}

}
