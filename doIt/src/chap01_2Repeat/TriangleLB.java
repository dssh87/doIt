package chap01_2Repeat;

import java.util.Scanner;

public class TriangleLB {

	public static Scanner scan = new Scanner(System.in);
	public static int num = 0;
	
	public static void main(String[] args) {
		Q17(4);
	}
	
	public static void Q17(int num) {
		for(int i = 1; i <= num; i++) {
			int a = (i-1)*2+1;
			int b = (((num-1)*2)/2);
			for(int c = 0; c<=b-i; c++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j<=a; j++) {
				System.out.print(i);
			}
			System.out.println();
		}
	}
	
	public static void Q16(int num) {
		for(int i = 1; i <= num; i++) {
			int a = (i-1)*2+1;
			int b = (((num-1)*2)/2);
			for(int c = 0; c<=b-i; c++ ) {
				System.out.print(" ");
			}
			for(int j = 1; j<=a; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Q15(int num) {
				
		//���� �Ʒ��� ������ �̵ �ﰢ��
		/*for(int i = 1; i<=num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		
		//���� ���� ������ �̵ �ﰢ��
		/*for(int i = 1; i<= num; i++) {
			for(int j = 1; j <= num-i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//������ ���� ������ �̵ �ﰢ��
		/*for(int i = 0; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print(" ");
			}
			for(int a = 1; a <= num-i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}*/
		//������ �Ʒ��� ������ �̵ �ﰢ��
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <=num-i; j++) {
				System.out.print(" ");
			}
			for(int a = 1; a <=i; a++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Ex() {
		System.out.println("���� �Ʒ��� ������ �̵ �ﰢ���� ����մϴ�.");
		
		do {
			System.out.print("�� �� �ﰢ�� �Դϱ�? : ");
			num = scan.nextInt();
			
		}while(num <= 0);
		
		for(int i = 1; i <= num; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
