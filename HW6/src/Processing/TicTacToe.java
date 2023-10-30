/**
 * Primative Tic-Tac-Toe game 
 * 
 * @author:      Hengyi Wu
 * @since:       Dec. 8, 2015
 * 
 * We have all played tic-tac-toe before. Player 1 is squares. Player 2 is circles. 
 * First one to make 3 in row wins. 
 * To play: Player 1 does left-click. Player 2 does right-click. 
 * 
 */

package Processing;

import processing.core.PApplet;

public class TicTacToe extends PApplet{
	
	public void setup(){

		background(random(0,255), random(0,255), random(0,255) );
		size(600,600);
		rect(200,0,1,600);
		rect(400,0,1,600);
		rect(0,200,600,1);
		rect(0,400,600,1);
		
	}

	public void draw(){
		float l=0,r=0,u=0,d=0;
		if(mousePressed){
			if(mouseX>0 && mouseX<200){
				l=0;
				r=200;
			}
			else if(mouseX>200 && mouseX<400){
				l=200;
				r=400;
			}
			else if(mouseX>400 && mouseX<600){
				l=400;
				r=600;
			}
		}
			
		if(mousePressed){
			if(mouseY>0 && mouseY<200){
				u=0;
				d=200;
			}
			else if(mouseY>200 && mouseY<400){
				u=200;
				d=400;
			}
			else if(mouseY>400 && mouseY<600){
				u=400;
				d=600;
			}
			
		}
		if(mousePressed){
			if (mouseButton == LEFT){
				fill(0, 0, 255 );
				rect(-50+(l+r)/2, -50+(u+d)/2, 100, 100);
			}
			else if (mouseButton == RIGHT){
				fill(255, 0 , 0 );
				ellipse((l+r)/2, (u+d)/2, 100, 100);
			}
			
		}
	}
}
		

