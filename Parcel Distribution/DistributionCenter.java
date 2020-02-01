//Savan Malhotra 
//Parcel Distribution Center
//BAF 2019
//November 7th, 2019

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;

public class DistributionCenter extends JPanel {
	
	private static int frameHeight = 640;
	private static int frameWidth = 1020;
	
	private int conveyorSpeed = 1;
	
	//int speedX, int speedY, int w, int h, int x1, int y1, int x3, int y2
	private Conveyor cFirst = new Conveyor(this.conveyorSpeed, 0, (DistributionCenter.frameWidth/2 - 50), 100, 0, (DistributionCenter.frameHeight/2 - 50), false);
	private Conveyor cInternational = new Conveyor(0, -this.conveyorSpeed, 100, (DistributionCenter.frameHeight/2 - 50), (DistributionCenter.frameWidth/2 - 50), 0, true);
	private Conveyor cDomestic = new Conveyor(this.conveyorSpeed, 0, (DistributionCenter.frameWidth/2 - 50), 100, (DistributionCenter.frameWidth/2 + 50), (DistributionCenter.frameHeight/2 - 50), false);
	private Conveyor cUnknown = new Conveyor(0, this.conveyorSpeed, 100, (DistributionCenter.frameHeight/2 - 50), (DistributionCenter.frameWidth/2 - 50), (DistributionCenter.frameHeight/2 + 50), true);
	
	ArrayList<Parcel> parcels = new ArrayList<>();
	
	private Scanner scanner = new Scanner();
	 	
	public DistributionCenter() {
		//adds parcels to the arraylist
		for(int i=0; i<20; i++) {
			parcels.add(new Parcel(-i*300, DistributionCenter.getFrameHeight()/2 + 30));
		}
	}
	
	@Override
    public void paint(Graphics g) {
		//redraws belts if frame changes size
		if(this.getWidth() != getFrameWidth() || this.getHeight() != getFrameHeight()) {
			DistributionCenter.frameWidth = this.getWidth();
			DistributionCenter.frameHeight = this.getHeight();
			
			cFirst = new Conveyor(this.conveyorSpeed, 0, (DistributionCenter.frameWidth/2 - 50), 100, 0, (DistributionCenter.frameHeight/2 - 50), false);
			cInternational = new Conveyor(0, -this.conveyorSpeed, 100, (DistributionCenter.frameHeight/2 - 50), (DistributionCenter.frameWidth/2 - 50), 0, true);
			cDomestic = new Conveyor(this.conveyorSpeed, 0, (DistributionCenter.frameWidth/2 - 50), 100, (DistributionCenter.frameWidth/2 + 50), (DistributionCenter.frameHeight/2 - 50), false);
			cUnknown = new Conveyor(0, this.conveyorSpeed, 100, (DistributionCenter.frameHeight/2 - 50), (DistributionCenter.frameWidth/2 - 50), (DistributionCenter.frameHeight/2 + 50), true);
		}
		
		//paints conveyer belts
		cFirst.paint(g);
		cInternational.paint(g);
		cDomestic.paint(g);
		cUnknown.paint(g);
		
		//paints parcels
		for(Parcel p: parcels) {
			p.paint(g);
		}
		
		//paints scanner
		scanner.paint(g);		
    }
	
	public void move() {
		//moves conveyer belts
		if(Conveyor.firstMoving) {
			cFirst.move();
		}
		if(Conveyor.international > 0) {
			cInternational.move();
		}
		if(Conveyor.domestic > 0) {
			cDomestic.move();
		}
		if(Conveyor.unknown > 0) {
			cUnknown.move();
		}
		
		//moves each parcel
		for(Parcel p: parcels) {
			p.move();
		}
	}
	
	public static int getFrameHeight(){
		return frameHeight;
	}
	
	public static int getFrameWidth(){
		return frameWidth;
	}

	public static void main(String[] args) throws InterruptedException {
		//creates new instance of DistibutionCenter class
		DistributionCenter center = new DistributionCenter();
       	center.setFocusable(true);
		center.requestFocusInWindow();
		center.addKeyListener(new KeyListener() {
			@Override
			public void keyTyped(KeyEvent e) {}
			@Override
			public void keyReleased(KeyEvent e) {}
			@Override
			public void keyPressed(KeyEvent e) {
				//detects if space is pressed
				if(e.getKeyCode()==KeyEvent.VK_SPACE){
					Conveyor.moving(); 
				} 
			}
       	});
		
		//setting up the JFrame
	    JFrame frame = new JFrame("Parcel Distribution Center - Savan Malhotra");
	    frame.setSize(frameWidth, frameHeight);
	    frame.add(center);
	    frame.setVisible(true);
       	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       	
       	while (true) {
  	 		center.move();
			center.repaint();
			Thread.sleep(5);
  	 	}  	
	}
}

