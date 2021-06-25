// 인수 m에 지정한 달(월)을 계절을 표시하는 pringSeason 메서드를 작성하시오.
// m값에 따라 봄(3,4,5), 여름(6,7,8), 가을(9,10,11), 겨울(12,1,2) 를 표시하고
// 그 외의 값이 오면 아무것도 표시하지 않도록 작성하시오.

package example_7;

import java.util.Scanner;

public class example_7_6 {
	
	// 메서드 선언
	static void printSeason(int m) {
		if (m == 3 || m==4 || m==5)
			System.out.println("봄");
		else if (m == 6 || m == 7 || m == 8)
			System.out.println("여름");
		else if (m == 9 || m == 10 || m == 11)
			System.out.println("가을");
		else if (m == 12 || m == 1 || m == 2)
			System.out.println("겨울");
		
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner stdIn = new Scanner(System.in);
		
		int month;
		do {
			System.out.print("달(월) : ");
			month = stdIn.nextInt();
		} while (month <1 || month > 12);
		
		printSeason(month);
		
//		System.out.print("달(월) : ");
//		int a = stdIn.nextInt();
//		printSeason(a);
		
		

	}

}
