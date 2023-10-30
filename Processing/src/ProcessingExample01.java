/**
 * Test program #3: Printing text and changing its properties. Detecting mouse
 * clicks. 
 * 
 * @author:      Joanna Klukowska
 * @since:       Sept. 25, 2013
 * 
 * Introduces:
 * 
 * - adding text to the display
 *  text("string to print", x, y)
 *             - prints the string at the specified position
 *             
 * - specifying text properties
 *  textSize( size)
 *             - set the font size
 *  fill( redLevel, greenLevel, blueLevel)
 *             - specifies the color to be used for the next text
 *  textAlign( [RIGH, CENTE, LEFT] )
 *             - specifies text alignement with respect to the position
 *               used in the text( ... ) method
 *             
 * - detecting mouse clicks
 *  mousePressed - data field becomes true if any of the mouse buttons
 *                 has been pressed in the last iteration of the draw() method
 *        
 * - changing color of the background after the initial setup: simply call the
 *   background() method inside the draw loop
 *               
 *  For more details see http://processing.org/reference/ 
 */

import processing.core.PApplet;

public class ProcessingExample01 extends PApplet 
{	
	//dimensions of the canvas
	int xMax = 500;
	int yMax = 300;
	//initial position of the ball
	float x = random(0,xMax);
	float y = random(0,yMax);
	//step size in ball's movement 
	float xi = 2;
	float yi = 1;
	
	public void setup() 
	{
		size(xMax,yMax);
	}
	
	public void draw() 
	{	
		//redraw the background in each iteration of the draw method
		background(127,127,127); 
		//draw the new ball "near" the old position to simulate
		//continuous motion
		//ball bounces of the sides of the canvas
		if (x >= xMax || x <= 0)
			xi = -xi;
		if (y >= yMax || y <= 0)
			yi = -yi;
		x = x+xi;
		y = y+yi;
		ellipse(x, y, 10, 10);		
		
	}

}
