package main;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class Game extends  StateBasedGame
{
	//-----State IDs-----//
	public static final int MAINMENUSTATE = 0;
	public static final int PLAYSTATE = 1;
	
	
	public Game(String name) 
	{
		super(name);
		
		// TODO Add states
		this.addState(new MainMenuState(MAINMENUSTATE));
		this.addState(new PlayState(PLAYSTATE));
	}

	@Override
	public void initStatesList(GameContainer gc) throws SlickException 
	{
		// TODO get and initialize states
		this.getState(MAINMENUSTATE).init(gc, this);
		this.getState(PLAYSTATE).init(gc, this);
		
		// TODO enter state
		this.enterState(MAINMENUSTATE);
		
	}

	public static void main(String[] args) throws SlickException
	{
		AppGameContainer gameWindow = new AppGameContainer(new Game("Birthday Rush"));
		gameWindow.setDisplayMode(1024, 480, false);
		
		gameWindow.start();
	}
}
