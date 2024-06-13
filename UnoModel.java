import java.awt.event.KeyEvent;
import java.util.List;
import java.io.*;

/**
 * This class represents the model of the Uno game.
 * It manages the game state, players, deck, and game logic.
 */
public class UnoModel {
    private UnoView view;
    private Card currentlyPlacedCard;
    private String gameState;
    private int turn;
    private Player player;
    private UnoAi ai;
    private Deck deck;
    private boolean safe;
    private int numberOfRounds;
    private List<Card> recentCards;
    private List<Card> cardsInHand;
    private List<Integer> points;
    private List<String> winners;
    private List<Player> players;
    private BufferedReader input;
    private PrintWriter output;
    private int direction = 1;
    // GUI variables
    private boolean menuSelection;

    /**
     * Constructor for UnoModel.
     */
    public UnoModel() {
        super();
    }

    /**
     * Moves to the next turn.
     * 
     * @param skip number of players to skip.
     */
    public void nextTurn(int skip) // Avaneesh
    {
        turn = (turn + skip * direction);
    }

    /**
     * Checks if the current round is over.
     */
    public void checkIfRoundIsOver() {
        for (Player player : players) {
            if (player.getHand().isEmpty()) {
                int totalScore = 0;
                player.setWon();
            }
        }
    }

    /**
     * Places a card from a player's hand.
     * 
     * @param cardIndex index of the card in the player's hand.
     * @param playerID  ID of the player placing the card.
     */
    public void placeCard(int cardIndex, int playerID) // Avaneesh
    {
        Player currentPlayer = players.get(playerID);
        Card cardToPlace = player.getHand().get(cardIndex);
        if (cardToPlace.getColour() == currentlyPlacedCard.getColour()
                || cardToPlace.getValue() == currentlyPlacedCard.getValue()) {
            currentPlayer.getHand().remove(cardIndex);
            currentlyPlacedCard = cardToPlace;
            if (cardToPlace.getValue() == 10) {
                direction *= -1;
                nextTurn(1);
            } else if (cardToPlace.getValue() == 11) {
                // will do tonight brain not proceesing rn
            } else if (cardToPlace.getValue() == 12) {
                nextTurn(2);

            }
        }
        if (cardToPlace.getValue() == 13) {
        }
        if (cardToPlace.getValue() == 14) {
        }

    }

    /**
     * Returns the current player.
     * 
     * @return the current player.
     */
    public Player getCurrentPlayer() {
        return player;
    }

    /**
     * Sets the pause state of the game.
     * 
     * @param isPaused true if the game is paused, false otherwise.
     */
    public void setPauseState(boolean isPaused)
    {

    }

    /**
     * Quits the game.
     */
    public void quitGame()
    {
        System.exit(0);
    }

    /**
     * Handles input for the ESC key.
     * 
     * @param keyCode - the key code of the pressed key.
     */
    public void inputForESC(int keyCode) {
        if (keyCode == KeyEvent.VK_ESCAPE)
        {
            System.out.println("Esc is pressed");
            setPauseState(true);
        }

    }

    /**
     * Changes the color of the next card to be played.
     * 
     * @param colour - the new color.
     */
    public void changeColour(int colour) // Avaneesh
    {
        currentlyPlacedCard.changeColour(colour);
    }

    /**
     * Returns the current colour of the next card to be played.
     * 
     * @return the current colour.
     */
    public int getCurrentColour() {
        return 0; // placeholder
    }

    /**
     * Sets the UNO state for the current player.
     */
    public void setUNOState() {

    }

    /**
     * Checks if the current player is safe.
     * 
     * @return - true if the player is safe, false otherwise.
     */
    public boolean isSafe() {
        return true; // placeholder
    }

    /**
     * Starts the game.
     */
    public void startGame() {
        int numberRounds;
        String nameOfPlayer;
        this.menuSelection = false;
        nameOfPlayer = this.view.getPlayerName();
        numberRounds = this.view.getRounds();
        if (numberRounds > 0) {
            this.numberOfRounds = numberRounds;
            player = new Player(4, nameOfPlayer); // player number temporary
            this.deck = new Deck();
            for (int x = 1; x <= 7; x++) {
                this.player.addCard(this.deck.drawCard(), "TBA");
            }
        } else {
            this.numberOfRounds = -1;
        }

        this.view.update();
    }

    public void raiseCard(Object card) {
        this.view.raiseCard(card);
    }

    public void dropCard(Object card) {
        this.view.dropCard(card);
    }

    // ta=ba
    public int getNumberOfRound() {
        return this.numberOfRounds;
    }

    /**
     * Starts game startup
     */
    public void startSelection() {
        this.menuSelection = true;
        this.view.update();
    }

    // tba
    public boolean getMenuSelect() {
        return this.menuSelection;
    }

    /**
     * Moves to the next round.
     */
    public void nextRound() {

    }

    /**
     * Ends the game.
     */
    public void endGame() {

    }

    /**
     * Checks if a card is legal to play.
     * 
     * @param card - the card to check.
     * @return - true if the card is legal, false otherwise.
     */
    public boolean isLegal(Card card) {
        return true; // placeholder
    }

    public void setGUI(UnoView gui) {
        this.view = gui;
    }

    public void drawCard() {
        this.player.addCard(this.deck.drawCard(), "TBA");
        this.view.update();
    }
}
