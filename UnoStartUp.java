import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.*;
public class UnoStartUp
{
    public static void main(String[] args)
    {
        UnoModel b = new UnoModel();
        UnoView a = new UnoView(b);
        JFrame test = new JFrame();
        test.setSize(new Dimension(1000, 1000));
        test.setResizable(false);
        test.addKeyListener(new escListener());
        test.setContentPane(a);
        test.setVisible(true);

    }
}