package main;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

public class MainMenuState extends BasicGameState 
{
	int id;

	//-----Graphics-----//
	Image background, title;
	
	public MainMenuState(int id)
	{
		this.id = id;
	}
	
	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		background = new Image("Graphics/common/bg_sky.png");
		title = new Image("Graphics/mainmenu/title.png");
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		background.draw();
		title.drawCentered(gc.getWidth()/2, gc.getHeight()/2);
		
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException 
	{
		Input playerInput = gc.getInput();
		
		if(playerInput.isKeyDown(Input.KEY_SPACE))
			sbg.enterState(Game.PLAYSTATE);						// The Game would enter Play state
	}

	@Override
	public int getID() 
	{
		return id;
	}

}
