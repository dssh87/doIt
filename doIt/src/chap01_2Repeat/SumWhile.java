package chap01_2Repeat;

import java.util.Scanner;

/*
 * 1���� n������ ������ ��
 * while�� : ���� �� �ݺ��� ������� �Ǵ� 
 * -> ���� �Ǵ� �ݺ� ���� 
 */

public class SumWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = scan.nextInt();
		
		int sum = 0; //��
		int i = 1;
		
		System.out.println("sum : "+sum +" / "+ "i : "+i); 
		while(i<=n) { // i�� n���� �۰ų� ������ ��� �ݺ�(true����)
			sum += i; // sum�� i�� ����
			System.out.println("sum : "+sum +" / "+ "i : "+i);
			i++;      // i�� 1�� ���� ��Ŵ
		}
		System.out.println("sum : "+sum +" / "+ "i : "+i);
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
		
	}
	
}
