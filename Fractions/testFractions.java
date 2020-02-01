//Test claass to make sure the Fractions class works
public class testFractions {

	public static void main(String[] args) {
		Fractions a = new Fractions(1,2);
	    Fractions b = new Fractions(4,6);
	    Fractions c = new Fractions(5,4);
	    
	    System.out.println(a.toString());
	    
	    System.out.println(b.toString());
	    b.reduce();
	    System.out.println(b.toString());
	    
	    System.out.println(c.toMixed());
	    
	    a.add(b);
	    System.out.println(a.toString());
	    
	    System.out.println("");
	    
	    
	    
	    
	    a = new Fractions(5,6);
	    b = new Fractions(12,12);
	    
	    
	    System.out.println(a.toString());
	    System.out.println(b.toString());
	    
	    System.out.println(a.greaterThan(b));
	    System.out.println(a.lessThan(b));
	    System.out.println(a.equals(b));
	    
	    
	    
	    System.out.println(a.toString());
	    a.reciprocal();
	    System.out.println(a.toString());
	    
	}
}