package chap03_search;

import java.util.Scanner;
//���� �˻�
public class SeqSearch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��Ҽ� : " );
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] :" );
			x[i] = scan.nextInt();
		}
		
		System.out.println("�˻� �� �� : ");
		int ky = scan.nextInt();
		int idx = seqSearch2(x,  num, ky);
		
		if(idx == -1) {
			System.out.println(" �� ���� ��Ұ� ����.");
		}else {
			System.out.println(ky+"�� x["+idx+"]�� ����.");
		}
		
	}
	
	static int seqSearch2(int[] a, int n, int key) {
				
		for(int i = 0; i < n; i++) {
			if(a[i] == key) {
				return i;		
			}
		}
		return -1;		
	}
}
