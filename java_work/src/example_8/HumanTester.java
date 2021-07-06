/* 8-1
 * �̸�, ����, ü�� ���� ����� ������ '��� Ŭ����'�� �ۼ��Ͻÿ�.
 * 
 * <���� ��>
 * �̸� : �浿
 * ���� : 170cm
 * ü�� : 60 kg
 * 
 * �̸� : ö��
 * ���� : 166 cm
 * ü�� : 72 kg
 */

/* 8-2
 * �̸�, ����, ü�� ���� ����� ������ '��� Ŭ����'�� �ۼ��Ͻÿ�.
 * 1. �����ڸ� ����ؼ� �ۼ��Ͻÿ�.
 * 2. �ʵ�� �ܺο��� ���� ������ �Ұ����ϵ��� �ۼ�
 * 3. �ܺο��� �ʵ带 Ȯ��(������ ��) �ִ� �޼��带 �ۼ��Ͻÿ�.
 * 4. ü���� ����, ���Ҹ� �޼���� �ۼ��Ͻÿ�.(�Ű����� : ��ȭ ü��)
 *     �浿 60 -> 63 / ö�� 72 -> 67
 */



package example_8;

class Human {
	/*8-1
	String name;
	int height;
	int weight;
	
	public void humanInfo(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String name() {
		return this.name;
	}
	
	public int height() {
		return this.height;
	}
	
	public int weight() {
		return this.weight;
	}
	*/
	
	//�ʵ尪
	private String name;
	private int height;
	private int weight;
	
	Human(String name, int height, int weight) {
		//������ �Ǵ� ��� this�Ƚᵵ �� name = n
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	
	public int getHeight() {
		return height;
	}
	
	public int getWeight() {
		return weight;
	}
	
	void gainWeight(int weight) {
		this.weight += weight;
	}
	
	void reduceWeight(int weight) {
		this.weight -= weight;
	}
}

public class HumanTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		Human gildong = new Human();
		gildong.humanInfo("�浿", 170, 60);
		
		Human chulsu = new Human();
		chulsu.humanInfo("ö��", 166, 72);
		
		
		System.out.println("�̸� : " + gildong.name());
		System.out.println("���� : " + gildong.height() +"cm");
		System.out.println("ü�� : " + gildong.weight() +"kg");
		System.out.println();
		
		System.out.println("�̸� : " + chulsu.name());
		System.out.println("���� : " + chulsu.height() +"cm");
		System.out.println("ü�� : " + chulsu.weight() +"kg");
		*/
		
		Human gildong = new Human("�浿", 170, 60);
		
		Human chulsu = new Human("ö��", 166, 72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		
		System.out.println("�̸� : " + gildong.getName());
		System.out.println("���� : " + gildong.getHeight() +"cm");
		System.out.println("ü�� : " + gildong.getWeight() +"kg");
		System.out.println();
		
		System.out.println("�̸� : " + chulsu.getName());
		System.out.println("���� : " + chulsu.getHeight() +"cm");
		System.out.println("ü�� : " + chulsu.getWeight() +"kg");
	}

}
