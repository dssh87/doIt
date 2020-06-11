package chap02_array;

import java.util.Arrays;

public class ReverseArray2 {
	
	public static void main(String[] args) {
		int[] a = new int[] {5, 10, 73, 2, -5, 42};
		System.out.println(Arrays.toString(a));
		reverse(a);
		System.out.println("역순 정렬을 마쳤습니다.");
		System.out.println("------------------");
		Q3(a);
	}
	
	static int Q3(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("a 배열의 합 : "+ sum);
		return sum;
	}
	
	//swap 함수 - 숫자 3개
	static int[] swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		return a;
	}
	//reverse 함수
	static int[] reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length-1-i);
			System.out.println("a["+i+"]과"+"a["+(a.length-1-i)+"]를 교환 합니다.");
			System.out.println(Arrays.toString(a).replace("[", "").replace("]", ""));
		}
		return a;
	}
	//실행

}
