package ie.tudublin;

import java.util.ArrayList;

import processing.core.PApplet;
import processing.data.Table;
import processing.data.TableRow;

public class NematodeVisualiser extends PApplet
{
	public float border;
	ArrayList<Nematode> nematodes = new ArrayList<Nematode>();

	public void keyPressed()
	{		
		if (keyCode == LEFT)
		{
			nematodes++;
		}		
		
		if (keyCode == RIGHT)
		{
			
		}		
	}


	public void settings()
	{
		size(800, 800);
	}
	Nematode first = null;
	public void setup() 
	{
		loadNematodes();
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
            Nematode nematode = new Nematode(r);
            nematodes.add(nematode);
        }
	}
	

	public void drawNematodes()
    {
        for(Nematode n:nematodes)
			{
				n.render(this);
			}
    }

	public void draw(Nematode pa)
	{	
		drawNematodes();
		textAlign(CENTER);
		text(nematode.this.name, 400,50);
		
        if (nematode.this.name != null)
        {
			textAlign(CENTER);
			text(nematode.this.name, 400,50);
				
				for(int j= 0; j<=this.Length; j++)
				{
					if (j != this.Length)
					{
						circle(width/2, (height/2)+(5*j), 5);
					}
					else{
						if (this.Gender=="f"){
							circle(width/2, (height/2)+(5*j), 5);
							circle(width/2, (height/2)+(5*j), 2);
						}
						if (this.Gender=="h"){
							circle(width/2, (height/2)+(5*j), 5);
							circle(width/2, (height/2)+(5*j), 2);
							stroke(width/2, (height/2)+(5*j)+5,2);
						}
						if (this.Gender=="m"){
							circle(width/2, (height/2)+(5*j), 5);
							stroke(width/2, (height/2)+(5*j)+5,2);
						}
						if (this.Gender=="n"){
							circle(width/2, (height/2)+(5*j), 5);
							}
				}
				if (this.isEyes == 1)
				{
					stroke((width/2)+2,(height/2)+5, 3);
					circle((width/2)-4,(height/2)+10,2);
					stroke((width/2)-2,(height/2)+5, 3);
					circle((width/2)-4,(height/2)+10,2);
				}

			}

		}
	}
}
