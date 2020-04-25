package chap02_array;

import java.util.Random;
import java.util.Scanner;

public class MaxOfArrayRand {

	public static void main(String[] args) {
		Random ran = new Random();
		Scanner scan = new Scanner(System.in);
		//int num = scan.nextInt();
		int num = ran.nextInt(10); // ������� ������ �ޱ�
		
		int[] height = new int[num];
		System.out.println(" Ű ���� �Ʒ��� �����ϴ�.");
		
		for(int i = 0; i < num; i++) {
			height[i] = 100 + ran.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		System.out.println("���� ū Ű�� "+ maxOf(height)+ "�Դϴ�.");
	}
	
	static int maxOf(int[]a) {
		int max = a[0];
		for(int i = 1; i < a.length; i++) {
			if(max < a[i]) {
				max = a[i];
			}
		}
		return max;
	}
}
