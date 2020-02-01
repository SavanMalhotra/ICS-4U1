public class InOut {
	public static void main(String[] args) {
		System.out.println("Enter your name.");
		String name = In.getString();
		System.out.println("Enter your age.");
		String age = In.getString();
		System.out.println("Your name is " + name + " and your age is " + age + ".");
	}
}
