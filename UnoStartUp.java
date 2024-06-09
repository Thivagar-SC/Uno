import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.*;
public class UnoStartUp implements KeyListener
{
    UnoModel model = new UnoModel();

    public static void main(String[] args)
    {

        UnoView a = new UnoView();
        JFrame test = new JFrame();
        test.setSize(new Dimension(1000,1000));
        a.displayCards3();
        test.setContentPane(a);
        test.setVisible(true);

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