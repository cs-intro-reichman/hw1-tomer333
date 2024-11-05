// Represents the hh:mm time format using an AM/PM format. 
public class TimeFormat {
	public static void main(String[] args) {
		int hours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
		int minutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
		String Sminutes;
		if (minutes < 10) {
			Sminutes = "0"+minutes;
		}
		else{
			Sminutes = ""+minutes;
		}
		if (hours == 12) {
			System.out.print(hours+":"+Sminutes+" PM");
		}
		if (hours < 12) {
			System.out.print(hours+":"+Sminutes+" AM");
		}
		if (hours > 12) {
			System.out.print(hours-12+":"+Sminutes+" PM");
		}
	}
}