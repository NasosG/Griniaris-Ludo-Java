/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package griniaris;

import java.awt.Color;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.JButton;

public class Board 
{
    Map<Pawn, JButton> board = new LinkedHashMap<>();  
   
    public Board(){}
   
    //getter για να μπορούμε να πάρουμε το χρώμα που έχει κάποιο κουμπί
    public Color getColorAt(JButton but)
    {
        return but.getBackground();
    }
   
    //setter για να μπορούμε να αλλάξουμε το χρώμα ενός κουμπιού στο board
    public void setButtonsColor(JButton button, Color buttonColor)
    {
        button.setBackground(buttonColor);
    }
   
    public void init(Map <Pawn, JButton> board) {
       this.board = board;
    }
    
    public void setPawnAt(Pawn pawn, JButton pos) {
        board.put(pawn, pos);
    }
    
    public Pawn getPawnAt(JButton pos) {
         for (Map.Entry<Pawn, JButton> entry : board.entrySet())
            if(entry.getValue() == pos)
                return entry.getKey();
         return null;
    }
   //μέθοδος για έλεγχο αν η κίνηση του παίκτη είναι έγκυρη σύμφωνα με το ζάρι
    public boolean checkBoard(ArrayList <JButton> buttons, JButton source, JButton dest, int DiceNum)
    {
        int sourcepos=0, destpos=0, N=buttons.size();

        for(JButton a : buttons) {
            if (source == a)
                sourcepos = buttons.indexOf(a);
            if (dest == a)
                destpos = buttons.indexOf(a);
        }       
        //System.out.println("dest: " + destpos + " source: " + sourcepos + " res: " +(destpos-sourcepos));
        
        // αν το τελικό τετράγωνο προορισμού είναι μικρότερο από το τετράγωνο που ο χρήστης βρίσκεται 
        // δηλαδή το τετράγωνο προορισμού βρίσκεται στην αρχή του arraylist μας
        if (destpos < sourcepos)
            return (DiceNum+sourcepos)%N == destpos;
        
        return (destpos-sourcepos) == DiceNum;
    }

    @Override
    public String toString()
    {
            return " ";
    }

}
