import javax.swing.*;
import java.awt.event.KeyEvent;

public class UnoView extends JPanel
{
    public void escInput (int keyCode)
    {
        if (keyCode == KeyEvent.VK_ESCAPE)
        {
            setPause(pauseMenu.isEnabled());
        }
    }

    public void setPause (boolean isPaused)
    {
        pauseMenu.setEnabled(isPaused);
    }
}
