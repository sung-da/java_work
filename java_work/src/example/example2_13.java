// 다음 프로그램을 작성하세요
// - 0.0 이상 1.0 미만의 실수값을 랜덤으로 생성해서 표시
// - 0.0 이상 10.0 미만의 실수값을 랜덤으로 생성해서 표시
// - -1.0 이상 1.0 미만의 실수값을 랜덤으로 생성해서 표시

package example;

import java.util.Random;

public class example2_13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rand = new Random();
		
		double x1 = rand.nextDouble();
		System.out.println(x1);
		
		double x2 = rand.nextDouble() * 10;
		System.out.println(x2);
		
		double x3 = -1 + 2 * rand.nextDouble();
		System.out.println(x3
				);

	}

}
