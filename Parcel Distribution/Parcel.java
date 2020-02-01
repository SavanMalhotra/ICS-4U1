//Savan Malhotra 
//Parcel Distribution Center
//BAF 2019
//November 7th, 2019

import java.awt.Color;
import java.awt.Graphics;

public class Parcel {
	
	//color
	//1 stands for international
	//2 stands for domestic
	//3 stands for unknown
	
	//conveyor
	//0 stands for conveyor One
	//1 stands for conveyor International
	//2 stands for conveyor domestic
	//3 stands for conveyor unknown 
	
	private int height;
	private int width;
	private int length;
	private int x;
	private int y;
	
	private Color color; 
	private int choice;
	static Color[] colorArray = {Color.blue, Color.green, Color.yellow};
	
	private int conveyor;
	private boolean scanned = false;
	private boolean removed = false;
	
	public Parcel(int x, int y) {
		//sets all the dimensions to a random integer within the given range
		int randomHeight = (int) (Math.random()*30 + 20);
		int randomLength = (int) (Math.random()*30 + 20);
		int randomWidth = (int) (Math.random()*40 + 10);
		
		this.height = randomHeight;
		this.width = randomWidth;
		this.length = randomLength;
		this.x = x;
		this.y = y;
		
		int randomColor = (int) (Math.random()*3);
		this.color = colorArray[randomColor];
		this.choice = randomColor + 1;
		
		this.conveyor = 0;
	}
	//returns current parcel color
	public int getColorChoice() {
		return this.choice;
	}
	//sets the current conveyopr belt the package is on
	public void setConveyor(int c) {
		this.conveyor = c;
	}
	//returns the x position of this instance of parcel
	public int getX() {
		return this.x;
	}
	//returns the y position of this instance of parcel
	public int getY() {
		return this.y;
	}
	
	public void move() {
		//checks to see if parcel should be scanned
		if(this.x >= DistributionCenter.getFrameWidth()/2-60 && this.x < DistributionCenter.getFrameWidth()/2 ) {
			Scanner.turnOn();
		}
		if(this.x >= DistributionCenter.getFrameWidth()/2-30) {
			Scanner.scan(this);
			Scanner.turnOff();
		}
		
		//identifies what conveyor the parcel is on
		//also controls the starting and stopping of the conveyor
		switch(this.conveyor) {
			case 0:
				if(Conveyor.firstMoving) {
					this.x++;
				}
				break;
			case 1:
				if(!this.scanned) {
					this.scanned = true;
					Conveyor.addInternational();
				}
				if(this.y+this.height <= 0 && !this.removed) {
					this.removed = true;
					Conveyor.removeInternational();
				}
				else {
					//default opperation
					this.y--;
				}
				break;
			case 2:
				if(!this.scanned) {
					this.scanned = true;
					Conveyor.addDomestic();
				}
				if(this.x > DistributionCenter.getFrameWidth() && !this.removed) {
					this.removed = true;
					Conveyor.removeDomestic();
				}
				else {
					//default opperation
					this.x++;
				}
				break;
			case 3:
				if(!this.scanned) {
					this.scanned = true;
					Conveyor.addUnknown();
				}
				if(this.y > DistributionCenter.getFrameHeight() && !this.removed) {
					this.removed = true;
					Conveyor.removeUnknown();
				}
				else {
					//default opperation
					this.y++;
				}
				break;
		}
		
	}
	
	public void paint(Graphics g) {
		//draws rectanglur prism pacel
		
		//draws the top panel
		int[] polygonX1 = {this.x, this.x + this.length/2, this.x + this.length/2 + this.width, this.x + this.width};
		int[] polygonY1 = {this.y - this.height, this.y - this.height - this.length/2, this.y - this.height - this.length/2, this.y - this.height };
		
		g.setColor(this.color);
		g.fillPolygon(polygonX1, polygonY1, 4);
		g.setColor(Color.black);
		g.drawPolygon(polygonX1, polygonY1, 4);
		
		//draws the right side
		int[] polygonX2 = {this.x + this.width, this.x + this.width, this.x + this.width + this.length/2 , this.x + this.width + this.length/2};
		int[] polygonY2 = {this.y, this.y - this.height, this.y - this.height - this.length/2, this.y - this.length/2 };
		
		g.setColor(this.color);
		g.fillPolygon(polygonX2, polygonY2, 4);
		g.setColor(Color.black);
		g.drawPolygon(polygonX2, polygonY2, 4);
		
		//draws the front
		g.setColor(this.color);
		g.fillRect(this.x, this.y - this.height, this.width, this.height);
		g.setColor(Color.black);
		g.drawRect(this.x, this.y - this.height, this.width, this.height);
	
	}

}
