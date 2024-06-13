import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.*;

/**
 * UnoStartUp
 * Uno program runner
 * 
 * @author tba 
 * @since 2024/06/12
 */
public class UnoStartUp
{
    /**
 * mains
 * runs uno game
 * 
 * @author tba 
 */
    public static void main(String[] args)
    {
        UnoModel b = new UnoModel();
        UnoView a = new UnoView(b);
        JFrame test = new JFrame();
        test.setSize(new Dimension(1000, 1000));
        test.setResizable(false);
        test.setContentPane(a);
        test.setVisible(true);

    }
}