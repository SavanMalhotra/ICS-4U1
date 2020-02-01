public class StrUsage {
	public static void main(String[] args) {
		System.out.println("Please enter a string.");
		String s = In.getString();
		
		char[] array = new char[s.length()];
		
		for(int i = 0; i<s.length(); i++) {
			array[i] = s.charAt(i);
		}
		
		for(int x = 0; x<array.length; x++) {
			System.out.println(array[x]);
		}
	}
}
