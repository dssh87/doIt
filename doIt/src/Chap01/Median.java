package Chap01;

import java.util.Scanner;

public class Median {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�.");
		System.out.println("a�� �� : ");
		int a = scan.nextInt();
		System.out.println("b�� �� : ");
		int b = scan.nextInt();
		System.out.println("c�� �� : ");
		int c = scan.nextInt();
		
		System.out.println("�߾Ӱ��� " + med3(a, b, c) + "�Դϴ�.");
	}
	
	static int med3(int a, int b, int c) {
		if(a >= b) {
			if(b >= c) {
				return b;
			}else if(a <= c) {
				return a;
			}else {
				return c;
			}			
		}else if(a > c) {
			return a;
		}else if(b > c) {
			return c;
		}else {
			return b;
		}		
	}
}
