public class ArrString {

	public static void main(String[] args) {
		String s = " Test String ";
		
		System.out.println("Activity A Output:" + s.replaceAll(" ", ""));
		System.out.println("Activity B Output:" + s.toUpperCase());
		System.out.println("Activity C Output:" + s.toLowerCase());
		System.out.println("Activity D Output:" + s.substring(5, 8));
		System.out.println("Activity E Output:" + s.charAt(3));
		System.out.println("Activity E Output:" + s.indexOf('i'));
	}

}
