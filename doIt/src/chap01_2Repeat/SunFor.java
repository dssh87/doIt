package chap01_2Repeat;

import java.util.Scanner;
/*
 * for�� �ݺ�
 * �ϳ��� ������ ����Ҷ��� while���ٴ� for�� ����� ȿ��
 * for(�ʱ�ȭ �κ�; �����; ������Ʈ �κ�) ��ɹ�
 */
public class SunFor {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		sumFor9(1,10);
		
	}
	
	public static int sumFor9(int a, int b){
		int sum = 0;
		if(a<b) {
			for(int i = a; i <= b; i++) {
				sum += i;				
			}
		}else {
			for(int j = b; j <= a; j++) {
				sum += j; 
			}
		}
		System.out.println(sum);
		
		return sum;
	}
	
	public static void sumFor8(){
		System.out.println("n : ");
		int n = scan.nextInt();
		int sum = 0;
		sum = (1+n)*n/2;
		System.out.println(sum);
	}
	
	public static void sumFor7(){
		System.out.println("1���� n������ ���� ���մϴ�.");
		System.out.print("n�� �� : ");
		int n = scan.nextInt();
		
		int sum = 0;		
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i > 1) {
				System.out.print(" + "+i);
			}else {
				System.out.print(i);
			}
		}
		System.out.println(" = "+sum);
		System.out.println("1���� " + n + "������ ���� " + sum + " �Դϴ�. ");
	}
}
