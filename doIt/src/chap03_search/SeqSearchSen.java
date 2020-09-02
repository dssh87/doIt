package chap03_search;

import java.util.Scanner;

// 선형 검색(보초법)
public class SeqSearchSen {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("요소수 : ");
		
		int num = scan.nextInt();
		int[] x = new int[num + 1];
		
		for(int i = 0; i < num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = scan.nextInt();
		}
		
		System.out.println("검색할 값 : ");
		int key = scan.nextInt();
		
		System.out.println("num : "+num);
		int idx = seqSearchSen(x, num, key);
		
		if(idx == -1) {
			System.out.println("그 값의 요소가 없음.");
		}else {
			System.out.println(key+"는 x["+idx+"]에 있음.");
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
