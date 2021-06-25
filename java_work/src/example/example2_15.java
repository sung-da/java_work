// 입력한 주소를 표시하는 프로그램을 작성하시오.
// 주소 : 수원시 팔달구 중부대로 200

package example;

import java.util.Scanner;

public class example2_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("주소 : ");
		String address = sc.nextLine();
		System.out.println("주소는 "+ address + " 입니다");
		
		sc.close();

	}

}
