public class Methods {
	public static void main(String[] args) {
		String str;
		str = "Pickering High School";
		
		System.out.println("Original: " + str);
		System.out.println("Reversed: " + reverse(str));

	}

	public static String reverse(String original) {
		String modified = "";
		
		for(int i = original.length() - 1; i>=0; i--) {
			modified = modified + original.charAt(i);
		}
		
		return modified;
	}
}
