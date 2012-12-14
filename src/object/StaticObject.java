package object;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

public abstract class StaticObject extends GameObject 
{
	Image sprite;
	
	public void init(String ref) throws SlickException
	{
		sprite = new Image(ref);
		super.init();
	}
	
	public void init(String ref, float x, float y) throws SlickException
	{
		init(ref);
		setPosX(x);
		setPosY(y);
	}
	
	public void init(String ref, float x, float y, float bX, float bY, float bW, float bH) throws SlickException
	{
		init(ref, x, y);
		setBox(bX, bY);
		setDimensions(bW, bH);
	}
	
	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) 
	{
		sprite.draw(position.x, position.y);
	}
}
