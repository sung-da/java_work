// 요소의 형이 int형인 배열을 만들어서 모든 요소에 1~10 난수를 대입하시오.
// 요소 수는 키보드로 입력받을 것

package example_6;

import java.util.Random;
import java.util.Scanner;

public class example_6_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		Random rand = new Random();
		
		System.out.print("요수 수 : ");
		int cnt = sc.nextInt();
		int[] a = new int[cnt];
		
		for(int i = 0 ; i<cnt ; i++) {
			a[i] = rand.nextInt(10)+1;
			System.out.println("a["+i+"] = " + a[i]);
		}
		
		sc.close();

	}

}
