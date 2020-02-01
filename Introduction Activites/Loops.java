public class Loops {
	public static void main(String[] args) {
		int r  = (int) (Math.random() * 100) + 1;
		while(r>0) {
			System.out.println(r);
			r--;
		}
		System.out.println("next loop begins");
		for(int i = 0; i<11; i++ ) {
			System.out.println(i);
		}
	}
}
