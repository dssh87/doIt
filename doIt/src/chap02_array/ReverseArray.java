package chap02_array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	public static void main(String[] args) {
		//Ex1();
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요솟수 : ");
		int num = scan.nextInt();
		
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++){
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		reverse(x);
		
		System.out.println("요소를 역순으로 정렬했습니다.");
		for(int i = 0; i < num; i++) {
			System.out.println("x["+i+"] = "+x[i]);
		}
	}
	
	static void swap(int[] a, int idx1, int idx2) {
		int t = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = t;
	}
	
	static void reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length - i - 1);
		}
	}
	
	static void Ex1(){
		int[] a = new int[] {1, 5, 10, 6, 9, 2};
		int temp = 0;
		int len = a.length-1;
		System.out.println(len);
		
		for(int i = 0; i < len/2+1; i++) {
			temp = a[i];
			a[i] = a[len-i];
			a[len-i] = temp;
		}
		System.out.println(Arrays.toString(a));
	}
}
