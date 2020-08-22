package chap02_array;

//1000 이하의 소수를 열거(버전2)
public class PrimeNum2 {

	public static void main(String[] args) {
		
		int count = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		
		for(int i = 3; i <= 1000; i+=2) {
			int a;
			for(a = 1; a < ptr; a++) {
				count++;
				if(i % prime[a] == 0) {
					break;
				}
			}
			if(ptr == a) {
				prime[ptr++] = i;
			}
		}
		
		for(int i = 0; i < ptr; i++) {
			System.out.println(prime[i]);
		}
		System.out.println("나눗셈을 수행한 횟수 : "+count);
		
	}

}
