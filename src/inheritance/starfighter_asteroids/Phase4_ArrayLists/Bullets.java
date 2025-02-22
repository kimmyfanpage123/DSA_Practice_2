package inheritance.starfighter_asteroids.Phase4_ArrayLists;//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class Bullets
{
	private List<Ammo> ammo;

	public Bullets()
	{
		ammo = new ArrayList<Ammo>();
	}

	public void add(Ammo al)
	{
	   ammo.add(al);
	}

	public void draw( Graphics window )
	{
		for( Ammo a : ammo)
			a.draw( window );
	}

	public void move()
	{
		for(Ammo al : ammo)
		{
			al.move("UP");
		}
	}

	public void cleanEmUp()
	{
		for(int i=0; i<ammo.size(); i++)
		{
			if(ammo.get(i).getX()<-20)
			   ammo.remove(i);
		}
	}

	public List<Ammo> getList()
	{
		return ammo;
	}

	public String toString()
	{
		return "" + ammo;
	}
}
