package pokerBase;

import org.junit.Assert.*;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;


public class Hand_Test {
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		

	}
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testRoyalFlush() {
		ArrayList<Card> h = new ArrayList<Card>();
		h.add(new Card(eSuit.HEARTS, eRank.ACE,1));
		h.add(new Card(eSuit.HEARTS, eRank.KING,1));
		h.add(new Card(eSuit.HEARTS, eRank.QUEEN,1));
		h.add(new Card(eSuit.HEARTS, eRank.JACK,1));
		h.add(new Card(eSuit.HEARTS, eRank.TEN,1));
		Collections.sort(h);
		boolean check;
		check = true;
		ArrayList<Card> kickers = new ArrayList<Card>();
		HandScore hs = new HandScore(1,1,1,kickers);
		assertTrue(Hand.isHandRoyalFlush(h,hs) == check);
		assertTrue(hs.getHiHand() == eRank.ACE.getiRankNbr());
		
		
	}

}
