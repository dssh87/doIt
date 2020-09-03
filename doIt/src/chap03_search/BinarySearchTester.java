package chap03_search;
//Array.binarySearch로 이진 검색

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchTester {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		System.out.print("요소수 : ");
		int num = scan.nextInt();
		int[] x = new int[num];
		
		System.out.println("오름차순으로 입력.");
		
		System.out.print("x[0] : ");
		x[0] = scan.nextInt();
		
		for(int i = 1; i < num; i++) {
			do {
				System.out.println("x["+i+"] : ");
				x[i] = scan.nextInt();
				
			}while(x[i] < x[i-1]);
		}
	
		System.out.print("검색할 값 : ");
		int key = scan.nextInt();
		int idx = Arrays.binarySearch(x, key);
		if(idx == -1) {
			System.out.println("그 값의 요소가 없음.");
		}else {
			System.out.println(key+"는 x["+idx+"]에 있음.");
		}
	}	
	
}
