package Chap01;

/*
 * �ִ� ��, �ּ� ���� �ٽ�
 * - �ִ�, �ּҸ� ���� ������ �����Ͽ� 
 *   ��� ���� ���ϸ鼭 ��´�. 
 *   ���������� �ִ밪 �Ǵ� �ּҰ��� ������ ���Եǰ�
 *   �� ���� ����ϸ� �ִ밪, �ּҰ��� Ȯ���� �� �ִ�.
 */
public class ExMax01 {
	public static void main(String[] args) {
		max4(3, 2, 7, 4);
		max4(3, 2, 4, 7);
		max4(7, 2, 4, 1);
		System.out.println("-----------");
		min3(1,2,3);
		min3(4,2,3);
		min3(4,9,3);
		System.out.println("-----------");
		min4(1,2,3,4);
		min4(4,2,3,4);
		min4(4,4,4,5);		
	}
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		if(d > max) {
			max = d;
		}
		System.out.println(max);
		return max;
	}
	
	static int min4(int a, int b, int c, int d) {
		int min = a;
		if(b < min) {
			min = b;
		}
		if(c < min) {
			min = c;
		}
		if(d < min) {
			min = d;
		}
		System.out.println(min);
		return min;
	}
	
	static int min3(int a, int b, int c) {
		
		int min = a;
		if(b < min) {
			min = b;
		}
		
		if(c < min) {
			min = c;
		}
		System.out.println(min);
		return min;
	}

}
