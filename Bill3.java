// Splits a restaurant bill evenly among three diners.
public class Bill3 {
	public static void main(String[] args) {

	    String name1 = args[0];
		String name2 = args[1];
		String name3 = args[2];
		int price = Integer.parseInt(args[3]);
		double priceDouble = price;
		priceDouble = Math.ceil(priceDouble/3);
		System.out.println("Dear "+name3+", "+name2+", and "+name1+": pay "+priceDouble+" Shekels each");
  
	}
}
