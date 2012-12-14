package main;

import layer.Layer;

import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.Input;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import platform.PlatformGenerator;

public class PlayState extends BasicGameState 
{
	int id;
	
	//-----Graphics-----//
	Image background;
	
	//---Game Objects---//
	PlatformGenerator pGen;
	
	//------Layers------//
	Layer platformLayer;
	
	//----LOLPhysics----//
	public static float playerSpeed = 0.05f;
	float gravity = 0.0981f;				// Change this if too fast or slow
	float acceleration = 0.0003f;
	
	
	public PlayState(int id)
	{
		this.id = id;
	}

	@Override
	public void init(GameContainer gc, StateBasedGame sbg) throws SlickException 
	{
		background = new Image("Graphics/common/bg_sky.png");
		
		platformLayer = new Layer();
		platformLayer.init();
		
		pGen = new PlatformGenerator();
		pGen.init(gc, platformLayer);
	}

	@Override
	public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException 
	{
		background.draw();
		platformLayer.render(gc, sbg, g);
	}

	@Override
	public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException 
	{
		playerSpeed += acceleration/16;
		
		Input playerInput = gc.getInput();
		
		platformLayer.update(gc, sbg, delta, playerInput);
		pGen.generate(gc);
		
	}

	@Override
	public int getID() 
	{
		return id;
	}
}
