package chap02_array;

import java.util.Arrays;

public class intArray {

	public static void main(String[] args) {
		Ex5();
	}
	public static void Ex5() {
		int[] a = new int[] {10,2,7,2};
		int num = a.length;
		int max = a[0];
		for(int i =1; i < num; i++) {
			if(a[i] > max) {
				max = a[i];
			}
		}
		System.out.println(max);
	}
	public static void Ex4() {
		int[] a = {1, 5, 3};
		int max = a[0];
		if(a[1] > max) {
			max = a[1];
		}
		if(a[2] > max) {
			max = a[2];
		}
		System.out.println(max);
	}
	public static void Ex3() {
		int[] a = new int[]{1,2,3,4,5};
		int[] b = a.clone();
		System.out.println(Arrays.toString(b));
		b[3] = 0;
		System.out.println(Arrays.toString(b));
	}
	public static void Ex2() {
		int[] a= {1,2,3,4,5};
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
	}
	
	public static void Ex1() {
		int[] a = new int[5];
		a[1] = 37;
		a[2] = 51;
		a[4] = a[1]*2;
		
		for(int i = 0; i < a.length; i++) {
			System.out.println("a["+i+"]="+a[i]);
		}
		
		double[] b = new double[5];
	}
}
