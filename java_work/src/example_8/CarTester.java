/* 8-4
 * �ڵ��� Ŭ���� Car�� �̿��ϴ� ���α׷��� �ۼ��Ͻÿ�.
 * 1. ���ǥ��
 * 2. ���� ��ġ
 * 3. ���� ���ᷮ
 * 4. x�������� 10.1 km / y�������� 20.2 km
 * 5. ����� ���ᷮ 
 * 6. ���� 30L
 * 7. ���� �� ���ᷮ
 */

package example_8;

public class CarTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car carens = new Car("��ī����", "32��1234", 1820, 1650, 4545, 199.8, 40.0, 8.6);
		Car kona = new Car("�����ڳ�", "23��1234", 1800, 1570, 4180, 159.8, 180, 6.86);
		
		carens.displaySpec();
		System.out.println();
		kona.displaySpec();
		
		System.out.println("������ġ : " + carens.getX() +", "+ carens.getY());
		System.out.println("���ᷮ : " + carens.getFuel());
		
		double usedFuel = carens.move(10.1,20.2);
		System.out.println("���� ���ᷮ : " + usedFuel);
		
		System.out.println("������ġ : " + carens.getX() +", "+ carens.getY());
		System.out.println("���ᷮ : " + carens.getFuel());
		
		carens.refuel(30);
		System.out.println("���ᷮ : " + carens.getFuel());
	}

}
