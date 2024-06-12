import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardSelector implements MouseListener
{
    private UnoModel model;

     public CardSelector(UnoModel c){
        this.model = c;
    }

    public void actionPerformed(ActionEvent e){}

    public void mouseExited(MouseEvent e){
        this.model.dropCard(e.getSource());
        
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e){
        this.model.raiseCard(e.getSource());
    }
    public void mousePressed(MouseEvent e){
        

    }
}
