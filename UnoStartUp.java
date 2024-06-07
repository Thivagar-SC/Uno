import javax.swing.*;
import java.awt.event.*;
public class UnoStartUp implements KeyListener
{
    UnoModel model = new UnoModel();

    public static void main(String[] args)
    {
        JFrame frame = new JFrame("Uno");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);

        frame.pack();

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