package chap02_array;

// 1000 ������ �Ҽ� ����
public class PrimeNum1 {

	public static void main(String[] args) {
		int count = 0;
		
		for(int i = 2;  i <= 1000; i++) {
			
			int a;
			for(a = 2; a < i; a++) {
				count++;
				if(i % a == 0) {
					break;
				}
			}
			if(i == a) {
				System.out.println(i);
			}
		}
		System.out.println("������ Ƚ�� : "+count);
	}
}
