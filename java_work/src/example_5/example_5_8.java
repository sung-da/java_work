// float���� ������ 0.0���� 1.0���� 0.001�� ������Ű�� ǥ���ϰ�,
// �� ���� int�� ������ 0���� 1000���� 1�� ������Ű�� 1000���� ���� ���� ǥ���Ͻÿ�.

package example_5;

public class example_5_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("float            int");
		System.out.println("--------------------");
		
		float x = 0.0F;		
		for(int i=0 ; i<=1000 ; i++) {
			System.out.printf("%9.7f      ",x);
			System.out.printf("%9.7f\n",(float)i/1000);
			x += 0.001F;
		}
		
	}

}