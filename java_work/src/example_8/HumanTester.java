/* 8-1
 * 이름, 신장, 체중 등을 멤버로 가지는 '사람 클래스'를 작성하시오.
 * 
 * <실행 예>
 * 이름 : 길동
 * 신장 : 170cm
 * 체중 : 60 kg
 * 
 * 이름 : 철수
 * 신장 : 166 cm
 * 체중 : 72 kg
 */

/* 8-2
 * 이름, 신장, 체중 등을 멤버로 가지는 '사람 클래스'를 작성하시오.
 * 1. 생성자를 사용해서 작성하시오.
 * 2. 필드는 외부에서 직접 수정이 불가능하도록 작성
 * 3. 외부에서 필드를 확인(가져올 수) 있는 메서드를 작성하시오.
 * 4. 체중이 증가, 감소를 메서드로 작성하시오.(매개변수 : 변화 체중)
 *     길동 60 -> 63 / 철수 72 -> 67
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
	
	//필드값
	private String name;
	private int height;
	private int weight;
	
	Human(String name, int height, int weight) {
		//구분이 되는 경우 this안써도 됨 name = n
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
		gildong.humanInfo("길동", 170, 60);
		
		Human chulsu = new Human();
		chulsu.humanInfo("철수", 166, 72);
		
		
		System.out.println("이름 : " + gildong.name());
		System.out.println("신장 : " + gildong.height() +"cm");
		System.out.println("체중 : " + gildong.weight() +"kg");
		System.out.println();
		
		System.out.println("이름 : " + chulsu.name());
		System.out.println("신장 : " + chulsu.height() +"cm");
		System.out.println("체중 : " + chulsu.weight() +"kg");
		*/
		
		Human gildong = new Human("길동", 170, 60);
		
		Human chulsu = new Human("철수", 166, 72);
		
		gildong.gainWeight(3);
		chulsu.reduceWeight(5);
		
		
		System.out.println("이름 : " + gildong.getName());
		System.out.println("신장 : " + gildong.getHeight() +"cm");
		System.out.println("체중 : " + gildong.getWeight() +"kg");
		System.out.println();
		
		System.out.println("이름 : " + chulsu.getName());
		System.out.println("신장 : " + chulsu.getHeight() +"cm");
		System.out.println("체중 : " + chulsu.getWeight() +"kg");
	}

}
