package layer;

import java.util.ArrayList;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

import object.GameObject;

public class Layer 
{
	ArrayList<GameObject> entries;
	
	public void init()
	{
		entries = new ArrayList<>();
	}
	
	public void update(GameContainer gc, StateBasedGame sbg, int delta, Input i)
	{
		for(int n = 0; n < entries.size(); n++)
		{
			entries.get(n).update(gc, sbg, delta, i);
			
			if(!entries.get(n).isActive())
				entries.remove(n);
		}
	}
	
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g)
	{
		for(int n = 0; n < entries.size(); n++)
		{
			entries.get(n).render(gc, sbg, g);
		}
	}
	
	public void addObject(GameObject gO)
	{
		entries.add(gO);
	}
	
	public int size()
	{
		return entries.size();
	}
}
