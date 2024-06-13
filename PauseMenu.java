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
public class PauseMenu extends JPanel {

    private String pausedMessage = "PAUSED"; // Message displayed to user
    private boolean isPaused; // if game is paused

    public JButton resumeButton; // Interactable buttons
    public JButton quitToMainMenuButton;
    public JButton quitGameButon;
    private JPanel pauseMenuBackground; // Background for pause menu
    private JPanel buttons;

    /**
     * pauseMenu
     * pauseMenu Constructor
     * 
     * @author tba
     */
    public PauseMenu() {
        super();
        isPaused = false;
        this.setVisible(this.isPaused);
        this.setPreferredSize(new Dimension(1000, 1000));
//        this.setLayout(new GridLayout(3, 1));

        // setting text
        resumeButton = new JButton("Resume");
        quitToMainMenuButton = new JButton("Return to Main Menu");
        quitGameButon = new JButton("Quit Game");

        // OUTPUT
        this.add(resumeButton);
        this.add(quitToMainMenuButton);
        this.add(quitGameButon);
    }

    public void setVisibility(){
        this.isPaused = !this.isPaused;
        this.setVisible(this.isPaused);
    }


    public void update() {
    }

    public boolean isPaused(){
        return this.isPaused;
    }

    @Override
    public void paintComponent(Graphics g)
    {
        g.setColor(new Color(144, 143, 143, 204));
        g.fillRect(0, 0, 1000, 1000);
    }
}
