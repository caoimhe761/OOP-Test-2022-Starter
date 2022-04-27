package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{

		}		
		
		if (keyCode == RIGHT)
		{
			
		}		
	}


	public void settings()
	{
		size(800, 800);
	}

	public void setup() 
	{
		colorMode(HSB);
		background(0);
		stroke(255, 0, 255); //pink line
        textAlign(CENTER, CENTER);
        textSize(20);
		smooth();				
	}
	

	public void loadNematodes()
	{
		
        Table table = loadTable("nematodes.csv", "header");
        for(TableRow r:table.rows())
        {
            Nematode nemato = new Nematode(r);
            nematodes.add(nemato);
        }
	}


	public void draw()
	{	
		for (Nematode n : nematodes) {
			
		}
	}
}
