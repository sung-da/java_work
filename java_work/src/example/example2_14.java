// 키보드로 입력한 성과 이름으로 인사하는 프로그램을 작성해보세요

package example;

import java.util.Scanner;

public class example2_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("성을 입력해주세요 :");
		String lastname = scan.next();
		System.out.print("이름을 입력해주세요 :");
		String firstname = scan.next();
		System.out.println("안녕하세요!"+ lastname + firstname +"님!");
		
		scan.close();

	}

}
