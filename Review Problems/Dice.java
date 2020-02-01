public class Dice {
	public static void main(String[] args) {
		System.out.println("Rolling Dice: " + rollDice());
	}

	public static int rollDice() {
		return (int) (Math.random()*6 + 1);
	}
}
