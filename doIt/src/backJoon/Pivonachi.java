package backJoon;

import java.util.Scanner;

/*�Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
    �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n>=2)�� �ȴ�.
  n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
  0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
  n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.*/

public class Pivonachi {

	public static void main(String[] args) {
		long a=0;
		long b=1;
		long result=0;
		
	    Scanner sc = new Scanner(System.in);
	 	int cnt=sc.nextInt();
	 	if(cnt==1) {
	 		System.out.println(1);
   		}else {
	   		for(int i=1; i<cnt; i++) {
	   			result=a+b;
	   			a=b;
	   			System.out.println("a : "+a);
	   			b=result;
	   			System.out.println("b : "+b);
	   			System.out.println("------ "+i+" -----");
	   		}
	   		System.out.println("result : "+result);
   		}	
	}
}
