package object;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Vector2f;
import org.newdawn.slick.state.StateBasedGame;

public abstract class GameObject 
{
	int id;
	boolean active;
	boolean collided;
	Vector2f position;
	Rectangle collisionBox;
	float boxX, boxY;
	
	
	public void setID(int id)
	{
		this.id = id;
	}
	
	public int getID()
	{
		return id;
	}
	
	public void init()
	{
		active = true;
		position = new Vector2f(0, 0);
		collisionBox = new Rectangle(0, 0, 0, 0);
		boxX = 0;
		boxY = 0;
	}
	
	public abstract void update(GameContainer gc, StateBasedGame sbg, int delta, Input i);
	public abstract void render(GameContainer gc, StateBasedGame sbg, Graphics g);
	
	public void setPosX(float x)
	{
		position.x = x;
		collisionBox.setX(position.x + x);
	}
	
	public void setPosY(float y)
	{
		position.y = y;
		collisionBox.setY(position.y + y);
	}
	
	public float getPosX()
	{
		return position.x;
	}
	
	public float getPosY()
	{
		return position.y;
	}
	
	/**
	 * Set the collision box's position relative to the object position
	 * @param x
	 * @param y
	 */
	public void setBox(float x, float y)
	{
		boxX = x;
		boxY = y;
		collisionBox.setLocation(position.x + boxX, position.y + boxY);
	}
	
	public void setDimensions(float width, float height)
	{
		collisionBox.setSize(width, height);
	}

	public void setActive(boolean active)
	{
		this.active = active;
	}
	
	public boolean isActive()
	{
		return active;
	}
	
	public Rectangle getBox()
	{
		return collisionBox;
	}
	
	public boolean collidesWith(GameObject gO)
	{
		if(collisionBox.intersects(gO.getBox()))
			return true;
		else
			return false;
	}
}
