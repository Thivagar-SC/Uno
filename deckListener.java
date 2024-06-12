import java.awt.event.*;

public class deckListener implements MouseListener{
    private UnoModel model;

    public deckListener(UnoModel model){
        this.model = model;
    }

    public void mouseExited(MouseEvent e){
        
    }
    public void mouseReleased(MouseEvent e){
    }
    public void mouseClicked(MouseEvent e){
        System.out.println("CLICK");
        this.model.drawCard();
    }
    public void mouseEntered(MouseEvent e){
    }
    public void mousePressed(MouseEvent e){

    }
 
}
