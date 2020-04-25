package chap01_2Repeat;

import java.util.Scanner;

/*
 * 1부터 n까지의 정수의 합
 * while문 : 실행 전 반복을 계속할지 판단 
 * -> 사전 판단 반복 구조 
 */

public class SumWhile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = 0; //합
		int i = 1;
		
		System.out.println("sum : "+sum +" / "+ "i : "+i); 
		while(i<=n) { // i가 n보다 작거나 같은면 계속 반복(true조건)
			sum += i; // sum에 i를 더함
			System.out.println("sum : "+sum +" / "+ "i : "+i);
			i++;      // i를 1씩 증가 시킴
		}
		System.out.println("sum : "+sum +" / "+ "i : "+i);
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		
	}
	
}
