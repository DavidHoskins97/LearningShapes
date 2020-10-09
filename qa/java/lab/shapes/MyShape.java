package qa.java.lab.shapes;


import java.awt.*;

/*
 *
 * MyShape
 *
 */

public abstract class MyShape
{
	// Instance variables for left, top, width and height of bounding rectangle.
	// Note use of protected modifier to allow direct access by a subclass
	//
	protected int left, top, width, height;


	//
	// ToDo:
	//
	// Add a Constructor. This should initialise all of
	// the instance variables to the values passed in.
	//
	
	public MyShape(int left, int top, int width, int height) 
	{
		this.left = left;
		this.top = top;
		this.width = width;
		this.height = height;
	}




	//
	// ToDo:
	//
	// Add an abstract draw method which takes a
	// reference to a Graphics object. This will force all
	// subclasses of MyShape to implement this method
	// This method will not return anything, but don't forget you 
	// must specify a return type for the method
	
	//public abstract void draw(Graphics graphics);


}
