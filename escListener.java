import java.awt.*;
import java.awt.event.*;

public class escListener implements KeyListener//, ActionListener
{
    private UnoView view;
    private UnoModel model;

    //public void actionPerformed (ActionEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        model.inputForESC(e.getKeyCode());
    }

    /**
     * Not set
     * @param e - Not set
     */
    @Override
    public void keyTyped(KeyEvent e)
    {}

    /**
     * Not set
     * @param e - Not set
     */
    @Override
    public void keyReleased(KeyEvent e)
    {}
}
