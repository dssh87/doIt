package chap02_array;
// 100 ÀÌÇÏÀÇ ¼Ò¼ö ¿­°Å(ver.3)
public class PrimeNum3 {

	public static void main(String[] args) {

		int count = 0;
		int ptr = 0;
		int[] prime = new int[500];
		
		prime[ptr++] = 2;
		prime[ptr++] = 3;
		
		for(int i = 5; i <= 1000; i+=2) {
			boolean flag = false;
			for(int a = 1;  prime[a] * prime[a] <= i; a++) {
				count += 2;
				if(i % prime[a] == 0) {
					flag = true;
					break;
				}
			}
			if(!flag) {
				prime[ptr++] = i;
				count++;
			}
		}
		
		for(int i = 0; i<ptr; i++) {
			System.out.println(prime[i]);
		}

		System.out.println("°ö¼À°ú ³ª´°¼ÀÀ» ¼öÇàÇÑ È½¼ö : "+count);
	}

}
