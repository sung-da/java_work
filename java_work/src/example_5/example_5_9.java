// 0.0부터 1.0까지 0.001 단위로 증가시키면서 해당 값의 제곱을 표시하시오.


package example_5;

public class example_5_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("x            x의 제곱");
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
