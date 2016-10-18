package pokerBase;

import java.util.ArrayList;
import java.util.Collections;
import pokerEnums.eRank;
import pokerEnums.eSuit;
import pokerEnums.eCardNo;
public class Deck {
	

	private static ArrayList<Card> kickers = new ArrayList<Card>();
	private static ArrayList<Card> deckCards = new ArrayList<Card>(); 
	private static ArrayList<Card> handCards = new ArrayList<Card>();
	public Deck() {   
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				deckCards.add(new Card(eSuit, eRank, iCardNbr++));
				System.out.println(iCardNbr);
			}
		}

		Collections.shuffle(deckCards);
	}
	
	


	public static ArrayList<Card> getCards(){
		return deckCards;
	}

	private static Card Draw(){
		int iCardNbr = 1;
		for (eSuit eSuit : eSuit.values()) {
			for (eRank eRank : eRank.values()) {
				deckCards.add(new Card(eSuit, eRank, iCardNbr++));
			}
		}
		Collections.shuffle(deckCards);
		
		return null;
		
		
	}
}