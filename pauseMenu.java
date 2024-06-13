import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class pauseMenu extends JPanel
{
    UnoModel model;
    UnoView view;
    private String pausedMessage = "PAUSED";
    private boolean isPaused;
    private JButton resumeButton;
    private JButton quitToMainMenuButton;
    private JButton quitGameButon;
    private JPanel buttons;

    public pauseMenu()
    {
        super();
        isPaused = true;
        this.setVisible(false);
        this.setPreferredSize(new Dimension(100,100));
        this.setLayout(new GridLayout(3,1));

        resumeButton = new JButton("Resume");
        quitToMainMenuButton = new JButton("Return to Main Menu");
        quitGameButon = new JButton("Quit Game");

        this.add(resumeButton);
        this.add(quitToMainMenuButton);
        this.add(quitGameButon);
    }

    public void update()
    {
    }

}
