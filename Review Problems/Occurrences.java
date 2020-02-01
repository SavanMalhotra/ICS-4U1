public class Occurrences {
	public static void main(String[] args) {
		boolean cancel = false;
		while(!cancel) {
			System.out.println("Enter 1 to continue or 0 to exit");
			int option = In.getInt();
			if(option == 0) {
				cancel = true;
			}
			else {
				play();
			}
		}
	}
	
	public static void play() {
		String[] array = new String[7];
		
		for(int i=0; i<7; i++) {
			int random = (int) (Math.random()*13);
			
			switch(random) {
				case 0 :{
					array[i] = "Ace";
					break;
				}
				case 1 :{
					array[i] = "Two";
					break;
				}
				case 2 :{
					array[i] = "Three";
					break;
				}
				case 3 :{
					array[i] = "Four";
					break;
				}
				case 4 :{
					array[i] = "Five";
					break;
				}
				case 5 :{
					array[i] = "Six";
					break;
				}
				case 6 :{
					array[i] = "Seven";
					break;
				}
				case 7 :{
					array[i] = "Eight";
					break;
				}
				case 8 :{
					array[i] = "Nine";
					break;
				}
				case 9 :{
					array[i] = "Ten";
					break;
				}
				case 10 :{
					array[i] = "Jack";
					break;
				}
				case 11 :{
					array[i] = "Queen";
					break;
				}
				case 12 :{
					array[i] = "King";
					break;
				}
				default :{
					System.out.println("error occured");
				}
			}
		}
		
		System.out.println("Enter a name of a card...");
		String name = In.getString();
		
		int occurances = 0; 
		
		for(int j =0; j<7; j++) {
			if(array[j].contains(name)) {
				occurances++;
			}
		}
		
		System.out.println(name + " was found " + occurances + " time(s)");
	}
}
