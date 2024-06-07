import java.awt.*;
import java.awt.event.*;

public class escListener implements KeyListener, ActionListener
{
    private UnoView view;

    public void actionPerformed (ActionEvent e)
    {

    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        view.escInput(e.getKeyCode());
    }

    /**
     * Not set
     * @param e - Not set
     */
    @Override
    public void keyReleased(KeyEvent e)
    {

    }

    /**
     * Not set
     * @param e - Not set
     */
    public void keyTyped (KeyEvent e)
    {

    }
}
