package platform;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.state.StateBasedGame;

import object.StaticObject;
import main.PlayState;

public class Floor extends StaticObject 
{
	//float speed;
	
	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta, Input i) 
	{
		setPosX(getPosX() - PlayState.playerSpeed * delta);
		
		
		// Inactive if off screen
		if(getPosX() <= -getWidth())
			setActive(false);
	}

	/*public void setSpeed(float s)
	{
		speed = s;
	}*/
}
