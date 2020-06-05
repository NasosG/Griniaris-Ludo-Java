package griniaris;

import java.awt.Color;
import java.util.ArrayList;

public class Player 
{
    private String name;
    private Color color;
    private String scolor;
    private ArrayList<Pawn> pawns = new ArrayList<>();

    public Player(String name, String scolor)
    {
        this.name = name;
        this.scolor = scolor;
    }
    
    public Player(String name, Color color)
    {
        this.name = name;
        this.color = color;
    }
    
    public Player() {}
    
    
    public String getname()
    {
        return name;
    }
    
    public Color getColor(){
        return color;
    }
    
    public String getcolor()
    {
        return color.getRed()+","+color.getGreen()+","+color.getBlue();
    }
    
    public String getcolorInString()
    {
        return scolor;
    }
    
    public void setPawn(Pawn p)
    {
        pawns.add(p);
    }
    
    @Override
    public String toString()
    {
        if (color!=null)
            return "name: " + name + " color: " + color;
        else
            return "name: " + name + " color: " + scolor;
    }
}
