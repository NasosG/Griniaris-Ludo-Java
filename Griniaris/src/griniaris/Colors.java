package griniaris;

import java.awt.Color;

public enum Colors 
{
     red, green, blue, yellow;
     
     Colors a;
     
     public Colors Colors(Colors b)
     {
         a=b;
         return a;
     }
     
    public Color nextColor()
    {
        if (a==Colors.yellow){
            a=Colors.green;
            return new Color(0,130,0);
        }
        else if (a==Colors.green){
            a=Colors.red;
            return new Color(130,0,0);
        }
        else if (a==Colors.red){
            a=Colors.blue;
            return new Color(0,0,130);
        }
        else {
            a=Colors.yellow;
            return new Color(160,160,0);
        }
    }
    
}
  

