/* 배열 a의 요소 중에서 최소값을 구하는 minOf 메서드를 작성하시오.
 * (배개변수로 배열을 사용해서 풀이)
 * 가장 키가 작은 사람의 신장과 가장 마른 사람의 체중을 구하시오.
 * 
 * <실행 예>
 * 사람 수 : 4
 * 4명의 신장과 체중을 입력
 * 1번 신장 : 175
 * 1번 체중 : 72
 * 2번 신장 : 163
 * 2번 체중 : 82
 * 3번 신장 : 150
 * 3번 체중 : 49
 * 4번 신장 : 181
 * 4번 체중 : 76
 * 가장 키자 작은 사람 신장 : 150
 * 가장 마른 사람의 체중 : 49
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
		
		System.out.println("가장 키가 작은 사람의 신장과 가장 마른 사람의 체중을 구하시오.");
		
		System.out.print("사람 수 : ");
		int num = sc.nextInt();
		
		int[] height = new int[num];
		int[] weight = new int[num];
		
		for(int i=0 ; i<num ; i++) {
			System.out.print((i+1)+"번 신장 : ");
			height[i] = sc.nextInt();
			System.out.print((i+1)+"번 체중 : ");
			weight[i] = sc.nextInt();
		}
		
		System.out.println("가장 키자 작은 사람 신장 : " + minOf(height));
		System.out.println("가장 마른 사람의 체중 : "+ minOf(weight));

	}

}
