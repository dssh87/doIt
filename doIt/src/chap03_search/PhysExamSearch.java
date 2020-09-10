package chap03_search;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

// 신체검사 데이터 배열에서 이진 검색

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
		PhyscData[] x = { // ★ 오름차순으로 정렬 되어 있지 않으면 찾지 못한다. ★
				new PhyscData("이나영", 162, 0.3),
				new PhyscData("조승우", 172, 0.1),
				new PhyscData("원빈", 182, 0.4)
		};
		System.out.print("몇 cm인 사람을 찾나요? : ");
		
		int height = scan.nextInt();
		int idx = Arrays.binarySearch(
				x,
				new PhyscData("", height, 0.0),
				PhyscData.HEIGHT_ORDER
				);
		
		if(idx < 0) {
			System.out.println("요소가 없습니다.");
		}else {
			System.out.println("x["+idx+"]에 있습니다.");
			System.out.println("찾은 데이터 : "+x[idx]);
		}
		
	}
}
