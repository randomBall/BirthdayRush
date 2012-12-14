package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class PlayState extends BasicGameState 
{
	int id;
	
	public PlayState(int id)
	{
		this.id = id;
	}

	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException 
	{
		
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() 
	{
		return id;
	}
}
