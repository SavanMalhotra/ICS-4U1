public class ClassStats {
	public static void main(String[] args) {
		String[] classes = new String[5];
		int[] mark = new int[5];
		
		int indexHigh = 0;
		int indexLow = 0;
		int highest = mark[0];
		int lowest = mark[0];
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter a course");
			classes[i] = In.getString();
			System.out.println("Now enter the grade you got in " + classes[i]);
			mark[i] = In.getInt();
			
		}
	
		for(int i = 0; i<5; i++) {
			if(mark[i] > highest) {
				highest = mark[i];
				indexHigh = i; 
			}
			if(mark[i] < lowest) {
				lowest = mark[i];
				indexLow = i;
			}
		}
		
		System.out.println("Your " + classes[indexHigh] + " class was your highest mark at " + highest);
		System.out.println("Your " + classes[indexLow] + " class was your lowest mark at " + lowest);
	}
}
