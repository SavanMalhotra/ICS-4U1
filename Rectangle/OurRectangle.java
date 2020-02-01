//Savan Malhotra
//September 30, 2019
//Baf
//ICS 4U1
//Assignment 2 - Our Rectangle
public class OurRectangle {

	public int x;
	public int y;
	public int width;
	public int height;
	
	public OurRectangle(int x, int y, int w, int h) {
		//sets all private variable to inputed values.
		this.x = x;
		this.y = y;
		this.width = w;
		this.height = h;
		
		//checks if the values are below zero, if they are, they set them to simply zero.
		
		if(w<0) {
			this.width = 0;
		}	
		
		if(h<0) {
			this.height = 0;
		}
	}
	
	//returns a string value of the given rectangle
	public String toString() {
		return ("base: (" + this.x + "," + this.y + ") w:" + this.width + " h:" + this.height );
	}
	
	//returns the area of the rectangle
	public int area() {
		return this.height * this.width;
	}
	
	//returns the perimeter of the rectangle
	public int perimeter() {
		return this.height*2 + this.width*2;
	}
	
	//checks to see if the rectangles intersect or not
	public static OurRectangle intersection(OurRectangle one, OurRectangle two) {
		
		//finds the minimum and maximum variables
		int ymin = Math.min(one.y, two.y);
		int ymax;
		int xmin = Math.min(one.x, two.x);
		int xmax;
		
		//finds the maximum value on the y axis 
		if(one.y + one.height >= two.y +two.height) {
			ymax = one.y + one.height;
		}
		else {
			ymax = two.y + two.height;
		}
		
		//finds the maximum value on the x axis
		if(one.x + one.width >= two.x +two.width) {
			xmax = one.x + one.width;
		}
		else {
			xmax = two.x + two.width;
		}
		
		int newX = -1;
		int newY = -1; 
		int newW = 0;
		int newH = 0;
		
		//y-axis logic
		for(int i =0; i<ymax + 1; i++) {
			for(int k = one.y; k<one.y +one.height + 1; k++) {
				for(int j = two.y; j<two.y + two.height + 1; j++) {
					
					if(i == k && i == j) {
						if(newY == -1) {
							newY = i;
						}
						newH++;
					}
				}
			}
		}
		
		if(newY == -1) {
			newY = 0;
		}
		
		newH --;//switches value to correct height as the height is equal to the number of y points subtract one.
		
		
		//x axis logic
		for(int i =0; i<xmax + 1; i++) {
			for(int k = one.x; k<one.x +one.width + 1; k++) {
				for(int j = two.x; j<two.x + two.width + 1; j++) {
					
					if(i == k && i == j) {
						if(newX == -1) {
							newX = i;
						}
						newW++;
					}
				}
			}
		}
		
		if(newX == -1) {
			newX = 0;
		}
		
		newW --;//switches value to correct height as the height is equal to the number of y points subtract one.
		
		
		if(one.x+one.width < two.x || two.x+two.width <one.x) {
			newY = 0;
			newH = 0;
		}
		
		if(one.y+one.height < two.y || two.y+two.height <one.y) {
			newX = 0;
			newW = 0;
		}
		
		OurRectangle r = new OurRectangle(newX,newY,newW,newH);
		return r;
	}
	
	//calculates the total
	public static int totalPerimeter(OurRectangle one, OurRectangle two) {
		int total = (int) ((one.height+one.width)*2 + (two.height + two.width)*2); 
		OurRectangle i = intersection(one, two);
		total = total - (i.height*2) - (i.width*2);
		return total;
	}
	
	public boolean contains (OurRectangle r) {
		if(this.x <= r.x && r.x + r.width <= this.x+this.width && this.y <=r.y && r.y+r.height <= this.y+this.height) {
			return true;
		}
		else {
			return false;
		}
	}
}


//
//public class OurRectangle {
//
//	//Attributes
//	private static int x, y, width, height;
//	
//	//Constructor
//	public OurRectangle(int a, int b, int c, int d){
//		x = a;
//		y = b;
//		width = c;
//		height = d;
//		
//		
//		if (width<0) {
//			width = 0;
//		}
//		if (height<0) {
//			height = 0;
//		}
//	}
//		
//	//Methods
//	public String toString() { //Converts the numerator and denominator of this instance into Strings
//		String s = "base: " + "(" + x + "," + y + ")" + " w:" + width + " h:" + height;
//		return s;
//	}
//	
//	public int area() {
//		int a = width*height;
//		return a;
//	}
//	
//	public int perimeter() {
//		int p = (2*width)+(2*height);
//		return p;
//	}
//	
//	public static OurRectangle intersection(OurRectangle m, OurRectangle n) {
//		int newx = 0;
//		int newy = 0;
//		int newwidth = 0;
//		int newheight = 0;
//		
//		int xcount = 0;
//		for (int i = m.x; i<=m.x+m.width; i++) {
//			for (int j = n.x; j<=n.x+n.width; j++) {
//				if (j==i) {
//					xcount++;
//					if (xcount == 1) {
//						newx = i;
//						
//					}
//					
//				}
//			}
//		}
//		if (xcount>1) {
//			newwidth = xcount;
//		}
//		
//		int ycount = 0;
//		for (int i = m.y; i<=m.y+m.height; i++) {
//			for (int j = n.y; j<=n.y+n.height; j++) {
//				if (j==i) {
//					ycount++;
//					if (ycount == 1) {
//						newy = i;
//					}
//					
//				}
//			}
//		}
//		if (ycount>1) {
//			newheight = ycount;
//		}
//		
//		OurRectangle rect = new OurRectangle(newx, newy, newwidth, newheight);
//		return rect;
//	}
//	
//}
