package chap03_search;
// 제네릭 클래스

public class GenericClassTester {

	static class GenericClass<T>{
		private T xyz;
		public GenericClass(T t) {
			this.xyz = t;
		}
		T getXyz() {
			return xyz;
		}
	}
	
	public static void main(String[] args) {
		GenericClass<String> s = new GenericClass<String>("ABC");
		GenericClass<Integer> i = new GenericClass<Integer>(100);
		
		System.out.println(s.getXyz());
		System.out.println(i.getXyz());
	}
}
