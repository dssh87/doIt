package Chap01;

import java.util.Scanner;

public class JudgeSign {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ �Է��ϼ��� : ");
		int n = scan.nextInt();
		
		if(n == 1) {
			System.out.println("�� ���� 1 �Դϴ�.");
		}else if(n == 2) {
			System.out.println("�� ���� 2 �Դϴ�.");
		}else if(n == 3) {
			System.out.println("�� ���� 3�Դϴ�.");
		}else {
			;
		}
	}


}
