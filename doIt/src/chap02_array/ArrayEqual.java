package chap02_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("배열 a의 요솟수 : ");
		int na = scan.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("배열 b의 요솟수 : ");
		int nb = scan.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("배열 a와 b는  "+ (equals(a,b) ? "같습니다." : "다릅니다."));
		Q4(a, b);
		Q5(a, b);
	}
	//배열 b의 모든 요소를 배열 a에 역순으로 복사
	static void Q5(int[] a, int[] b) {
		System.out.println("a의 요소 : "+ Arrays.toString(a));
		System.out.println("b의 요소 : "+ Arrays.toString(b));
		reverse(b);
		if(a.length == b.length) {
			for(int i = 0; i < b.length; i++) {
				a[i] = b[i];
			}			
		}else if(a.length > b.length){
			for(int i = 0; i < b.length; i++) {
				a[i] = b[i];
			}			
		}else {
			for(int i = 0; i < a.length; i++) {
				a[i] = b[i];
			}			
		}
		System.out.println("역정렬b가 복제된 a의 요소 : "+ Arrays.toString(a));
	}
	static void reverse(int[] b) {
		for(int i = 0; i < b.length/2; i++) {
			swap(b, i, b.length-1-i);
		}
	}
	
	static void swap(int[] b, int idx1, int idx2) {
		int temp = b[idx1];
		b[idx1] = b[idx2];
		b[idx2] = temp;
	}
	
	//베열 b의 모든 요소를 배열 a에 복사
	static void Q4(int[] a, int[] b) {
		System.out.println("a의 요소 : "+ Arrays.toString(a));
		System.out.println("b의 요소 : "+ Arrays.toString(b));
		if(a.length == b.length) {
			for(int i = 0; i < b.length; i++) {
				a[i] = b[i];
			}			
		}else if(a.length > b.length){
			for(int i = 0; i < b.length; i++) {
				a[i] = b[i];
			}			
		}else {
			for(int i = 0; i < a.length; i++) {
				a[i] = b[i];
			}			
		}
		System.out.println("복제된 a의 요소 : "+ Arrays.toString(a));
		
	}
	
	static boolean equals(int[] a, int[] b) {
		if(a.length != b.length) {
			return false;
		}
		for(int i = 0; i < a.length; i++) {
			if(a[i] != b[i]) {
				return false;
			}
		}		
		return true;
	}
	
	
}
