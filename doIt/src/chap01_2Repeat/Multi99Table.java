package chap01_2Repeat;

import java.util.Scanner;

public class Multi99Table {

	public static void main(String[] args) {
		Q14();
	}
	
	public static void Q14() {
		System.out.println("�簢���� ����մϴ�.");
		Scanner scan = new Scanner(System.in);
		System.out.print("�ܼ� : ");
		int num = scan.nextInt();
		
		for(int i = 0; i < num; i++) {
			System.out.print("*");
			for(int j = 1; j < num; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public static void Q13() {
		System.out.print("  |");
		for(int i = 1; i < 10; i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.print("--+---------------------------");
		System.out.println();
		for(int i = 1; i < 10; i++) {
			System.out.print(i+" |");
		
			for(int j = 1; j < 10; j++) {
				System.out.print(i+j+"  ");
			}
			System.out.println();
		
		}
	}
	
	public static void Q12() {
		System.out.print("  |");
		for(int i = 1; i < 10; i++) {
			System.out.print(i+"  ");
		}
		System.out.println();
		System.out.print("--+---------------------------");
		System.out.println();
		for(int i = 1; i < 10; i++) {
			System.out.print(i+" |");
		
			for(int j = 1; j < 10; j++) {
				System.out.print(i*j+"  ");
			}
			System.out.println();
		
		}
	}
	
	public static void Ex() {
	System.out.println("----����ǥ-----");
		
		for(int i = 1; i <= 9; i++) {
			for(int j = 1; j <= 9; j++) {
				//System.out.printf("%3d",i*j);
				//������ ����
				System.out.print(j+"x"+i+"= " + i*j+"\t");
			}
			System.out.println();
		}
	}
}
