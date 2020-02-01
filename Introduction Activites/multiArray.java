public class multiArray {

	public static void main(String[] args) {
		//declaring 2d array - first array is outer, second is inner
		int[][][][] array = new int[4][4][4][4];
		
		for(int one = 0; one<array.length; one++) {
			for(int two = 0; two< array[one].length; two++) {
				for(int three = 0; three< array[two].length; three++) {
					for(int four = 0; four< array[three].length; four++) {
						int random = (int) (Math.random()*9 + 1);
						array[one][two][three][four] = random;
						System.out.print("'" + one + two + three + four + "'");
					}
					System.out.println("");
					System.out.println("");
				}
				System.out.println("");
				System.out.println("");
			}
			System.out.println("");
		}	
	}
}
