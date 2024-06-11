import java.awt.Dimension;

import javax.swing.*;
import java.awt.event.*;
public class UnoStartUp
{
    UnoModel model = new UnoModel();

    public static void main(String[] args)
    {

        UnoView a = new UnoView();
        JFrame test = new JFrame();
        test.setSize(new Dimension(1000, 1000));

        test.setContentPane(a);
        test.setVisible(true);

    }
}