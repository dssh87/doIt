package chap01_2Repeat;

import java.util.Scanner;
/*
 * for문 반복
 * 하나의 변수를 사용할때는 while보다는 for문 사용이 효율
 * for(초기화 부분; 제어식; 업데이트 부분) 명령문
 */
public class SunFor {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
			
		sumFor9(1,10);
		
	}
	
	public static int sumFor9(int a, int b){
		int sum = 0;
		if(a<b) {
			for(int i = a; i <= b; i++) {
				sum += i;				
			}
		}else {
			for(int j = b; j <= a; j++) {
				sum += j; 
			}
		}
		System.out.println(sum);
		
		return sum;
	}
	
	public static void sumFor8(){
		System.out.println("n : ");
		int n = scan.nextInt();
		int sum = 0;
		sum = (1+n)*n/2;
		System.out.println(sum);
	}
	
	public static void sumFor7(){
		System.out.println("1부터 n까지의 합을 구합니다.");
		System.out.print("n의 값 : ");
		int n = scan.nextInt();
		
		int sum = 0;		
		
		for(int i = 1; i <= n; i++) {
			sum += i;
			if(i > 1) {
				System.out.print(" + "+i);
			}else {
				System.out.print(i);
			}
		}
		System.out.println(" = "+sum);
		System.out.println("1부터 " + n + "까지의 합은 " + sum + " 입니다. ");
	}
}
