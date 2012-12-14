package platform;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import layer.Layer;

public class PlatformGenerator 
{
	//---Floor properties---//
	/*
	 * {<image location>, <box X>, <box Y>, <box width>, <box height>}
	 */
	String[] floor_low = {"Graphics/floor/floor_low.png", "0", "32", "1024", "165"};
	
	
	Layer platformLayer;
	Floor currFloor;
	
	public void init(GameContainer gc, Layer l) throws SlickException
	{
		//platformLayer.init();
		
		// Create and configure first floor
		currFloor = createFloor(floor_low);
		currFloor.setPosY(gc.getHeight() - currFloor.getHeight());
		
		// Add to layer
		platformLayer.addObject(currFloor);
	}
	
	public Floor createFloor(String[] s) throws SlickException
	{
		Floor newFloor;
		float bX, bY, bW, bH;
		
		bX = Float.parseFloat(s[1]);
		bY = Float.parseFloat(s[2]);
		bW = Float.parseFloat(s[3]);
		bH = Float.parseFloat(s[4]);
		
		newFloor =  new Floor();
		newFloor.init(s[1], 0, 0, bX, bY, bW, bH);
		return newFloor;
	}
}
