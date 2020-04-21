package Chap01;

import java.util.Scanner;
/*
 * 1. 입력 받을 세정수를 저장할 변수 선언(a, b, c)
 * 2. 최대값을 저장할 변수 선언(max)
 * 3. 가장 처음에 입력 받는 값이 a니까, 일단 a를 max에 저장
 * 4. 두번째 입력 받는 b값부터는 max와 비교하여 큰 값을 max에 저장
 * 5. 세번째 입력 받는 c값부터는 max와 비교하여 큰 값을 max에 저장
 * 6. 최종 max의 값을 출력하면 최대값 출력
 */
public class Max3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("세  정수의 최댓값을 구합니다.");
		System.out.print("a의 값 : ");
		int a = scan.nextInt();
		System.out.print("b의 값 : ");
		int b = scan.nextInt();
		System.out.print("c의 값 : ");
		int c = scan.nextInt();
		
		int max = a;
		if(b > max) {
			max = b;
		}
		if(c > max) {
			max = c;
		}
		System.out.println("최대값은 "+ max + "입니다.");
	}

	
}
