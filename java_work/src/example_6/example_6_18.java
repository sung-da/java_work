/* 6-18
 * 4��3���� ��İ� 3��4���� ����� ���ϴ� ���α׷��� �ۼ��غ��ÿ�.
 * �� ����� ���� Ű���带 ���� �Է�
 * ���̵�1.2��2���� ��İ� 2��2���� ����� ���ϴ� ���α׷�
 *  
 * <���>
 * ��� a�� ��Ҹ� �Է�
 * a[0][0] : 1
 * a[0][1] : 2
 * a[0][2] : 3
 * 
 * a[1][0] : 2
 * a[1][1] : 3
 * a[1][2] : 1
 *  
 * a[2][0] :3
 * .
 * .
 * .
 * ��� b�� ��Ҹ� �Է�
 * b[0][0] : 
 * b[0][1] : 
 * b[0][2] : 
 * b[0][3] :
 * 
 * b[1][0] : 
 * b[1][1] : 
 * b[1][2] : 
 * b[1][3] :
 * 
 * b[2][0] :
 * .
 * .
 * . 
 */

package example_6;

import java.util.Scanner;

public class example_6_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		/*
		int a[][] = new int[4][3];
		int b[][] = new int[3][4];
		
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				System.out.print("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.print("b["+i+"]["+j+"] : ");
				b[i][j] = sc.nextInt();
			}
		}
		*/
		/*
		int a[][] = new int[2][2];
		int b[][] = new int[2][2];
		
		System.out.println("��� a�� ��Ҹ� �Է�");
		for (int i=0 ; i<2 ; i++) {
			for (int j=0 ; j<2 ; j++) {
				System.out.print("a["+i+"]["+j+"] : ");
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("��� b�� ��Ҹ� �Է�");
		for (int i=0 ; i<2 ; i++) {
			for (int j=0 ; j<2 ; j++) {
				System.out.print("b["+i+"]["+j+"] : ");
				b[i][j] = sc.nextInt();
			}
		}
		
		int[][] answer = new int[2][2];
		
		answer[0][0] = (a[0][0]*b[0][0])+(a[0][1]*b[1][0]);
		answer[0][1] = (a[0][0]*b[0][1])+(a[0][1]*b[1][1]);
		answer[1][0] = (a[1][0]*b[0][0])+(a[1][1]*b[1][0]);
		answer[1][1] = (a[1][0]*b[0][1])+(a[1][1]*b[1][1]);
		*/
		
		int a[][] = new int[4][3];
		int b[][] = new int[3][4];
		int c[][] = new int[4][4];
		
		System.out.println("��� a�� ��Ҹ� �Է�");
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				System.out.printf("a[%d][%d] = ", i, j);
				a[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("���a");
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<3 ; j++) {
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
		
		
		
		System.out.println("��� b�� ��Ҹ� �Է�");
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("b[%d][%d] = ", i, j);
				b[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("���b");
		for (int i=0 ; i<3 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("%5d",b[i][j]);
			}
			System.out.println();
		}
		
		
		
		
		//c���
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				c[i][j] = 0;
				for (int k=0 ; k<3 ; k++) {
					c[i][j] += a[i][k] * b[k][j];
					/*
					 * c[0][0] = a[0][0]*b[0][0] + a[0][1]*b[1][0] + a[0][2]*b[2][0];
					 * c[0][1] = a[1][0]*b[0][1] + a[1][1]*b[1][1] + a[1][2]*b[2][1];
					 * */
				}
			}
		}
		
		System.out.println("���a*b");
		for (int i=0 ; i<4 ; i++) {
			for (int j=0 ; j<4 ; j++) {
				System.out.printf("%5d",c[i][j]);
				}
			System.out.println();
			}
		}

}
