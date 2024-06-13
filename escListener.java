import java.awt.*;
import java.awt.event.*;

public class escListener implements KeyListener, ActionListener
{
    private UnoView view;
    private UnoModel model;
    private pauseMenu pauseMenu;

    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals("Resume"))
        {
            pauseMenu.setVisible(false);
        }
        else if(e.getActionCommand().equals("Return to Main Menu"))
        {
            view.mainMenu();
        }
        else if(e.getActionCommand().equals("Quit Game"))
        {
            model.quitGame();
        }
    }

    @Override
    public void keyPressed(KeyEvent e)
    {
        System.out.println("keyPressed");
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
