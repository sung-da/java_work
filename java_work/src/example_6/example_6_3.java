// ��� ������ 5�� double�� �迭�� ����� �տ������� 1.1, 2.2, 3.3, 4.4, 5.5�� �����ؼ�
// ǥ���ϴ� ���α׷��� �ۼ��Ͻÿ�.

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
