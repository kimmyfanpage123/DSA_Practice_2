package inheritance.starfighter_asteroids.Phase4_ArrayLists;

import java.util.*;
import java.awt.Graphics;

public class AlienHorde
{
	private List<Alien> aliens;
	private int score;

	public AlienHorde(int size)
	{
		//make a new ArrayList of Aliens
		
		//add size Aliens to the new ArrayList
		
		//set score to 0
	}

	public void add(Alien al)
	{
	   aliens.add(al);
	}

	public void draw( Graphics window )
	{
		for( Alien a : aliens)
			a.draw( window );
	}

	public void move()
	{
		//make all of the Aliens move
		//use a for each loop
	}
	
	public int getScore() {
		return score;
	}
	
	public int size() {
		return aliens.size();
	}

	public List<Alien> removeDeadOnes(List<Ammo> shots)
	{
		ArrayList<Alien> dead = new ArrayList<Alien>();
		
		//write the code to 
		//remove all dead Aliens
		
		return dead;
		
	}
	
	public void die() {
		for(Alien a: aliens) {
			if(!(a.isDead())) {
				a.die();
			}
			else {
				if(a.getHeight()<=10) {
					aliens.remove(a);
					break;
				}
			}
		}
	}

	public void touching(Ship a) {
		//add code to see if any of
		//the Aliens are touching the
		//ship
	}
	
	public String toString()
	{
		return "" + aliens;
	}
}
