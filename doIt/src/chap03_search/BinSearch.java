package chap03_search;

import java.util.Scanner;

//이진검색
public class BinSearch {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소수 : ");
		
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.print("x["+i+"] : ");
				x[i] = scan.nextInt();
				
			}while(x[i] < x[i-1]);
		}
		
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int idx = binSearch(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없음.");
		}else {
			System.out.println(key+"는 x["+idx+"] 에 있음");
		}
	}
	
	static int binSearch(int[] a, int n, int key) {
		int pl = 0;
		int pr = n-1;
		
		do {
			int pc = (pl + pr) / 2;
			if(a[pc] == key) {
				System.out.println("검색 성공!");
				return pc;
			}else if(a[pc] < key){
				pl = pc+1; // 검색 범위를 뒤쪽 절반으로 줄임.
			}else {
				pr = pc -1; // 검색 범위를 앞쪽 절반으로 줄임.
			}
			
		}while(pl <= pr);
		
		return -1; // 검색 실패
	}

}
