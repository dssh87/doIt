package chap01_2Repeat;

import java.util.Scanner;
/*
 * while문
 * 사전 판단 반복과 사후 판단 반복의 차이점
 * -> 반드시 먼저 실행 후 반복인지 vs 조건식 확인 후 실행인지
 */

public class SumForPos {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex11();
	}
	
	// 자리수 구하는 문제 - 10으로 반복적으로 나눠서 카운트한다. 
	public static void Ex11() {
		int n = 0; 
		do {
			System.out.println("양의 정수를 입력하세요");
			 n = scan.nextInt();
		}while(n <= 0);
		
		int count = 1;
		while(n > 0) {
			n = n/10;
			System.out.println("n : "+n);
			count++;
		}
		System.out.println("자리수는 "+count+"자리 입니다.");
	}
	
	public static void Ex10() {
		int a = 0;
		int b = 0;
		System.out.print("a :");
		a = scan.nextInt();
		do {			
			System.out.print("b :");
			b = scan.nextInt();
			if(b<=a) {
				System.out.println("a보다 큰값을 입력하세요");
			}
		}while(b <= a);
		
		int sum = b - a;
		System.out.println("b-a : " + sum);		
	}
	
	public static void Ex() {
		int n;
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		do {
			System.out.print("n의 값 : ");
			n = scan.nextInt();
		}while(n <= 0);
		
		int sum = 0;
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("1부터 "+ n + "까지의 합은 "+sum+"입니다.");
		
	}
	
}
