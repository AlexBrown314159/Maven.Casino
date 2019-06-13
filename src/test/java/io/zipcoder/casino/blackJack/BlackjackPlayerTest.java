package io.zipcoder.casino.blackJack;

import io.zipcoder.casino.Card;
import io.zipcoder.casino.CardValue;
import io.zipcoder.casino.Hand;
import io.zipcoder.casino.Player;
import org.junit.Test;

import java.util.ArrayList;

import static io.zipcoder.casino.CardSuit.HEART;
import static io.zipcoder.casino.CardSuit.SPADE;
import static org.junit.Assert.*;
import static org.junit.Assert.*;

public class BlackjackPlayerTest {



    @Test
    public void BlackJackPlayerConstructorTest(){
        Player player1 = new Player(500, "Charles");
        BlackjackPlayer bjPlayer = new BlackjackPlayer(player1);

        String expected = "Charles";

        assertEquals(expected, bjPlayer.getName());


    }


    @Test
    public void BlackJackPlayerDealerConstructor(){
        BlackjackPlayer bjPlayer = new BlackjackPlayer();
        String expectedName = "Dealer";
        Integer expectedWallet = 0;
        ArrayList<Card> hand = bjPlayer.getHand();

        assertEquals(expectedWallet, bjPlayer.getMoney());
        assertEquals(expectedName, bjPlayer.getName());
        assertTrue(hand.isEmpty());
    }






    @Test
    public void discardHandTest() {
        Card kHearts = new Card(HEART, CardValue.KING);
        Card jSpades = new Card(SPADE, CardValue.JACK);
        Player player1 = new Player();
        BlackjackPlayer player = new BlackjackPlayer(player1);
        player.hit(kHearts);
        player.hit(jSpades);

        ArrayList<Card> myHand = player.getHand();

        assertFalse(myHand.isEmpty());

        player.discardHand();

        assertTrue(myHand.isEmpty());


    }

    @Test
    public void hit() {
    }

    @Test
    public void newSplitHand() {
    }

    @Test
    public void getHandValue() {
    }

    @Test
    public void bet() {
    }

    @Test
    public void getHand() {
    }
}