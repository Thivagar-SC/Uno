import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.*;
import java.util.*;

public class UnoView extends JPanel
{
    private static ArrayList<RoundedJPane> cards = new ArrayList <RoundedJPane>();
    RoundedJPane card0;
    RoundedJPane card1 = new RoundedJPane(1);
    RoundedJPane card2 = new RoundedJPane(1);
    RoundedJPane card3 = new RoundedJPane(1);
    RoundedJPane card4 = new RoundedJPane(1);


    ImgComponent placeholder;
    ImgComponent placeholder2;
    ImgComponent placeholder3;
    ImgComponent placeholder4;
    ImgComponent placeholder5;

    public UnoView(){
        super();
    }


    public void displayCards2(){ //testing
        this.setLayout(null);
        JPanel test = new JPanel();
        test.setBackground(Color.RED);
        test.setBounds(100,100,200,200);
        this.add(new JButton());
        this.repaint();
        this.revalidate();
        System.out.println("esig");
    }

    public void displayCards3(){ //another test
        this.setLayout(null);

        this.card0 = new RoundedJPane(1);
        this.card0.setBounds(100,100,211,336);
        this.card1.setBounds(120,100,211,336);
        this.card2.setBounds(140,100,211,336);
        this.card3.setBounds(160,100,211,336);
        this.card4.setBounds(180,100,211,336);
        this.placeholder = new ImgComponent("UNO_TransparrentTest.png");

        this.card0.add(this.placeholder);
        this.placeholder.setBounds(0, 0,200,300);
        this.placeholder2 = new ImgComponent("UNO_TransparrentTest.png");
        this.card1.add(this.placeholder2);
        this.placeholder2.setBounds(0, 0,200,300);
        this.placeholder3 = new ImgComponent("UNO_TransparrentTest.png");
        this.card2.add(this.placeholder3);
        this.placeholder3.setBounds(0, 0,200,300);
        this.placeholder4 = new ImgComponent("UNO_TransparrentTest.png");
        this.card3.add(this.placeholder4);
        this.placeholder4.setBounds(0, 0,200,300);
        this.placeholder5 = new ImgComponent("UNO_TransparrentTest.png");
        this.card4.add(this.placeholder5);
        this.placeholder5.setBounds(0, 0,200,300);

        

        //JFrame tester = new JFrame();
        //tester.setLayout(null);
        //JPanel plan = new JPanel();
        //tester.add(this.card);
        //tester.setSize(new Dimension(1000,1000));

        //tester.setVisible(true);
        
        //this.test = new JButton();
        //this.test.setBounds(100,50,50,50);
        //this.add(this.test);
        //this.add(tester);
        this.add(this.card0);
        this.add(this.card1);
        this.add(this.card2);
        this.add(this.card3);
        this.add(this.card4);


        this.repaint();
        this.revalidate();
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
    }

    public static void main(String[] args) { //temporary
        
    }
}
