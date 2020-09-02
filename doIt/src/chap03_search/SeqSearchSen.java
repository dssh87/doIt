package chap03_search;

import java.util.Scanner;

// ���� �˻�(���ʹ�)
public class SeqSearchSen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("�˻��� �� : ");
		int key = scan.nextInt();
		
		System.out.println("num : "+num);
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� ����.");
		}else {
			System.out.println(key+"�� x["+idx+"]�� ����.");
		}
	}
	
	static int seqSearchSen(int[] a, int n, int key) {
		int i = 0;
		
		a[n] = key;
		System.out.println("i 0 : "+i);
		while(true) {
			
			if(a[i] == key) {
				break;
			}
			i++;
			System.out.println("i : "+i);
		}
		return i == n ? -1 : i;
	}
}
