// 달(월)을 정수값으로 입력받아서 해당하는 달의 계절을 표시하는 프로그램을 작성
// 원하는 만큼 입력 및 출력할 수 있게 하고, 1~12 이외의 값이 입력되는 경우, 재입력되도록 할 것
// do-while문 사용

package example_4;

import java.util.Scanner;

public class example_4_20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int ret = 1;
		/*
		do {
			System.out.print("달(월)을 입력 : ");
			int month = sc.nextInt();
			
			if (month > 0 && month <13) {
				if (month == 3 || month == 4 || month == 5)
					System.out.println("봄");
				else if (month == 6 || month == 7 || month == 8)
					System.out.println("여름");
				else if (month == 9 || month == 10 || month == 11)
					System.out.println("가을");
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("겨울");
			} else 
				continue;

			
			System.out.println("다시 하시겠습니까? (yes: 1, no: 0)");
			ret = sc.nextInt();
			
		} while (ret == 1);
		*/
		
		do {
			System.out.print("달(월)을 입력 : ");
			int month = sc.nextInt();
			
			if (month > 0 && month <13) {
				if (month == 3 || month == 4 || month == 5)
					System.out.println("봄");
				else if (month == 6 || month == 7 || month == 8)
					System.out.println("여름");
				else if (month == 9 || month == 10 || month == 11)
					System.out.println("가을");
				else if (month == 12 || month == 1 || month == 2)
					System.out.println("겨울");
			} else 
				continue;

			
			System.out.println("다시 하시겠습니까? (yes: 1, no: 0)");
			ret = sc.nextInt();
			
		} while (ret == 1);

	}

}
