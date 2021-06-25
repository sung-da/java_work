// 신장별 표준 체중 대응표를 표시하는 프로그램을 작성하자.
// 표준 체중 = (신장 - 100) * 0.9
// 이때 표시할 신장의 범위 (최소값/최대값/증가값)은 정수값으로 입력받을 것

package example_4;

import java.util.Scanner;

public class example_4_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("표준 체중 대응표");
		
		System.out.print("최소값 : ");
		int min = sc.nextInt();
		
		System.out.print("최대값 : ");
		int max = sc.nextInt();
		
		System.out.print("증가값 : ");
		int mount = sc.nextInt();
		
		System.out.println("신장| 표준체중");
				
		for (int i = min ; i <= max ; i += mount) {
			System.out.println(i +"|"+ (i - 100) * 0.9);
		}

	}

}
