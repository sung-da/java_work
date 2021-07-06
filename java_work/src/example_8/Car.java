/* 8-3
 * 자동차 클래스 Car를 작성하시오.
 * 이름, 번호(String)/ 폭, 높이, 길이(ing)/ 현재 위치 X 좌표, 탱크 용량, 남은 연료, 연비(double)를
 * 필드로 가집니다. 
 * 현재위치 X,Y 좌표를 불러오기, 남은 연료 불러오기, 사양 표시하기, 
 * 지시한 X,Y 방향만큼 자동차 이동하기, 급유하기 의 메서드를 가집니다.
 * 생성자도 작성합니다(생성 시, X,Y 좌표는 모두 0, 연료는 탱크 용량을 초과할 수 없음.)
 */

/* 8-4
 * 자동차 클래스 Car를 이용하는 프로그램을 작성하시오.
 * 1. 사양표시
 * 2. 
 */

package example_8;

public class Car {
	private String name;
	private String number;
	private int width;
	private int height;
	private int length;
	private double x;
	private double y;
	private double tankage;
	private double fuel;
	private double sfc;
	
	Car(String name, String number, int width, int height, int length,
			double tankage, double fuel, double sfc){
		this.name = name;
		this.number = number;
		this.width = width;
		this.height = height;
		this.length = length;
		this.tankage = tankage;
		this.fuel = (fuel <= tankage)? fuel : tankage;
		this.sfc = sfc;
		x = 0.0;
		y = 0.0;
	}
	
	public double getX() {
		return  x;
	}
	
	public double getY() {
		return y;
	}
	
	public double getFuel() {
		return fuel;
	}
	
	public void displaySpec() {
		System.out.println("이름 : " + name);
		System.out.println("번호 : " + number);
		System.out.println("전폭 : " + width + "mm");
		System.out.println("전고 : " + height+ "mm");
		System.out.println("전장 : " + length+ "mm");
		System.out.println("탱크 : " + tankage+ "L");
		System.out.println("연비 : " + sfc+ "km/L");
	}
	
	// X방향으로 dx 이동, Y 방향으로 dy 이동
	double move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy); 	// 이동거리
		double requiredFuel = dist / sfc;			// 이동에 필요한 연료
		
		if(requiredFuel > fuel) {
			return 0;
		} else {
			fuel -= requiredFuel;
			x += dx;
			y += dy;
			return requiredFuel;
		}
	}
	
	void refuel(double supplyFuel) {
		if(supplyFuel > 0) {
			fuel += supplyFuel;
			if (fuel > tankage)
				fuel = tankage;
		}
	}

	
}




