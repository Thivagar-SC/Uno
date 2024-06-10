import java.util.ArrayList;
import java.util.*;

public class Player {
    private String playerName; // name of the player
    private boolean wonRound; // if player won or not
    private int totalScore; // score of player
    private int playerNumber; // value of player (determines order)
    private ArrayList<Card> cards;
    private String source; 
    private boolean selectable;

    public Player(int playerNumber, String playerName) {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        this.wonRound = false;
        this.totalScore = 0;
        this.selectable = false;
        
    }

    public void addCard(Card card, String source) {
        
        cards.add(card);
        this.source = source;
    }

    public void placeCard(int cardIndex) {
        cards.remove(cardIndex);
    }

    public void setSelectable() {
        this.selectable = !this.selectable;
    }
    public boolean setGetSelectable(){
        return setGetSelectable();
    }

    public ArrayList<Card> getHand() {
        return cards;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setWon() {
        this.wonRound = true;
    }

    public int getTotalScore() {
        return totalScore;
    }

    public void organizeDeck() {
        int minIndex;
        for (int x = 0; x < cards.size(); x++) {
             minIndex = x;
             for (int y = x + 1; y < cards.size(); y++){
                
             }

    }
}
}