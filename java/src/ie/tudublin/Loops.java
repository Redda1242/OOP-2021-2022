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
				float h = 500;
				float w = 250;
				cx = 0;
				cy = 0;
				rectMode(CORNER);
				
				

				if (mouseX > w)
				{
					cx = w;
				}
				else
				{
					cx = 0;
				}
				if(mouseY < 200 + (h / 2))
				{
					h = 250;
					cy = 0;
				}
				if(mouseY > 200 + (h / 2))
				{
					cy = 250;
					h = 250;
				}

				rect(cx, cy, w, h);
				/*
				if (mouseX > cx - (w / 2) && mouseX < cx + (w / 2) && mouseX > (w/2) && mouseX + (w/2) < 500)
				{	
					cx = mouseX;
				}
				if (mouseY < (cy + (h / 2))/2){
					h = 250;
					cy = 125;
				}
				rect(cx , cy, w, h);
				*/
				break;
		}
	}

}
