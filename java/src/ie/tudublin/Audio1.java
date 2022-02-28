package ie.tudublin;

import dff.minim.AudioBuffer;
import dff.minim.Input;
import dff.minim.AudioPlayer;
import dff.minim.Minim;
import processing.core.PApplet;

public class Audio1 extends PApplet{
    Minim minim;
    AudioPlayer ap;
    AudioInput ai;
    AudioBuffer ab;

    public void settings()
    {
        size(1024, 500);
    }

    public void setup()
    {   
        minim = new Minim(this);
        ai = minim.getLineIn(Minim.MONO, width, 44100, 16);
        ai = ai.max;

    }

    public void draw()
    {
        background(0);
        stroke(255);

        float halfH = height /2;

        for(int i = 0; i < ab.size(); i++)
        {
            line(i, halfH, i, halfH + ab.get(i));
        }
    }

}
