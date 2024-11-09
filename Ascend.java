// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]); 
		int a = ((int)((Math.random() * lim) + 1));
		int b = ((int)((Math.random() * lim) + 1));
		int c = ((int)((Math.random() * lim) + 1));
		
		int d = Math.min(a , b); 
		int e = Math.min(d , c);
		int f = Math.max(a , b);
		int g = Math.max(c , f);
		int h = (a + b + c - g - e);

		System.out.println( a + " " + b + " " + c );

		System.out.println( e + " " + h + " " + g );
	

	}
}
