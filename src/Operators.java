public class Operators {

	public static void main(String[] args) {
		operatorPractice();
	}
	
	public static void operatorPractice() {
		int a = 20;
		int b = 10;
		
		b = a-- - --a;
		int c = a--;
		int d = a >> 2;
		int e = a & b;
		
		display("(b = a-- - --a) = ", b);
		display("(c = a--) = ", c);
		display("(d = a >> 2) = ", d);
		display("(e = a & b) = ", e);
	}

	// A method that prints the integer argument to the screen 
	public static void display(String msg, int x) {
		System.out.println(msg + x);
	}
}
