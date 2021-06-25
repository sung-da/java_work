// 입력한 점수에 따라 수/우/미/양/가 를 판정하는 프로그램을 작성하시오.
// 0 ~ 49 가
// 50 ~ 59 양
// 60 ~ 69 미
// 70 ~ 79 우
// 80 ~ 100 수
// 점수가 범위안에 없는 경우, "잘못된 점수입니다."를 표시하세요.

package example_3;

import java.util.Scanner;

public class example3_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수값 : ");
		int score = scan.nextInt();
		
		if (score >= 0 && score <= 49)
			System.out.println("가");
		else if (score >= 50 && score <= 59)
			System.out.println("양");
		else if (score >= 60 && score <= 69)
			System.out.println("미");
		else if (score >= 70 && score <= 79)
			System.out.println("우");
		else if (score >= 80 && score <= 100)
			System.out.println("수");
		else 
			System.out.println("잘못된 점수");
		
		scan.close();

	}

}
