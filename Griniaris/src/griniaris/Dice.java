package griniaris;

import java.util.Random;
import javax.swing.ImageIcon;


public class Dice 
{
    
    Random rand = new Random();
    private final int  n = rand.nextInt(6) + 1;
    
    @Override
    public String toString()
    {
        return "Ο αριθμός είναι: " + n;
    }

    //για να μπορούμε να πάρουμε τον αριθμό του ζαριού
    public int getN() {
        return n;
    }
    
    //για να μπορούμε να αλλάξουμε γραφικά την εικόνα του ζαριού μας ανάλογα με το αποτέλεσμα της ρίψης
    public ImageIcon getDiceIcon(){
    
    return (new ImageIcon(".\\dice" + n + ".png"));
    }
  
}
