// 0.0���� 1.0���� 0.001 ������ ������Ű�鼭 �ش� ���� ������ ǥ���Ͻÿ�.


package example_5;

public class example_5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("x            x�� ����");
		System.out.println("--------------------");
		
		
		for(int i = 0 ; i<=1000 ; i++) {
			float j = (float)i/1000;
			System.out.printf("%.3f    %9.7f\n", j, j*j);
		}
		
		/*
		for(float x = 0.0F ; x <=1.0F ; x+=0.001F) {
			System.out.printf("%.3f     %9.7f\n", x, x*x);
		}
		*/
	}

}
