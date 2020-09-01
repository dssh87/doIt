package chap03_search;

import java.util.Scanner;
//선형 검색
public class SeqSearch2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("요소수 : " );
		int num = scan.nextInt();
		int[] x = new int[num];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] :" );
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색 할 값 : ");
		int ky = scan.nextInt();
		int idx = seqSearch2(x,  num, ky);
		
		if(idx == -1) {
			System.out.println(" 그 값의 요소가 없음.");
		}else {
			System.out.println(ky+"는 x["+idx+"]에 있음.");
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
