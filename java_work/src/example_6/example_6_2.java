// 요소 개수가 5개인 int형 배열을 순서대로 5,4,3,2,1을 대입하는 프로그램을 작성하시오.

package example_6;

public class example_6_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		int[] a = {5, 4, 3, 2, 1};
		
		System.out.println("a[0] = " + a[0]);
		System.out.println("a[1] = " + a[1]);
		System.out.println("a[2] = " + a[2]);
		System.out.println("a[3] = " + a[3]);
		System.out.println("a[4] = " + a[4]);
		*/
		
		int[] a = new int[5];
		
		for (int i = 0 ; i<a.length ; i++) {
			a[i]= 5-i;
		}
		
		for(int i=0; i<a.length ; i++) {
			System.out.println("a["+i+"]=" + a[i]);
		}
	}

}
