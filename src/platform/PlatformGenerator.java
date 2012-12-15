package platform;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;

import layer.Layer;

public class PlatformGenerator 
{
	//---Floor properties---//
	/*
	 * {<id>, <image location>, <box X>, <box Y>, <box width>, <box height>}
	 */
	String[][] floors = {{"1", "Graphics/floor/floor_low_", "0", "69", "512", "98"},
						 {"2", "Graphics/floor/floor_mid_", "0", "69", "512", "244"}};
	
	
	Layer platformLayer;
	Floor currFloor;
	
	public void init(GameContainer gc, Layer l) throws SlickException
	{
		platformLayer = l;
		
		// Create and configure first floor
		currFloor = createFloor(floors[0]);
		currFloor.setPosY(gc.getHeight() - currFloor.getHeight());
		
		// Add to layer
		platformLayer.addObject(currFloor);
	}
	
	public Floor createFloor(String[] s) throws SlickException
	{
		Floor newFloor;
		float bX, bY, bW, bH;
		int id;
		
		id = Integer.parseInt(s[0]);
		bX = Float.parseFloat(s[2]);
		bY = Float.parseFloat(s[3]);
		bW = Float.parseFloat(s[4]);
		bH = Float.parseFloat(s[5]);
		
		newFloor =  new Floor();
		newFloor.setID(id);
		newFloor.init(s[1], 0, 0, bX, bY, bW, bH);
		return newFloor;
	}
	
	public void generate(GameContainer gc) throws SlickException
	{
		float pitWidth = 10;
		float posX = currFloor.getPosX() + currFloor.getWidth() + pitWidth;
		
		if(currFloor.getPosX() < gc.getWidth())
		{
			int index = randPlatformID();
			currFloor = createFloor(floors[index]);
			currFloor.setPosX(posX);
			currFloor.setPosY(gc.getHeight() - currFloor.getHeight());
			platformLayer.addObject(currFloor);
		}
	}
	
	public int randPlatformID()
	{
		int lowest = 0;
		int highest = floors.length - 1;
		if(currFloor.getID() == 0)
			lowest = 1;
		
		return (int)(Math.random() * (highest - lowest + 1)) + lowest;
	}
}
