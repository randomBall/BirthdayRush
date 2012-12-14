import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;


public class Game extends  StateBasedGame
{

	public Game(String name) 
	{
		super(name);
		
		// TODO Add states
	}

	@Override
	public void initStatesList(GameContainer arg0) throws SlickException 
	{
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) throws SlickException
	{
		AppGameContainer gameWindow = new AppGameContainer(new Game("Birthday Rush"));
		gameWindow.setDisplayMode(1024, 480, false);
		
		gameWindow.start();
	}
}
