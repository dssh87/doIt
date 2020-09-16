package chap04_;
// intÇü ½ºÅÃ
public class IntStack {

	private int max;
	private int ptr;
	private int[] stk;
	
	public class EmptyIntStackException extends RuntimeException{
		public EmptyIntStackException() {
			
		}
	}
	
	public class OverflowIntStacjException extends RuntimeException{
		public OverflowIntStacjException() {
			
		}
	}
	
	public IntStack(int capacity) {
		ptr = 0;
		max = capacity;
		try {
			stk = new int[max];
		}catch(OutOfMemoryError e) {
			max = 0;
		}
	}
}
