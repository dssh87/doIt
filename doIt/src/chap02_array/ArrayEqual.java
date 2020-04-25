package chap02_array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("�迭 a�� ��ڼ� : ");
		int na = scan.nextInt();
		
		int[] a = new int[na];
		
		for(int i = 0; i < na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = scan.nextInt();
		}
		
		System.out.print("�迭 b�� ��ڼ� : ");
		int nb = scan.nextInt();
		
		int[] b = new int[nb];
		
		for(int i = 0; i < nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = scan.nextInt();
		}
		
		System.out.println("�迭 a�� b��  "+ (equals(a,b) ? "�����ϴ�." : "�ٸ��ϴ�."));
		Q4(a, b);
		Q5(a, b);
	}
	//�迭 b�� ��� ��Ҹ� �迭 a�� �������� ����
	static void Q5(int[] a, int[] b) {
		System.out.println("a�� ��� : "+ Arrays.toString(a));
		System.out.println("b�� ��� : "+ Arrays.toString(b));
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
		System.out.println("������b�� ������ a�� ��� : "+ Arrays.toString(a));
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
	
	//���� b�� ��� ��Ҹ� �迭 a�� ����
	static void Q4(int[] a, int[] b) {
		System.out.println("a�� ��� : "+ Arrays.toString(a));
		System.out.println("b�� ��� : "+ Arrays.toString(b));
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
		System.out.println("������ a�� ��� : "+ Arrays.toString(a));
		
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
