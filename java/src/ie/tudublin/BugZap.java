package ie.tudublin;

import processing.core.PApplet;

public class BugZap extends PApplet{
    public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(0);

        playerX = 50;
        playerY = 450;
        playerWidth = 300;
		
	}
	
    float playerX;
    float playerY;
    float playerWidth;
    float h;

	public void drawPlayer(float x, float y, float w)
	{	
        h = w/2;

        stroke(255);
        line(x, y, x, y);
	}

    public void drawBug(float x, float y, float w)
	{	
        h = w/2;

        stroke(255);
        line(x, y, x, y);
	}

    public void draw()
    {
        drawPlayer(playerX+20, playerY, playerWidth*0.5f);
    }


    public void keyPressed()
	{
		if (keyCode == LEFT )
		{
			if (playerX > 0)
            {
                playerX = playerX - 1;
            }
		}
		if (keyCode == RIGHT)
		{
			if (playerX < 500)
            {
                playerX = playerX + 1;
            }
		}
		if (key == ' ')
		{
			line(playerX, playerY, playerX, 0);
		}
	}
}
