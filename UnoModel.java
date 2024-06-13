import java.awt.event.KeyEvent;
import java.util.List;
import java.io.*;

/**
 * UnoModel
 * This class represents the model of the Uno game.
 * It manages the game state, players, deck, and game logic.
 * 
 * @author Tanner, Avaneesh, Thivagar
 * @since 2024/06/12
 */
public class UnoModel {
    private UnoView view; // game view
    private Card currentlyPlacedCard; // card in play
    private String gameState; // state of game
    private int turn; // current players turn
    private Player player; // user of game
    private UnoAi ai; // ai player is playing (should become array?)
    private Deck deck; // deck of cards
    private boolean safe; // if player is safe after saying UNO
    private int numberOfRounds; // number of rounds player wants to play
    private List<Card> recentCards; // ???
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
     * UnoModel
     * UnoModel Constructor
     * 
     * @author tba
     */
    public UnoModel() {
        super();
    }

    /**
     * nextTurn
     * Moves to the next turn.
     * 
     * @author tba
     * @param skip number of players to skip.
     */
    public void nextTurn(int skip) // Avaneesh
    {
        turn = (turn + skip * direction);
    }

    /**
     * checkIfRoundIsOver
     * Checks if the current round is over.
     * 
     * @author tba
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
     * placeCard
     * Places a card from a player's hand.
     * 
     * @author tba
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
     * getCurrentPlayer
     * Returns the current player.
     * 
     * @author tba
     * @return the current player.
     */
    public Player getCurrentPlayer() {
        return player;
    }

    /**
     * setPauseState
     * Sets the pause state of the game.
     * 
     * @author tba
     * @param isPaused true if the game is paused, false otherwise.
     */
    public void setPauseState(boolean isPaused) {

    }

    /**
     * quitGame
     * Quits the game
     * 
     * @author tba
     */
    public void quitGame() {
        System.exit(0);
    }

    /**
     * inputForESC
     * Handles input for the ESC key.
     * 
     * @author tba
     * @param keyCode - the key code of the pressed key.
     */
    public void inputForESC(int keyCode) {
        if (keyCode == KeyEvent.VK_ESCAPE) {
            System.out.println("Esc is pressed");
            setPauseState(true);
        }

    }

    /**
     * changeColour
     * Changes the color of the next card to be played.
     * 
     * @author tba
     * @param colour - the new color.
     */
    public void changeColour(int colour) // Avaneesh
    {
        currentlyPlacedCard.changeColour(colour);
    }

    /**
     * getCurrentColour
     * Returns the current colour of the next card to be played.
     * 
     * @author tba
     * @return the current colour.
     */
    public int getCurrentColour() {
        return 0; // placeholder
    }

    /**
     * setUNOState
     * Sets the UNO state for the current player.
     * 
     * @author tba
     */
    public void setUNOState() {

    }

    /**
     * isSafe
     * Checks if the current player is safe.
     * 
     * @author tba
     * @return - true if the player is safe, false otherwise.
     */
    public boolean isSafe() {
        return true; // placeholder
    }

    /**
     * startGame
     * Starts the game.
     * 
     * @author Thivagar
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

    /**
     * raiseCard
     * raises selected users card
     * 
     * @author Thivagar
     */
    public void raiseCard(Object card) {
        this.view.raiseCard(card);
    }

    /**
     * dropCard
     * lowers selected users card
     * 
     * @author Thivagar
     */
    public void dropCard(Object card) {
        this.view.dropCard(card);
    }

    /**
     * getNumberOfRound
     * returns number of rounds
     * 
     * @author tba
     * @return numberOfRounds
     */
    public int getNumberOfRound() {
        return this.numberOfRounds;
    }

    /**
     * startSelection
     * Starts game startup
     * 
     * @author
     */
    public void startSelection() {
        this.menuSelection = true;
        this.view.update();
    }

    /**
     * getMenuSelect
     * tba
     * 
     * @author tba
     */
    public boolean getMenuSelect() {
        return this.menuSelection;
    }

    /**
     * nextRound
     * Moves to the next round.
     * 
     * @author tba
     */
    public void nextRound() {

    }

    /**
     * endGame
     * Ends the game.
     * 
     * @author tba
     */
    public void endGame() {

    }

    /**
     * isLegal
     * Checks if a card is legal to play.
     * 
     * @author tba
     * @param card - the card to check.
     * @return - true if the card is legal, false otherwise.
     */
    public boolean isLegal(Card card) {
        return true; // placeholder
    }

    /**
     * setGUI
     * provides model access to gui
     * 
     * @author Thivagar
     */
    public void setGUI(UnoView gui) {
        this.view = gui;
    }

    /**
     * drawCard
     * makes user draw a card
     * 
     * @author Thivagar
     */
    public void drawCard() {
        this.player.addCard(this.deck.drawCard(), "TBA");
        this.view.update();
    }
}
