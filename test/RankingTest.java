import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class RankingTest {

    @Test
    public void testStraightFlush() {
        Card card1 = new Card("10", "\u2661", 10);
        Card card2 = new Card("J", "\u2661", 11);
        Card card3 = new Card("Q", "\u2661", 12);
        Card card4 = new Card("K", "\u2661", 13);
        Card card5 = new Card("A", "\u2661", 14);
        ArrayList<Card> testHand = new ArrayList<>();

        testHand.add(card1);
        testHand.add(card2);
        testHand.add(card3);
        testHand.add(card4);
        testHand.add(card5);


        Ranking ranking = new Ranking();

        assertEquals("Straight Flush", ranking.evaluateHand(testHand));
    }

}
