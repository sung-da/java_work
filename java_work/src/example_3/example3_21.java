// 월을 1 ~ 12의 정수값으로 입력받아서 해당하는 계절을 표시하는 프로그램을 작성하시오.

package example_3;

import java.util.Scanner;

public class example3_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("월을 입력하세요(1 ~ 12) : ");
		int month = scan.nextInt();
		
		switch (month) {
		case 12: case 1: case 2:
			System.out.println("지금 계절은 겨울이네요.");
			break;
		case 3: case 4: case 5:
			System.out.println("지금 계절은 봄이네요.");
			break;
		case 6: case 7: case 8:
			System.out.println("지금 계절은 여름이네요.");
			break;
		case 9: case 10: case 11:
			System.out.println("지금 계절은 가을이네요.");
			break;
		default:
			System.out.println("잘못된 값을 입력하셨습니다");
			break;
				
		}
		scan.close();

	}

}
