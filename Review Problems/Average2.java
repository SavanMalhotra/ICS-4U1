public class Average2 {
	public static void main(String[] args) {
		System.out.println("The average is " + avg());
	}
	
	public static int avg() {
		int[] array = new int[20];
		
		for(int i=0; i<20; i++) {
			System.out.println("Enter the " + (i+1) + " value");
			array[i] = In.getInt();
		}
		
		int total = 0; 
		for (int j = 0; j<20; j++) {
			total = total + array[j];
		}
		
		return total/20;
	}
}
