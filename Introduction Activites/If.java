public class If {

	public static void main(String[] args) {
		int r  = (int) (Math.random() * 100) + 1;
		if(r>50) {
			System.out.println("random number " + r + " is greater than 50");
		}
		else if(r<50) {
			System.out.println("random number " + r + " is less than 50.");
		}
		else {
			System.out.println("random number " + r + " is 50.");
		}
	}
}
