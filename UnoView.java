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

    private JPanel menu = new JPanel();
    private JPanel gameSelect = new JPanel();
    private JButton startGame = new JButton();
    private JTextArea numberOfRounds = new JTextArea();
    private JTextArea playerName = new JTextArea();
    private JTextField roundInput = new JTextField();
    private JTextField nameInput = new JTextField();
    private JButton playGame = new JButton();

    public UnoView(UnoModel uModel){
        super();
        this.model = uModel;
        this.mainMenu();
        this.registerControllers();
        this.model.setGUI(this);
    }

    public String getPlayerName(){
      return this.nameInput.getText();
    }

    public int getRounds(){
      int number = -1;
      try {
        number = Integer.parseInt(this.roundInput.getText());
      } catch (Exception e) {
        // TODO: handle exception
      }
      return number;
    }

    public void mainMenu(){ //gui temporary for use
      this.setLayout(new BorderLayout());
      this.removeAll();
      this.startGame.setText("Start");
      this.startGame.setPreferredSize(new Dimension(200,100));

      this.setBackground(Color.RED);
      this.menu.add(this.startGame);
      this.add(this.menu,BorderLayout.WEST);
    }

    public void gameSetup(){
      this.numberOfRounds.setText("How many rounds will you play?");
      this.playerName.setText("Please enter your username");
      this.roundInput.setPreferredSize(new Dimension(650,50));
      this.nameInput.setPreferredSize(new Dimension(650,50));
      this.numberOfRounds.setEditable(false);
      this.playerName.setEditable(false);
      this.playGame.setText("Play!");
      this.playGame.setPreferredSize(new Dimension(400,200));

      //gameSelect.setLayout(new BoxLayout(this.gameSelect, BoxLayout.Y_AXIS));
      this.gameSelect.add(numberOfRounds);
      this.gameSelect.add(roundInput);
      this.gameSelect.add(playerName);
      this.gameSelect.add(nameInput);
      this.gameSelect.add(playGame);
      this.add(gameSelect,BorderLayout.CENTER);
      this.refresh();

    }

    public void setHand(){
      for (int x = 0; x<this.model.getCurrentPlayer().getHand().size();x++){
        this.cards.add(new RoundedJPane(50, this.model.getCurrentPlayer().getHand().get(x).getColour()));
      }
    }

    public void displayCards3(){ //another test
        this.removeAll();
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


        this.refresh();
    }

    public void registerControllers()
  {
    //Variable Declaration
    CardSelector setup = new CardSelector(this); //Setup
    MenuListener mSelect = new MenuListener(this.model);
    
    //set listeners
    for (int x = 0; x<cards.size();x++){
        this.cards.get(x).addMouseListener(setup);
    }
    this.addMouseListener(setup);

    this.startGame.addActionListener(mSelect);
    this.playGame.addActionListener(mSelect);
  }
  
  public ArrayList<RoundedJPane> getCards(){
    return this.cards;
  }

  public void update(){
      if (this.model.getMenuSelect()){
        this.removeAll();
        this.gameSetup();
      }
      else if (this.model.getNumberOfRound()>=0){
        this.displayCards3();
      }

      this.refresh();
  }

  public void refresh(){
    this.repaint();
    this.revalidate();
  }
}
