public class TwoDArray {
	public static void main(String[] args) {
		//declaring 2d array - first array is outer, second is inner
		int[][] array = new int[6][3];
		
		for(int outer = 0; outer<array.length; outer++) {
			for(int inner = 0; inner< array[outer].length; inner++) {
				int random = (int) (Math.random()*9 + 1);
				array[outer][inner] = random;
			}
		}
		
		for(int outer = 0; outer<array.length; outer++) {
			for(int inner = 0; inner< array[outer].length; inner++) {
				System.out.print(array[outer][inner] + " ");
			}
			System.out.println("");
		}
		
		System.out.print("Value at fourth row, third column: " + array[3][2]);
	}
}
