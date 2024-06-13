import java.awt.*;
import java.awt.event.*;

/**
 * escListener
 * detects if user hits esc (pause game)
 * 
 * @author tba
 * @since 2024/06/12
 */
public class escListener implements KeyListener, ActionListener {
    private UnoView view; // view of game
    private UnoModel model; // model of game
    private pauseMenu pauseMenu; // pause menu component

    /**
     * actionPerformed
     * detects user inputs anything
     * 
     * @author tba
     * @param e - event user preformed
     */
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Resume")) // not sure when this well ever be equal so idk u comment
        {
            pauseMenu.setVisible(false);
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
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
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
