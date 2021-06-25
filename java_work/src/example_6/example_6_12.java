// 서로 다른 요소가 동일한 값을 지니지 않도록 [6-10] 프로그램을 수정하시오
// 중복값 안됨, 배열은 10 이하

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		int cnt;
		do {
			System.out.print("요수 수 : ");
			cnt = sc.nextInt();
		} while (cnt > 10);
		
		int[] a = new int[cnt];
		
		
		for(int i = 0 ; i<cnt ; i++) {
			int j;
			do {
				a[i] = rand.nextInt(10)+1;
				for (j = 0 ; j < cnt ; j++) {
					if (a[i] == a[j])
						break;
				}
			} while (j<i);
		}
		
		for (int i = 0 ; i <cnt ; i++) {
			System.out.println("a["+i+"] = " + a[i]);
		}
		sc.close();

	}

}
