import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

/**
 * pauseMenu
 * displays a pause menu component
 * 
 * @author tba
 * @since 2024/06/12
 */
public class pauseMenu extends JPanel {
    UnoModel model; // model of game (not needed?)
    UnoView view; // view of game (also not needed?)
    private String pausedMessage = "PAUSED"; // Message displayed to user
    private boolean isPaused; // if game is paused

    private JButton resumeButton; // Interactable buttons
    private JButton quitToMainMenuButton;
    private JButton quitGameButon;
    private JPanel buttons;

    /**
     * pauseMenu
     * pauseMenu Constructor
     * 
     * @author tba
     */
    public pauseMenu() {
        super();
        isPaused = true;
        this.setVisible(false);
        this.setPreferredSize(new Dimension(100, 100));
        this.setLayout(new GridLayout(3, 1));

        // setting text
        resumeButton = new JButton("Resume");
        quitToMainMenuButton = new JButton("Return to Main Menu");
        quitGameButon = new JButton("Quit Game");

        // OUTPUT
        this.add(resumeButton);
        this.add(quitToMainMenuButton);
        this.add(quitGameButon);
    }

    public void update() {
    }

}
