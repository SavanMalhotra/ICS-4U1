
public class RectangleInfo {
	
	public static void main(String[] args) {
//		OurRectangle one = new OurRectangle(2,0,3,3);
//		OurRectangle two = new OurRectangle(1,1,3,3);
//		
//		System.out.println(intersection(one, two));
		
		OurRectangle r1 = new OurRectangle(1,2,1,1);
	    OurRectangle r2 = new OurRectangle(10,2,1,1);
	    
	    System.out.println(OurRectangle.intersection(r1, r2));
	    System.out.println("");
	    
	    System.out.println("toString Test: " + (r1.toString().equals("base: (1,2) w:8 h:6")? "Passed" : "Failed"));
	    
	    System.out.println("Area Test: " + (r1.area()==48 ? "Passed" : "Failed"));
	    
	    System.out.println("Perimeter Test: " + (r1.perimeter()==28 ? "Passed" : "Failed"));
	    System.out.println(OurRectangle.intersection(r1, r2));
	    System.out.println("Intersection Test: " + (OurRectangle.intersection(r1,r2).toString().equals("base: (6,4) w:3 h:3")?"Passed":"Failed"));
	}

}
