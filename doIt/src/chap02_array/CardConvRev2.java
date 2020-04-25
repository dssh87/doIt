package chap02_array;

import java.util.Scanner;

//p.70(200421, ȭ)
public class CardConvRev2 {
	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		int no;
		int cd;
		int dno;
		int retry;
		char[] cno = new char[32];
		
		System.out.println("10������ ��� ��ȯ �մϴ�.");
		do {
			do {
				System.out.println("��ȯ�ϴ� ���� �ƴ� ���� : ");
				no = scan.nextInt();
			}while(no < 0);
			
			do {
				System.out.println("� ������ ��ȯ �ұ��? (2~36) : ");
				cd = scan.nextInt();
			}while(cd < 2 || cd > 36);
			
			dno = cardCoinvR2(no, cd ,cno);
			
			System.out.println(cd + "�����δ� ");
			
			for(int i = dno - 1; i >= 0; i--) {
				System.out.print(cno[i]);
			}
			System.out.println("�Դϴ�.");
			
			System.out.print("�� �� �� �ұ��? (1.��/0.�ƴϿ�) : ");
			retry = scan.nextInt();
			
		}while(retry == 1);
		
	}
	
	static int cardCoinvR2(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			System.out.println(x % r);
			System.out.println(d);
			x /= r;
		}while(x != 0);
		System.out.println("digits : "+digits);
		
		return digits;
	}
}
