import java.awt.Dimension;

import javax.swing.*;

public class UnoStartUp{
    //drgnjhgd
    //HI MY NAME IS AVANEESH
    public static void main(String[] args)
    {

        UnoView a = new UnoView();
        JFrame test = new JFrame();
        test.setSize(new Dimension(1000,1000));
        a.displayCards3();
        test.setContentPane(a);
        test.setVisible(true);

    }
}