package griniaris;

import java.awt.Color;
import javax.swing.JButton;

public class Pawn 
{
    private Color pawnColor;
    private JButton pawnPosition;
    private int id;
    
    public Pawn(){}
    
    public Pawn(Color pawnColor, JButton pawnPosition) 
    {
        this.pawnColor = pawnColor;
        this.pawnPosition = pawnPosition;
    }
    
    public Pawn(Color pawnColor, JButton pawnPosition, int id) 
    {
        this.pawnColor = pawnColor;
        this.pawnPosition = pawnPosition;
        this.id = id;
    }
    
    public Color getpawnColor(){
        return pawnColor;
    }
    
    public JButton getpawnPosition(){
        return pawnPosition;
    }
    
    public int getId(){
        return id;
    }
    
    public void setpawnColor(Color pawnColor){
        this.pawnColor = pawnColor;
    }
   
    public void setpawnPosition(JButton pawnPosition){
        this.pawnPosition = pawnPosition;
    }
    
    public void setpawnPosition(int id){
        this.id = id;
    }
}
