/* 8-4
 * 자동차 클래스 Car를 이용하는 프로그램을 작성하시오.
 * 1. 사양표시
 * 2. 현재 위치
 * 3. 현재 연료량
 * 4. x방향으로 10.1 km / y방향으로 20.2 km
 * 5. 사용한 연료량 
 * 6. 급유 30L
 * 7. 급유 후 연료량
 */

package example_8;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carens = new Car("뉴카렌스", "32더1234", 1820, 1650, 4545, 199.8, 40.0, 8.6);
		Car kona = new Car("더뉴코나", "23나1234", 1800, 1570, 4180, 159.8, 180, 6.86);
		
		carens.displaySpec();
		System.out.println();
		kona.displaySpec();
		
		System.out.println("현재위치 : " + carens.getX() +", "+ carens.getY());
		System.out.println("연료량 : " + carens.getFuel());
		
		double usedFuel = carens.move(10.1,20.2);
		System.out.println("사용된 연료량 : " + usedFuel);
		
		System.out.println("현재위치 : " + carens.getX() +", "+ carens.getY());
		System.out.println("연료량 : " + carens.getFuel());
		
		carens.refuel(30);
		System.out.println("연료량 : " + carens.getFuel());
	}

}
