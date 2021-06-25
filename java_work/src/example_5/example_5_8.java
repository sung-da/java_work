// float형의 변수를 0.0부터 1.0까지 0.001씩 증가시키며 표시하고,
// 그 옆에 int형 변수를 0부터 1000까지 1씩 증가시키며 1000으로 나눈 값을 표시하시오.

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