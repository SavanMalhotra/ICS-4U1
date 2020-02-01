public class hardCodedArrays {
	public static void main(String[] args) {
		//2 5
		int[][] array = {
				{1, 2, 3, 4, 5},
				{1,2, 3, 4, 5}
		};
		
		//prints out array 
		for(int i=0; i<array.length; i++) {
			for(int j = 0; j<array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}
}
