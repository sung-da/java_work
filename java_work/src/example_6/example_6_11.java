// 인접하는 요소가 동일한 값을 가지지 않도록 [6-10] 프로그램을 수정하시오.
// 예를 들어 {1,3,5,5,3,2} 안된

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요수 수 : ");
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		
		a[0] = rand.nextInt(10)+1;
		
		for(int i = 1 ; i<cnt ; i++) {
			do {
				a[i] = rand.nextInt(10)+1;
			} while (a[i] == a[i-1]);
		}
		
		for (int i = 0 ; i <cnt ; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		sc.close();

	}

}
