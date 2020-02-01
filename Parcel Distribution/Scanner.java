//Savan Malhotra 
//Parcel Distribution Center
//BAF 2019
//November 7th, 2019

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.*;

public class Scanner {
	
	public static boolean beingScanned = false;
	private static BufferedImage image = null;
	private static int imageChoice = 0;
	
	public Scanner() {}
	
	public void paint(Graphics g) {
		//paints rectangle of scanner
		g.setColor(Color.GRAY);
		g.fillRect(DistributionCenter.getFrameWidth()/2-60, DistributionCenter.getFrameHeight()/2-60, 120, 120);
		
		//paints light of the scanner
		g.setColor(Color.black);
		if(Scanner.beingScanned) {
			g.setColor(Color.red);
		}
		
		g.fillOval(DistributionCenter.getFrameWidth()/2-20, DistributionCenter.getFrameHeight()/2-20, 40, 40);
		
		//paints image in bottom left
		try {
			switch(Scanner.imageChoice) {
				case 1: 
					Scanner.image = ImageIO.read(getClass().getResource("Plane.png"));
					break;
				case 2:
					Scanner.image = ImageIO.read(getClass().getResource("Truck.png"));
					break;
				case 3:
					Scanner.image = ImageIO.read(getClass().getResource("Question.png"));
					break;
			}
			g.drawImage(Scanner.image, 50 , DistributionCenter.getFrameHeight() - 150, 100, 100, null);    
		} 
		catch (IOException e) {
			System.out.println(e);
		}
	}
	
	public static void scan(Parcel p) {
		p.setConveyor(p.getColorChoice());
		Scanner.imageChoice = p.getColorChoice();
		Scanner.turnOn();
	}
	
	public static void turnOn() {
		Scanner.beingScanned = true;
	}
	
	public static void turnOff() {
		Scanner.beingScanned = false;
	}
	
}
