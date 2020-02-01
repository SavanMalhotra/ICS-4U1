public class OurRectangleTest
{
  public static void main(String[] args)
  {
    //Testing for the OurRectangle assignment
    
    OurRectangle r1 = new OurRectangle(1,2,8,6);
    OurRectangle r2 = new OurRectangle(6,4,7,3);
    
    double marks = 0;
    double total = 0;
  
    //Constructor:  (2 Marks)
    //1) All parameters are positive
    //2) Height and width are negative -> results should be 0
    
    r1 = new OurRectangle(1,1,-5,-4);
    if (r1.toString().equals("base: (1,1) w:0 h:0"))
      marks++;
      
     
    r1 = new OurRectangle(-1,-1,4,5);
    if (r1.toString().equals("base: (-1,-1) w:4 h:5"))
      marks++;

    System.out.println("Constructor: \t" + marks + " /2");
    total+=marks;
    marks=0;
    
    //toString  (1 mark)
    //1)Simply compare with actual string
   
    r1 = new OurRectangle(1,2,8,6);
    if (r1.toString().equals("base: (1,2) w:8 h:6"))
      marks++;
    System.out.println("toString: \t\t" + marks + " /1");
    total+=marks;
    marks =0;
          
    
    
    //area (2 Marks)
    //1) regular area
    //2) zero area
    
    r1 = new OurRectangle(1,2,4,5);
    if (r1.area()==20)
      marks++;
    
   
    r1 = new OurRectangle(1,2,0,3);
    if (r1.area()==0)
      marks++;
    
    System.out.println("Area: \t\t" + marks + " /2");
    total+=marks;
    marks=0;
    
    
    //perimeter (2 Marks)
    //1) regular perimeter
    //2) line perimeter (horizontal, vertical)
    //3) point perimeter
    
    r1 = new OurRectangle(1,2,4,5);
    if (r1.perimeter()==18)
      marks+=0.5;
    //System.out.println("Regular Perimeter: " + (r1.perimeter()==18 ? "Passed" : "Failed"));
    r1 = new OurRectangle(1,2,0,5);
    if (r1.perimeter()==10)
      marks+=0.5;
    //System.out.println("Vertical Line Perimeter : " + (r1.perimeter()==10 ? "Passed" : "Failed"));
    r1 = new OurRectangle(1,2,5,0);
    if (r1.perimeter()==10)
      marks+=0.5;
    //System.out.println("Horizontal Line Perimeter : " + (r1.perimeter()==10 ? "Passed" : "Failed"));
    r1 = new OurRectangle(1,2,0,0);
    if (r1.perimeter()==0)
      marks+=0.5;
    //System.out.println("Point Perimeter : " + (r1.perimeter()==0 ? "Passed" : "Failed"));
    
    System.out.println("Perimeter: \t" + marks + " /2");
    total+=marks;
    marks=0;



    //Intersection (6 Marks)
    
    
   
    
    //1
    r1 = new OurRectangle(1,2,8,6);
    r2 = new OurRectangle(6,4,7,3);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (6,4) w:3 h:3"))
      marks+=0.5;
          
   
    //2 reverse test...
    
    if (OurRectangle.intersection(r2,r1).toString().equals("base: (6,4) w:3 h:3"))
      marks+=0.5;
          
        
    //3
    r1 = new OurRectangle(1,2,8,4);
    r2 = new OurRectangle(3,-3,4,6);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (3,2) w:4 h:1"))
      marks+=0.5;
   
    
    //4
    r1 = new OurRectangle(1,2,6,5);
    r2 = new OurRectangle(5,5,4,4);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (5,5) w:2 h:2"))
      marks+=0.5;
   
    
    //5
    r1 = new OurRectangle(1,2,9,5);
    r2 = new OurRectangle(4,-1,4,10);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (4,2) w:4 h:5"))
      marks+=0.5;
    
    
    //6
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(7,3,3,2);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (7,3) w:0 h:2"))
      marks+=0.5;
   
    
    //7
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(3,-2,2,4);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (3,2) w:2 h:0"))
      marks+=0.5;
  
    
    //8
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(2,3,1,1);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (2,3) w:1 h:1"))
      marks+=0.5;
   
    
    //9
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(7,-2,2,4);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (7,2) w:0 h:0"))
      marks+=0.5;
   
    
    //10
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(9,2,1,1);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (0,0) w:0 h:0"))
      marks+=0.5;
    
    
    //11
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(1,3,6,2);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (1,3) w:6 h:2"))
      marks+=0.5;
   
    
    //12
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(3,0,0,4);
    if (OurRectangle.intersection(r1,r2).toString().equals("base: (3,2) w:0 h:2"))
      marks+=0.5;
   
    
    System.out.println("Intersection: \t" + marks + " /6");
    total+=marks;
    marks=0;
                       
                       
                       
    //totalPerimeter (3 marks)
    
    //1) regular intersection (1 mark)
    r1 = new OurRectangle(1,2,6,5);
    r2 = new OurRectangle(5,5,4,4);
    if (OurRectangle.totalPerimeter(r1,r2)==30)
      marks++;
    
    
    //2) shares one side (1 mark)
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(7,3,3,2);
    if (OurRectangle.totalPerimeter(r1,r2)==26)
      marks++;
   
    
    //3) contains  0.5 marks)
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(2,3,1,1);
    if (OurRectangle.totalPerimeter(r1,r2)==20)
      marks+=0.5;
   
    
    //4) no intersection   0.5 marks
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(9,2,1,1);
    if (OurRectangle.totalPerimeter(r1,r2)==24)
      marks+=0.5;
    
    System.out.println("totalPerimeter: \t" + marks + " /3");
    total+=marks;
    marks=0;
    
    //contains (2 marks)
   
      
    //1)contains all of the rectangle (0.5 each)
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(2,3,1,1);
    if (r1.contains(r2))
      marks+=0.5;
    if (!r2.contains(r1))
      marks+=0.5;
  
    //2)shares all sides (0.25 each)
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(1,2,6,4);
    if (r1.contains(r2))
      marks+=0.25;
    if (r2.contains(r1))
      marks+=0.25;
   
    //3)seperate rectangles (0.25 each)
    r1 = new OurRectangle(1,2,6,4);
    r2 = new OurRectangle(9,2,1,1);
    if (!r1.contains(r2))
      marks+=0.25;
    if (!r2.contains(r1))
      marks+=0.25;

    
    System.out.println("Contains: \t\t" + marks + " /2");
    total+=marks;
    marks = 0;
    
    System.out.println("\nTotal: \t\t" + total + " /18");
    
  }
}