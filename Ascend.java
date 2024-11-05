// Generates three integer random numbers in a given range,
// and prints them in increasing order.
public class Ascend {
	public static void main(String[] args) {
		int lim = Integer.parseInt(args[0]);
		int a = (int)(Math.random()*lim);
		int b = (int)(Math.random()*lim);
		int c = (int)(Math.random()*lim);
		System.out.println(a+" "+b+" "+c);
		System.out.println(Math.min(Math.min(a, b), c)+" "+Math.max(Math.min(a,b), Math.min(Math.max(a,b),c))+" "+Math.max(Math.max(a, b), c));


	}
}
