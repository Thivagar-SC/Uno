import javax.swing.*;
import java.awt.*;
import java.util.*;

public class UnoView extends JPanel
{
    private static ArrayList<JLayeredPane> cards = new ArrayList <JLayeredPane>();

    public UnoView(){
        super();
    }


    public void displayCards(){
        ImgComponent a = new ImgComponent("2156_uno_block.png");
        JPanel b = new JPanel();
        JLayeredPane test = new JLayeredPane();
        this.setLayout(null);
        b.setPreferredSize(new Dimension(400,400));
        this.setSize(new Dimension(500,900));
        test.setBounds(100,100,300,400);

        //test.setBackground(Color.RED);
        //b.setBackground(Color.RED);

        a.setBounds(100, 100,200,300);
        test.add(a);
        b.add(test);

        //for (int x = 0; x<1;x++){
            //cards.add(new JLayeredPane());
            //cards.get(x).setBounds(10+x*10,10,100,100);
            //b.add(cards.get(x));
            //cards.get(x).add(new JButton());
            //cards.get(x).add(a);
        //}

        this.setVisible(true);
    }

    public static void main(String[] args) { //temporary
        
    }
}
