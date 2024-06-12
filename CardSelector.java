import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class CardSelector implements MouseListener
{
    private UnoView b;

     public CardSelector(UnoView c){
        this.b = c;
    }

    public void actionPerformed(ActionEvent e){}

    public void mouseExited(MouseEvent e){
        for (int x = 0; x<b.getCards().size();x++){
            if (e.getSource().equals(b.getCards().get(x))){
                this.b.getCards().get(x).setBounds(this.b.getCards().get(x).getX(),100,211,336);
            }
        }
        System.out.println("Mouse Exited");
        this.b.refresh();
        
    }
    public void mouseReleased(MouseEvent e){
        System.out.println("Mouse Released");
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("Mouse Clicked");

    }
    public void mouseEntered(MouseEvent e){
        for (int x = 0; x<b.getCards().size();x++){
            if (e.getSource().equals(b.getCards().get(x))){
                this.b.getCards().get(x).setBounds(this.b.getCards().get(x).getX(),40,211,336);
            }
        }
        this.b.refresh();
    }
    public void mousePressed(MouseEvent e){
        

    }
}
