//Savan Malhotra 
//Parcel Distribution Center
//BAF 2019
//November 7th, 2019

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class Conveyor {
	
	static int international = 0;
	static int domestic = 0;
	static int unknown = 0;
	
	private int xSpeed, ySpeed, width, height;
	int x1;
	private int y1;
	private boolean verticalBelt;
	private ArrayList<Integer> lines = new ArrayList<>();

	static boolean firstMoving = true;
	private boolean addAnotherLine = false;
	
	public Conveyor(int speedX, int speedY, int w, int h, int x1, int y1, boolean orientation) {
		this.xSpeed = speedX;
		this.ySpeed = speedY;
		this.width = w;
		this.height = h;
		this.x1 = x1;
		this.y1 = y1; 
		this.verticalBelt = orientation;
		
		if(this.verticalBelt) {
			for(int i = this.y1; i<this.height + this.y1; i = i + 100 ) {
				this.lines.add(i);
			}
		}
		else {
			for(int i = this.x1; i<this.width + this.x1; i = i + 100 ) {
				this.lines.add(i);
			}
		}
	}
	
	
	public void move() {
		for(int i = 0; i<this.lines.size(); i++) {
			
			if(this.verticalBelt) {
				int newPlace = this.lines.get(i)+this.ySpeed;
			
				if(this.ySpeed == -1) {
					if(newPlace <= 0) {
						this.lines.remove(i);
						this.addAnotherLine = true;
					}
					else if((newPlace == this.y1+this.height-100 && this.addAnotherLine)) {
						this.lines.add(this.height);
						this.addAnotherLine = false;
					}
					else {
						this.lines.set(i, newPlace);
					}
				}
				else {
					if(newPlace >= this.height+ this.y1) {
						this.lines.remove(i);
						this.addAnotherLine = true;
					}
					else if((newPlace == this.y1 + 100 && this.addAnotherLine)) {
						this.lines.add(this.y1);
						this.addAnotherLine = false;
					}
					else {
						this.lines.set(i, newPlace);
					}
				}
				
			}
			else {
				int newPlace = lines.get(i)+this.xSpeed;
				if(newPlace >= this.width+ this.x1 ) {
					this.lines.remove(i);
					this.addAnotherLine = true;
				}
				else if((newPlace == 100 && this.addAnotherLine) || (newPlace == this.x1 + 100 && this.addAnotherLine)) {
					this.lines.add(this.x1);
					this.addAnotherLine = false;
				}
				else {
					this.lines.set(i, newPlace);
				}
			}
		}
	}
	
	public static void moving() {
		if(firstMoving) {
			firstMoving = false;
		}
		else {
			firstMoving = true;
		}
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.LIGHT_GRAY);
		g.fillRect(this.x1, this.y1, this.width, this.height);
		
		if(this.verticalBelt) {
			for(int i: lines) {
				g.setColor(Color.DARK_GRAY);
				g.fillRect(this.x1, i, this.width, 1);
			}
		}
		else {
			for(int i: lines) {
				g.setColor(Color.DARK_GRAY);
				g.fillRect(i, this.y1, 1, this.height);
			}
		}
		
		//controls light
		if(firstMoving) {
			g.setColor(Color.green);
			g.fillOval(150, 150, 50, 50);
		}
		else {
			g.setColor(Color.red);
			g.fillOval(150, 150, 50, 50);
		}
	}
	
	public static void addInternational() {
		Conveyor.international++;
	}
	
	public static void removeInternational() {
		Conveyor.international--;
	}
	
	public static void addDomestic() {
		Conveyor.domestic++;
	}
	
	public static void removeDomestic() {
		Conveyor.domestic--;
	}
	
	public static void addUnknown() {
		Conveyor.unknown++;
	}
	
	public static void removeUnknown() {
		Conveyor.unknown--;
	}
}
