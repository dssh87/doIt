package chap03_search;

import java.util.Arrays;
import java.util.Scanner;
// ���ڹ迭���� Ű���� �˻�

public class StringBinarySearch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		String[] x = {
				"abstract", "assert", "break"
		};
		
		System.out.print("���ϴ� Ű���带 �Է��ϼ��� : ");
		
		String key = scan.next();
		
		int idx = Arrays.binarySearch(x, key);
		
		if(idx < 0) {
			System.out.println("�ش� Ű���尡 �����ϴ�.");
		}else {
			System.out.println("�ش� Ű����� x["+idx+"]�� �ֽ��ϴ�.");
		}
	}
}
