// 요소 개수가 5인 double형 배열을 만들고 앞에서부터 1.1, 2.2, 3.3, 4.4, 5.5를 대입해서
// 표시하는 프로그램을 작성하시오.

package example_6;

public class example_6_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double[] a = new double[5];
		
		for(int i=0; i<a.length ; i++) {
			a[i] = (i+1)*1.1;
		}
		
		for(int i=0; i<a.length ; i++) {
			System.out.println("a["+i+"]=" + a[i]);
		}

	}

}
