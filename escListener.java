import java.awt.event.*;

public class escListener implements KeyListener, ActionListener
{
    private UnoView view;
    private UnoModel model;
    private PauseMenu pauseMenu;

    public escListener(UnoModel model)
    {
        this.model = model;
    }

    public void actionPerformed (ActionEvent e)
    {
        if (e.getActionCommand().equals("Resume"))
        {
            this.model.pauseGame();
        } else if (e.getActionCommand().equals("Return to Main Menu"))// something
        {
            view.mainMenu();
        } else if (e.getActionCommand().equals("Quit Game")) // something else
        {
            model.quitGame();
        }
    }


    /**
     * keyPressed
     * detects user key pressed
     * 
     * @author tba
     * @param e - TBA
     */
    @Override
    public void keyPressed(KeyEvent e)
    {
        model.inputForESC(e.getKeyCode());
    }

    /**
     * keyTyped
     * Not set
     * 
     * @author tba
     * @param e - Not set
     */
    @Override
    public void keyTyped(KeyEvent e) {
    }

    /**
     * keyReleased
     * Not set
     * 
     * @author tba
     * @param e - Not set
     */
    @Override
    public void keyReleased(KeyEvent e) {
    }
}
