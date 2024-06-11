import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;

import java.awt.*;
import java.util.*;

public class UnoView extends JPanel
{
    private UnoModel model;
    private ArrayList<RoundedJPane> cards = new ArrayList <RoundedJPane>();
    RoundedJPane card0;
    RoundedJPane card1 = new RoundedJPane(50,2);
    RoundedJPane card2 = new RoundedJPane(50,4);
    RoundedJPane card3 = new RoundedJPane(50,0);
    RoundedJPane card4 = new RoundedJPane(50,1);

    ImgComponent placeholder;
    ImgComponent placeholder2;
    ImgComponent placeholder3;
    ImgComponent placeholder4;
    ImgComponent placeholder5;

    private JPanel menu;
    private JPanel gameSelect;
    private JButton startGame;
    private JTextArea numberOfRounds;
    private JTextArea playerName;

    public UnoView(UnoModel uModel){
        super();
        this.model = uModel;
        this.displayCards3();
        this.registerControllers();
    }

    public void mainMenu(){
      this.removeAll();
      
    }

    public void setHand(){
      for (int x = 0; x<this.model.getCurrentPlayer().getHand().size();x++){
        this.cards.add(new RoundedJPane(50, this.model.getCurrentPlayer().getHand().get(x).getColour()));
      }
    }

    public void displayCards3(){ //another test
        this.setLayout(null);

        this.card0 = new RoundedJPane(50,3);
        this.card0.setBounds(100,100,211,336);
        this.card1.setBounds(150,100,211,336);
        this.card2.setBounds(200,100,211,336);
        this.card3.setBounds(250,100,211,336);
        this.card4.setBounds(300,100,211,336);
        this.placeholder = new ImgComponent("UNO_TransparrentTest.png");

        this.card0.add(this.placeholder);
        this.placeholder.setBounds(0, 0,211,336);
        this.placeholder2 = new ImgComponent("UNO_TransparrentTest.png");
        this.card1.add(this.placeholder2);
        this.placeholder2.setBounds(0, 0,211,336);
        this.placeholder3 = new ImgComponent("UNO_TransparrentTest.png");
        this.card2.add(this.placeholder3);
        this.placeholder3.setBounds(0, 0,211,336);
        this.placeholder4 = new ImgComponent("UNO_TransparrentTest.png");
        this.card3.add(this.placeholder4);
        this.placeholder4.setBounds(0, 0,211,336);
        this.placeholder5 = new ImgComponent("UNO_TransparrentTest.png");
        this.card4.add(this.placeholder5);
        this.placeholder5.setBounds(0, 0,211,336);

        cards.add(card0);
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);

        this.add(this.card0);
        this.add(this.card1);
        this.add(this.card2);
        this.add(this.card3);
        this.add(this.card4);


        this.repaint();
        this.revalidate();
    }

    public void registerControllers()
  {
    //Variable Declaration
    CardSelector setup = new CardSelector(this); //Setup
    
    //set listeners
    for (int x = 0; x<cards.size();x++){
        this.cards.get(x).addMouseListener(setup);
    }
    this.addMouseListener(setup);

  }
  
  public ArrayList<RoundedJPane> getCards(){
    return this.cards;
  }


}
