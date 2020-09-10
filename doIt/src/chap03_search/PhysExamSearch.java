package chap03_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// ��ü�˻� ������ �迭���� ���� �˻�

public class PhysExamSearch {

	static class PhyscData{
		private String name;
		private int height;
		private double vision;
		
		public PhyscData(String name, int height, double vision) {
			this.name = name; 
			this.height = height;
			this.vision = vision;
		}
		
		public String toString() {
			return name + " " + height + " "+ vision;
		}
		
		public static final Comparator<PhyscData> HEIGHT_ORDER = new HeightOrderComparator();
		
		private static class HeightOrderComparator implements Comparator<PhyscData>{
			@Override
			public int compare(PhyscData d1, PhyscData d2) {
				System.out.println("d1.height : "+d1.height);
				System.out.println("d2.height : "+d2.height);
				return (d1.height > d2.height) ? 1 :
					   (d1.height < d2.height) ? -1 : 0;
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		PhyscData[] x = { // �� ������������ ���� �Ǿ� ���� ������ ã�� ���Ѵ�. ��
				new PhyscData("�̳���", 162, 0.3),
				new PhyscData("���¿�", 172, 0.1),
				new PhyscData("����", 182, 0.4)
		};
		System.out.print("�� cm�� ����� ã����? : ");
		
		int height = scan.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
				);
		
		if(idx < 0) {
			System.out.println("��Ұ� �����ϴ�.");
		}else {
			System.out.println("x["+idx+"]�� �ֽ��ϴ�.");
			System.out.println("ã�� ������ : "+x[idx]);
		}
		
	}
}
