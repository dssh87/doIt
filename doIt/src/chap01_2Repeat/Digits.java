package chap01_2Repeat;

import java.util.Scanner;
/*
 * 구조적 프로그래밍
 * - 하나의 입구와 하나의 출구를 가진 구성 요소만을 계층적으로 배치하여 프로그램을 구성하는 방법
 * - 순차, 선택, 반복이라는 3종류의 흐름을 사용
 */
public class Digits {

	public static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ex1C_2();
	}
	
	public static void Ex1C_2() {
		int no;
		System.out.println("Please enter a two digit Integer.");
		
		do {
			System.out.print("enter : ");
			no = scan.nextInt();
		}while(10 > no || no > 99); 
		// 입력 받은 값이 10보다 작거나 99보다 크면 반복
		// 왜 && 조건이 아니라 || 조건일까
		// && 조건일 경우 오히려 사잇값이 나올때 종료됨
		
		System.out.println("The variable no has a value of : "+ no);	
	}
}
