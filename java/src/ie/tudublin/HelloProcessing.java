package ie.tudublin;

import processing.core.PApplet;

public class HelloProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		colorMode(RGB);
		background(0);
		
	}

	
	public void draw()
	{	
		stroke(255);
		background(255, 0, 0);//grey scale
		//line(10, 10, 200, 200);//x1,y1,x2,y2

		fill(255, 255,0);
		noStroke();
		circle(250, 250, 400);//cx,cy,r
		//ellipse(50, 200, 90, 200);//cx,cy,width,height
		
		//stroke(0);

		
		//rectMode(CENTER);
		//rect(300, 20, 100, 20);//tlx,tly,w,h

		//rectMode(CORNER);
		//rect(300, 20, 100, 20);//tlx,tly,w,h

		//point(20, 300);
		fill(0, 255, 255);
		triangle(250, 10, 20, 400, 480, 400);// x1,y1,x2,y2,x3,y3
		
		fill(200);
		ellipse(250, 200, 200, 100);

		fill(0);
		circle(250, 200, 80);
	}
}
