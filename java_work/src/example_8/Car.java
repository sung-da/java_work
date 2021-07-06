/* 8-3
 * �ڵ��� Ŭ���� Car�� �ۼ��Ͻÿ�.
 * �̸�, ��ȣ(String)/ ��, ����, ����(ing)/ ���� ��ġ X ��ǥ, ��ũ �뷮, ���� ����, ����(double)��
 * �ʵ�� �����ϴ�. 
 * ������ġ X,Y ��ǥ�� �ҷ�����, ���� ���� �ҷ�����, ��� ǥ���ϱ�, 
 * ������ X,Y ���⸸ŭ �ڵ��� �̵��ϱ�, �����ϱ� �� �޼��带 �����ϴ�.
 * �����ڵ� �ۼ��մϴ�(���� ��, X,Y ��ǥ�� ��� 0, ����� ��ũ �뷮�� �ʰ��� �� ����.)
 */

/* 8-4
 * �ڵ��� Ŭ���� Car�� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1. ���ǥ��
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
		System.out.println("�̸� : " + name);
		System.out.println("��ȣ : " + number);
		System.out.println("���� : " + width + "mm");
		System.out.println("���� : " + height+ "mm");
		System.out.println("���� : " + length+ "mm");
		System.out.println("��ũ : " + tankage+ "L");
		System.out.println("���� : " + sfc+ "km/L");
	}
	
	// X�������� dx �̵�, Y �������� dy �̵�
	double move(double dx, double dy) {
		double dist = Math.sqrt(dx*dx + dy*dy); 	// �̵��Ÿ�
		double requiredFuel = dist / sfc;			// �̵��� �ʿ��� ����
		
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




