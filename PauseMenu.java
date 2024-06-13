import javax.swing.*;
import java.awt.*;

public class PauseMenu extends JPanel
{
    UnoModel model;
    UnoView view;
    private String pausedMessage = "PAUSED";

    private JButton resumeButton;
    private JButton quitToMainMenuButton;
    private JButton quitGameButon;
    private JPanel buttons;

    public PauseMenu(UnoModel model)
    {
        super();
        this.model = model;
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
