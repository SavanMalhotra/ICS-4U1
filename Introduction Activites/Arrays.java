public class Arrays {

	public static void main(String[] args) {
		int[] array = new int[10];
		
		for(int i = 0; i<array.length; i++) {
			int r  = (int) (Math.random() * 100) + 1;
			array[i] = r;
		}
		
		for(int a = 0; a<array.length; a++) {
			System.out.println("Value at array index " + a + ": " + array[a]);
		}
	}
}
