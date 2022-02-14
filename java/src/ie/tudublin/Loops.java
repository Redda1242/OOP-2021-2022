package ie.tudublin;

import processing.core.PApplet;

public class Loops extends PApplet
{


	int mode = 0;
	float cx = 250;
	float cy = 250;

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(HSB);
		background(20);
		
	}

	public void keyPressed()
	{
		if (key >= '0' && key <='9')
		{
			mode = key - '0';
		}
		println(mode);
	}

	
	public void draw()
	{
		background(20);
		switch(mode)	
		{
			case 0:
				float rectWidth = 200;
				float rectHeight = 50;
				rectMode(CENTER);

				if (mouseX > cx - (rectWidth / 2) && mouseX < cx + (rectWidth / 2) && mouseY > cy - (rectHeight / 2) && mouseY < cy +(rectHeight / 2))
				{
					fill(50, 255, 255);
				}
				else
				{
					fill(200, 255, 255);
				}
				rect(cx, cy, rectWidth, rectHeight);			
				break;
			case 1:
				
				cx = 0;
				cy = 0;
				int red;
				int green;
				int blue;

				rectMode(CORNER);
				noStroke();
				fill(50, 255,255);
				for ( red = 0; red < 256; red+=25) {
					for ( green = 0; green < 256; green+=25)
						for ( blue = 0; blue < 256; blue+=25)
							fill(red, green, blue);
					rect(cx, cy, width/10 , height);
					cx += 50;
					
				}
				break;
		}
	}

}
