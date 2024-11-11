// Computes the future value of a saving investment.
public class FVCalc {
	public static void main(String[] args){
		int currentValue = Integer.parseInt(args[0]);
		double rate = Double.parseDouble(args[1]);
		int numYears = Integer.parseInt(args[2]);
		double futureValue = currentValue * Math.pow(1+(rate/100), numYears);
		System.out.println("After "+numYears+" years, a $"+currentValue+" saved at "+rate+"% will yield $"+((int) futureValue));

	}
}