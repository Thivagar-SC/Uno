import javax.swing.*;
import java.awt.*;

public class UnoView extends JPanel
{
    public static void main(String[] args) {
        ImgComponent a = new ImgComponent("2156_uno_block.png");
        JPanel b = new JPanel();
        JFrame c = new JFrame();
        b.setPreferredSize(new Dimension(200,200));
        b.add(a);
        c.setSize(new Dimension(500,900));
        c.setContentPane(b);
        c.setResizable(false);
        c.setVisible(true);
    }

//    public void escInput (int keyCode)
//    {
//        if (keyCode == KeyEvent.VK_ESCAPE)
//        {
//            setPause(pauseMenu.isEnabled());
//        }
//    }
//
//    public void setPause (boolean isPaused)
//    {
//        pauseMenu.setEnabled(isPaused);
//    }
}
