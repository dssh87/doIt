package chap01_2Repeat;

import java.util.Scanner;
/*
 * ������ ���α׷���
 * - �ϳ��� �Ա��� �ϳ��� �ⱸ�� ���� ���� ��Ҹ��� ���������� ��ġ�Ͽ� ���α׷��� �����ϴ� ���
 * - ����, ����, �ݺ��̶�� 3������ �帧�� ���
 */
public class Digits {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex1C_2();
	}
	
	public static void Ex1C_2() {
		int no;
		System.out.println("Please enter a two digit Integer.");
		
		do {
			System.out.print("enter : ");
			no = scan.nextInt();
		}while(10 > no || no > 99); 
		// �Է� ���� ���� 10���� �۰ų� 99���� ũ�� �ݺ�
		// �� && ������ �ƴ϶� || �����ϱ�
		// && ������ ��� ������ ���հ��� ���ö� �����
		
		System.out.println("The variable no has a value of : "+ no);	
	}
}
