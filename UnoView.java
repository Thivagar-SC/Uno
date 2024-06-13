import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseListener; //recode later if time so this is unneeded
import java.util.*;

/**
 * UnoView
 * View displaying game
 * 
 * @author Thivagar Kesavan
 * @since 2024/06/12
 */
public class UnoView extends JPanel {
  private UnoModel model; //model of game
  private ArrayList<RoundedJPane> cards = new ArrayList<RoundedJPane>();  //display of users cards

  //components for gui
  private JPanel menu = new JPanel();
  private JPanel gameSelect = new JPanel();
  private JButton startGame = new JButton();
  private JTextArea numberOfRounds = new JTextArea();
  private JTextArea playerName = new JTextArea();
  private JTextField roundInput = new JTextField();
  private JTextField nameInput = new JTextField();
  private JButton playGame = new JButton();
  private RoundedJPane deck;
  private RoundedJPane currentCard;

  /**
     * UnoView
     * UnoView Constructor
     * 
     * @author Thivagar
     * @param uModel - model of game
     */
  public UnoView(UnoModel uModel) {
    super();
    this.model = uModel;
    this.mainMenu();
    this.registerControllers();
    this.model.setGUI(this);
    this.deck = new RoundedJPane(50, 4);
  }

  /**
     * getPlayerName
     * returns players username
     * 
     * TO be moved to model in due time
     */
  public String getPlayerName() {
    return this.nameInput.getText();
  }

  //To be moved to model l8r
  public int getRounds() {
    int number = -1;
    try {
      number = Integer.parseInt(this.roundInput.getText());
    } catch (Exception e) {
      // TODO: handle exception
    }
    return number;
  }

  /**mainMenu
   * Opening display of uno game
   * @author Thivagar
   */
  public void mainMenu() { // gui temporary for use
    this.setLayout(new BorderLayout());
    this.removeAll();
    this.startGame.setText("Start");
    this.startGame.setPreferredSize(new Dimension(200, 100));

    this.setBackground(Color.LIGHT_GRAY);
    this.menu.add(this.startGame);
    this.add(this.menu, BorderLayout.WEST);
  }

  /**gameSetup
   * Display game setup of uno (rounds etc)
   * @author Thivagar
   */
  public void gameSetup() {
    this.numberOfRounds.setText("How many rounds will you play?");
    this.playerName.setText("Please enter your username");
    this.roundInput.setPreferredSize(new Dimension(650, 50));
    this.nameInput.setPreferredSize(new Dimension(650, 50));
    this.numberOfRounds.setEditable(false);
    this.playerName.setEditable(false);
    this.playGame.setText("Play!");
    this.playGame.setPreferredSize(new Dimension(400, 200));

    //adding
    this.gameSelect.add(numberOfRounds);
    this.gameSelect.add(roundInput);
    this.gameSelect.add(playerName);
    this.gameSelect.add(nameInput);
    this.gameSelect.add(playGame);
    this.add(gameSelect, BorderLayout.CENTER);
    this.refresh();

  }

  /**setHand
   * adding new cards to show
   * @author Thivagar
   */
  public void setHand() {
    this.cards.clear(); //reset cards as order of cards may change from sorting
    for (int x = 0; x < this.model.getCurrentPlayer().getHand().size(); x++) {  //for each card player has
      this.cards.add(new RoundedJPane(60, this.model.getCurrentPlayer().getHand().get(x).getColour()));
    }
  }

  /**displayDeck
   * displays deck of cards
   * @author Thivagar
   */
  public void displayDeck() {
    ImgComponent img = new ImgComponent("_HiddenCard.png");
    this.deck.setBounds(50, 100, 211, 336);
    img.setBounds(0, 0, 211, 336);
    this.deck.add(img);
    this.add(deck);
  }

  /**displayCurrentCard
   * displays card in play
   * @author Thivagar
   */
  public void displayCurrentCard(){
      //this.currentCard = this.model.get
  }

  /**displayCards
   * displays cards of user
   * @author Thivagar
   */
  public void displayCards() { 
    this.setHand();
    this.removeAll();
    this.setLayout(null);

    ImgComponent img;
    for (int x = 0; x < this.model.getCurrentPlayer().getHand().size(); x++) {  //for each card
      Card currentCard = this.model.getCurrentPlayer().getHand().get(x);
      this.cards.get(x).setBounds(((this.getWidth()-200)/(this.model.getCurrentPlayer().getHand().size()+1)*x)+20, 500, 211, 336);
      img = new ImgComponent(currentCard.getValue() + ".png".trim());
      img.setBounds(0, 0, 211, 336);
      this.cards.get(x).add(img);
      this.add(cards.get(x));
    }

    this.registerControllers(); //new card also needs to be clickable
    this.refresh();
  }

  /**registerControllers
   * register available user actions
   * @author Thivagar
   */
  public void registerControllers() {
    // Variable Declaration
    CardSelector setup = new CardSelector(this.model); // Setup
    MenuListener mSelect = new MenuListener(this.model);
    deckListener addCard = new deckListener(this.model);

    // set listeners

    if (this.model.getNumberOfRound() > 0) {  //if rounds have been chosen
      for (MouseListener listener : this.deck.getMouseListeners()) {  //remove prior listeners
        this.deck.removeMouseListener(listener);
      } //SHOULD CHANGE LATER 

      for (int x = 0; x < cards.size(); x++) {  //for each card
        for (MouseListener listener : this.cards.get(x).getMouseListeners()) { //remove prior listeners
          this.deck.removeMouseListener(listener);
        }
        this.cards.get(x).addMouseListener(setup);
      }
      this.deck.addMouseListener(addCard);
    }

    this.startGame.addActionListener(mSelect);//tba
    this.playGame.addActionListener(mSelect);
  }

  /**getCards
   * returns all the card visuals
   * @author Thivagar
   */
  public ArrayList<RoundedJPane> getCards() {
    return this.cards;
  }

  /**raiseCard
   * raises selected card
   * @author Thivagar
   */
  public void raiseCard(Object aCard) {
    for (int x = 0; x < this.cards.size(); x++) {
      if (this.cards.get(x).equals(aCard)) {
        this.cards.get(x).setBounds(this.cards.get(x).getX(), 440, 211, 336);
      }
    }
    this.refresh();
  }

  /**dropCard
   * lowers selected card
   * @author Thivagar
   */
  public void dropCard(Object aCard) {
    for (int x = 0; x < this.cards.size(); x++) {
      if (this.cards.get(x).equals(aCard)) {
        this.cards.get(x).setBounds(this.cards.get(x).getX(), 500, 211, 336);
      }
    }
    this.refresh();
  }

  /**update
   * updates gui based on changes
   * @author Thivagar
   */
  public void update() {
    if (this.model.getMenuSelect()) {
      this.removeAll();
      this.gameSetup();
    } else if (this.model.getNumberOfRound() >= 0) {
      this.displayCards();
      this.displayDeck();
    } else if (this.model.getNumberOfRound() < 0) {
      this.roundInput.setText("Input a valid number");
    }
    this.refresh();
  }

  /**refresh
   * updates gui to show new changes
   * @author Thivagar
   */
  public void refresh() {
    this.repaint();
    this.revalidate();
  }
}
