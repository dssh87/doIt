package Chap01;

import java.util.Scanner;
/*
 * 1. �Է� ���� �������� ������ ���� ����(a, b, c)
 * 2. �ִ밪�� ������ ���� ����(max)
 * 3. ���� ó���� �Է� �޴� ���� a�ϱ�, �ϴ� a�� max�� ����
 * 4. �ι�° �Է� �޴� b�����ʹ� max�� ���Ͽ� ū ���� max�� ����
 * 5. ����° �Է� �޴� c�����ʹ� max�� ���Ͽ� ū ���� max�� ����
 * 6. ���� max�� ���� ����ϸ� �ִ밪 ���
 */
public class Max3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("��  ������ �ִ��� ���մϴ�.");
		System.out.print("a�� �� : ");
		int a = scan.nextInt();
		System.out.print("b�� �� : ");
		int b = scan.nextInt();
		System.out.print("c�� �� : ");
		int c = scan.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("�ִ밪�� "+ max + "�Դϴ�.");
	}

	
}
