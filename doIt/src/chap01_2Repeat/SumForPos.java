package chap01_2Repeat;

import java.util.Scanner;
/*
 * while��
 * ���� �Ǵ� �ݺ��� ���� �Ǵ� �ݺ��� ������
 * -> �ݵ�� ���� ���� �� �ݺ����� vs ���ǽ� Ȯ�� �� ��������
 */

public class SumForPos {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex11();
	}
	
	// �ڸ��� ���ϴ� ���� - 10���� �ݺ������� ������ ī��Ʈ�Ѵ�. 
	public static void Ex11() {
		int n = 0; 
		do {
			System.out.println("���� ������ �Է��ϼ���");
			 n = scan.nextInt();
		}while(n <= 0);
		
		int count = 1;
		while(n > 0) {
			n = n/10;
			System.out.println("n : "+n);
			count++;
		}
		System.out.println("�ڸ����� "+count+"�ڸ� �Դϴ�.");
	}
	
	public static void Ex10() {
		int a = 0;
		int b = 0;
		System.out.print("a :");
		a = scan.nextInt();
		do {			
			System.out.print("b :");
			b = scan.nextInt();
			if(b<=a) {
				System.out.println("a���� ū���� �Է��ϼ���");
			}
		}while(b <= a);
		
		int sum = b - a;
		System.out.println("b-a : " + sum);		
	}
	
	public static void Ex() {
		int n;
		System.out.println("1���� n������ ���� ���մϴ�.");
		
		do {
			System.out.print("n�� �� : ");
			n = scan.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1���� "+ n + "������ ���� "+sum+"�Դϴ�.");
		
	}
	
}
