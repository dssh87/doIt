package chap02_array;
import java.util.Scanner;

//기수변환 수행
public class CardConvRev {
	
	public static void main(String[] args) {
		char[] temp = new char[32];
		cardCoinvR(59, 16, temp);
	}
	static int cardCoinvR(int x, int r, char[] d) {
		int digits = 0;
		String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		do {
			d[digits++] = dchar.charAt(x % r);
			System.out.println(x % r);
			System.out.println(d);
			x /= r;
		}while(x != 0);
		System.out.println("digits : "+digits);
		
		return digits;
	}

}
