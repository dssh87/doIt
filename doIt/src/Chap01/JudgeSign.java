package Chap01;

import java.util.Scanner;

public class JudgeSign {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		int n = scan.nextInt();
		
		if(n == 1) {
			System.out.println("이 수는 1 입니다.");
		}else if(n == 2) {
			System.out.println("이 수는 2 입니다.");
		}else if(n == 3) {
			System.out.println("이 수는 3입니다.");
		}else {
			;
		}
	}


}
