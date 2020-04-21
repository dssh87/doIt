package Chap01;

/*
 * 최대 값, 최소 값의 핵심
 * - 최대, 최소를 담을 변수를 선언하여 
 *   계속 값을 비교하면서 담는다. 
 *   마지막에는 최대값 또는 최소값만 변수에 남게되고
 *   그 값을 출력하면 최대값, 최소값을 확인할 수 있다.
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
