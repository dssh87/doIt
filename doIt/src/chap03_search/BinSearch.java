package chap03_search;

import java.util.Scanner;

//�����˻�
public class BinSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("��Ҽ� : ");
		
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("������������ �Է�");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = scan.nextInt();
				
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("�˻��� �� : ");
		int key = scan.nextInt();
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("�� ���� ��Ұ� ����.");
		}else {
			System.out.println(key+"�� x["+idx+"] �� ����");
		}
	}
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				System.out.println("�˻� ����!");
				return pc;
			}else if(a[pc] < key){
				pl = pc+1; // �˻� ������ ���� �������� ����.
			}else {
				pr = pc -1; // �˻� ������ ���� �������� ����.
			}
			
		}while(pl <= pr);
		
		return -1; // �˻� ����
	}

}
