package ie.tudublin;

import processing.core.PApplet;

//import java.util.jar.Attributes.Name;

//import processing.core.PApplet;
import processing.data.TableRow;

public class Nematode
{
    private String Name;
    private float Length;
    private boolean Limbs;
    private String Gender;
    private boolean Eyes;

    @Override
    public String toString() {
        return "Nematode [Name=" + Name + ", Length=" + Length + ", Limbs=" + Limbs + ", Gender=" + Gender + ", Eyes=" + Eyes + "]";
    }

    public Nematode(TableRow tr)
    {
        this(
            tr.getString("name"), 
            tr.getFloat("Length"), 
            tr.getInt("Limbs")==1, 
            tr.getString("Gender"),
            tr.getInt("Eyes")==1
        );
    }

    public Nematode(String Name, float Length, boolean Limbs, String Gender, boolean Eyes) {
        this.Name = Name;
        this.Length = Length;
        this.Limbs = Limbs;
        this.Gender = Gender;
        this.Eyes = Eyes;
    
    
    }

    public String getName() {
        return Name;
    }


    public void setName(String name) {
        Name = name;
    }


    public float getLength() {
        return Length;
    }


    public void setLength(float length) {
        Length = length;
    }


    public boolean isLimbs() {
        return Limbs;
    }


    public void setLimbs(boolean limbs) {
        Limbs = limbs;
    }


    public String getGender() {
        return Gender;
    }


    public void setGender(String gender) {
        Gender = gender;
    }


    public boolean isEyes() {
        return Eyes;
    }


    public void setEyes(boolean eyes) {
        this.Eyes = eyes;
    }

    public void render(NematodeVisualiser pa){

        //Print the name of the nematode
        pa.fill(255);
        pa.textSize(50);
        pa.textAlign(PApplet.CENTER, PApplet.CENTER);
        pa.text(Name, pa.width / 2, pa.height - (pa.border * 0.5f));
    }
    
}