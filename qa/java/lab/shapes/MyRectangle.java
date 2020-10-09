package qa.java.lab.shapes;


import java.awt.*;

/*
 *
 * MyRectangle
 *
 */

public class MyRectangle extends MyShape implements Drawable
{

	public 
	//
	// ToDo:
	//
	// Add a constructor which takes 4 arguments: left, top, width and height
	//
	// You will need to pass these on to the constructor of the superclass
	// Remember how to call a superclass constructor? 
	
	MyRectangle(int left, int top, int width, int height) 
	{
		super(left, top, width, height);
	}



	//
	// ToDo:
	//
	// Implement the draw() method defined in the superclass.
	// This should draw a rectangle of the required size
	//
	// Hint: class Graphics contains a drawRect() method
	//
	
	public void draw(Graphics graphics) {
		graphics.drawRect(left, top, width, height);
	}



}
