package chap03_search;
//Array.binarySearch�� ���� �˻�

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է�.");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i] = scan.nextInt();
				
			}while(x[i] < x[i-1]);
		}
	
		System.out.print("�˻��� �� : ");
		int key = scan.nextInt();
		int idx = Arrays.binarySearch(x, key);
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� ����.");
		}else {
			System.out.println(key+"�� x["+idx+"]�� ����.");
		}
	}	
	
}
