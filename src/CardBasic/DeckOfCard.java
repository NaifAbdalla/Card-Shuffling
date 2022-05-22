package CardBasic;

import java.security.SecureRandom;

public class DeckOfCard {
    private static final int NUMBER_OF_CARDS = 52;
    private Card[] deck;
    private static final SecureRandom randomNumber = new SecureRandom();
    private int currentCard;

    public DeckOfCard(){
        deck = new Card[NUMBER_OF_CARDS];
        String[] faces = { "Ace", "Deuce", "Three", "Four", "Five", "Six",
                "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King" };
        String[] suits = { "Hearts", "Diamonds", "Clubs", "Spades" };

        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            deck[i] = new Card(faces[i % 13],suits[i / 13] );
        }
    }

    public void shuffle(){
        int random = randomNumber.nextInt(NUMBER_OF_CARDS);

        currentCard = 0;

        for (int i = 0; i < NUMBER_OF_CARDS; i++) {
            Card temp = deck[i];
            deck[i]= deck[random];
            deck[random] = temp;
        }

    }

    public Card dealCard(){
        if(currentCard<NUMBER_OF_CARDS){
            return deck[currentCard++];
        }
        else return null;
    }

}
