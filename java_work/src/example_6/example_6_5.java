// 배열의 요소 수 5인 int형 배열을 5,4,3,2,1로 순서대로 초기화해서 표시하는 프로그램을 작성하시오.

package example_6;

public class example_6_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] a = {5,4,3,2,1};
		
		for(int i = 0 ; i < a.length ; i++) {
			System.out.println("a["+i+"]= " + a[i]);
		}

	}

}
