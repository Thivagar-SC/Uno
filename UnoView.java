import javax.swing.*;
import java.awt.*;
import java.util.*;

public class UnoView extends JPanel
{
    private UnoModel model;
    private ArrayList<RoundedJPane> cards = new ArrayList <RoundedJPane>();

    private JPanel menu = new JPanel();
    private JPanel gameSelect = new JPanel();
    private JButton startGame = new JButton();
    private JTextArea numberOfRounds = new JTextArea();
    private JTextArea playerName = new JTextArea();
    private JTextField roundInput = new JTextField();
    private JTextField nameInput = new JTextField();
    private JButton playGame = new JButton();
    private RoundedJPane deck;

    public UnoView(UnoModel uModel){
        super();
        this.model = uModel;
        this.mainMenu();
        this.registerControllers();
        this.model.setGUI(this);
        this.deck = new RoundedJPane(50, 4);
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

      this.setBackground(Color.LIGHT_GRAY);
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
      this.cards.clear();
      for (int x = 0; x<this.model.getCurrentPlayer().getHand().size();x++){
        this.cards.add(new RoundedJPane(60, this.model.getCurrentPlayer().getHand().get(x).getColour()));
      }
    }

    public void displayDeck(){
        ImgComponent img = new ImgComponent("_HiddenCard.png");
        this.deck.setBounds(50,100,211,336);
        img.setBounds(0,0,211,336);
        this.deck.add(img);
        this.add(deck);
    }

    public void displayCards3(){ //another test
      this.setHand();
      this.removeAll();
      this.setLayout(null);

        ImgComponent img;
        for (int x = 0; x< this.model.getCurrentPlayer().getHand().size();x++){
          Card currentCard = this.model.getCurrentPlayer().getHand().get(x);
          this.cards.get(x).setBounds(50+50*x,500,211,336);
          img = new ImgComponent(currentCard.getValue()+".png".trim());
          img.setBounds(0,0,211,336);
          this.cards.get(x).add(img);
          this.add(cards.get(x));
        }

        this.registerControllers();
        this.refresh();
    }

    public void registerControllers()
  {
    //Variable Declaration
    CardSelector setup = new CardSelector(this.model); //Setup
    MenuListener mSelect = new MenuListener(this.model);
    
    //set listeners
    if (this.model.getNumberOfRound()>0){
    for (int x = 0; x<cards.size();x++){
        this.cards.get(x).addMouseListener(setup);
    }
  }

    this.startGame.addActionListener(mSelect);
    this.playGame.addActionListener(mSelect);
  }
  
  public ArrayList<RoundedJPane> getCards(){
    return this.cards;
  }

  public void raiseCard(Object aCard){
    for (int x = 0; x<this.cards.size();x++){
      if (this.cards.get(x).equals(aCard)){
        this.cards.get(x).setBounds(this.cards.get(x).getX(),440,211,336);
      }
    }
    this.refresh();
  }

  public void dropCard(Object aCard){
    for (int x = 0; x<this.cards.size();x++){
      if (this.cards.get(x).equals(aCard)){
        this.cards.get(x).setBounds(this.cards.get(x).getX(),500,211,336);
      }
    }
    this.refresh();
  }

  public void update(){
      if (this.model.getMenuSelect()){
        this.removeAll();
        this.gameSetup();
      }
      else if (this.model.getNumberOfRound()>=0){
        this.displayCards3();
        this.displayDeck();
      }
      else if (this.model.getNumberOfRound()<0){
        this.roundInput.setText("Input a valid number");
      }
      System.out.println(this.model.getNumberOfRound());

      this.refresh();
  }

  public void refresh(){
    this.repaint();
    this.revalidate();
  }
}
