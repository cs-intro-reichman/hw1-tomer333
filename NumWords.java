// Prints a given number using a hundreds, tens, and units notation.
public class NumWords {
	public static void main(String args[]) {
		int i = Integer.parseInt(args[0]);
		System.out.println(i/100+" hundreds, "+(i%100)/10+" tens, "+i%10+" ones.");

	}
}
