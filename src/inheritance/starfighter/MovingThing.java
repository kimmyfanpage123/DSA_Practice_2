package inheritance.starfighter;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Color;
import java.awt.Graphics;

public class MovingThing
{
	private int xPos;
	private int yPos;
	private int width;
	private int height;

	public MovingThing()
	{
		xPos = 10;
		yPos = 10;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y)
	{
		xPos = x;
		yPos = y;
		width = 10;
		height = 10;
	}

	public MovingThing(int x, int y, int w, int h)
	{
		//add code here
	}

	public void setPos( int x, int y)
	{
		//add code here
	}

	public void setX(int x)
	{
		//add code here
	}

	public void setY(int y)
	{
		//add code here
	}

	public int getX()
	{
		return 0;   //finish this method
	}

	public int getY()
	{
		return 0;  //finish this method
	}

	public void setWidth(int w)
	{
		//add code here
	}

	public void setHeight(int h)
	{
		//add code here
	}

	public int getWidth()
	{
		return 0;  //finish this method
	}

	public int getHeight()
	{
		return 0;  //finish this method
	}

	public void move(String direction)
	{
		//this method will be fully implemented
		//in the sub class
		//treat this method as if it was abstract
	}
	
	public void draw(Graphics window)
	{
		//this method will be fully implemented
		//in the sub class
		//treat this method as if it was abstract
	
	}

	public String toString()
	{
		return getX() + " " + getY() + " " + getWidth() + " " + getHeight();
	}
}