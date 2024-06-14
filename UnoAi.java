import java.util.ArrayList;

/**
 * UnoAi
 * object represent ai player vs in game
 * 
 * @author Avaneesh
 * @since 2024/06/12
 */
public class UnoAi {
    private double delayTime; // delays the time of the AI's actions
    private ArrayList<Card> cards; // list of cards ai has
    private boolean wonRound; // ai won the game
    private int playerNumber; // value for player order

    // I aint commenting this yet
    public UnoAi(int playerNumber) {
        this.playerNumber = playerNumber;
        this.wonRound = false;
        this.cards = new ArrayList<Card>();
    }

    public void placeCard(int cardIndex) {
        
    }

    public void hitUNO() {

    }

    public void hitBlock() {

    }

    public void addCard(Card card, String source) {

    }

}
