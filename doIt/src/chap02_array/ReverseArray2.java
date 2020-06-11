package chap02_array;

import java.util.Arrays;

public class ReverseArray2 {
	
	public static void main(String[] args) {
		int[] a = new int[] {5, 10, 73, 2, -5, 42};
		System.out.println(Arrays.toString(a));
		reverse(a);
		System.out.println("���� ������ ���ƽ��ϴ�.");
		System.out.println("------------------");
		Q3(a);
	}
	
	static int Q3(int[] a) {
		int sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("a �迭�� �� : "+ sum);
		return sum;
	}
	
	//swap �Լ� - ���� 3��
	static int[] swap(int[] a, int idx1, int idx2) {
		int temp = a[idx1];
		a[idx1] = a[idx2];
		a[idx2] = temp;
		return a;
	}
	//reverse �Լ�
	static int[] reverse(int[] a) {
		for(int i = 0; i < a.length/2; i++) {
			swap(a, i, a.length-1-i);
			System.out.println("a["+i+"]��"+"a["+(a.length-1-i)+"]�� ��ȯ �մϴ�.");
			System.out.println(Arrays.toString(a).replace("[", "").replace("]", ""));
		}
		return a;
	}
	//����

}
