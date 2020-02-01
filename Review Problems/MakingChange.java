public class MakingChange {

	public static void main(String[] args) {
		boolean exit = false;

		while (!exit) {
			exit = pennies();
		}
		
	}

	public static boolean pennies() {
		//Using the in class to get inputs
		System.out.println("Enter a number between 1 and 1000: ");
		int num = In.getInt();

		if (num == 0) {
			System.out.println("Thanks for coming out!");
			return true;
		} else if (num > 0 && num <= 1000) {

			int quarters = num/25;
			int dimes = (num - (quarters*25))/10;
			int nickels = (num - (quarters*25) - (dimes*10))/5;
			int pennies = num - (quarters*25) - (dimes*10) - (nickels*5);
			
			System.out.println(num + " cents in coins is: ");
			System.out.println(quarters + " quarters");
			System.out.println(dimes + " dimes");
			System.out.println(nickels + " nickels");
			System.out.println(pennies + " pennies");

			return false;
		} else {
			System.out.println("Sorry, that’s not a valid input.");
			return false;
		}
	}
}
