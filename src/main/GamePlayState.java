package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class GamePlayState extends BasicGameState 
{
	int id;
	
	Image background;
	
	public GamePlayState(int id)
	{
		this.id = id;
	}
	
	@Override
	public void init(GameContainer container, StateBasedGame game) throws SlickException 
	{
		background = new Image("Graphics/common/bg_sky.png");
	}

	@Override
	public void render(GameContainer container, StateBasedGame game, Graphics g) throws SlickException 
	{
		
	}

	@Override
	public void update(GameContainer container, StateBasedGame game, int delta) throws SlickException 
	{
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getID() 
	{
		// TODO Auto-generated method stub
		return 0;
	}

}
