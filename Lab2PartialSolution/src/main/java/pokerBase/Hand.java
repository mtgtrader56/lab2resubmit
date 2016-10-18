package pokerBase;

import java.util.ArrayList;

import pokerEnums.eCardNo;
import pokerEnums.eHandStrength;
import pokerEnums.eRank;
import pokerEnums.eSuit;

public class Hand {
	public static ArrayList<Card> CardsInHand;

	public ArrayList<Card> getCardsInHand() {
		return CardsInHand;
	}

	public static void EvaluateHand(ArrayList<Card> cardhand) {
	}

	public static boolean isHandRoyalFlush(ArrayList<Card> h, HandScore hs) {
		boolean isRoyalFlush = false;
		if (h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
				.get(eCardNo.SecondCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.ThirdCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FourthCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FifthCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteRank() == eRank.ACE
				&& h.get(eCardNo.SecondCard.getCardNo()).geteRank() == eRank.KING
				&& h.get(eCardNo.ThirdCard.getCardNo()).geteRank() == eRank.QUEEN
				&& h.get(eCardNo.FourthCard.getCardNo()).geteRank() == eRank.JACK
				&& h.get(eCardNo.FourthCard.getCardNo()).geteRank() == eRank.TEN) {
			isRoyalFlush = true;
			hs.setHandStrength(eHandStrength.RoyalFlush.getHandStrength());
		}
		return isRoyalFlush;
	}

	public static boolean isHandStraightFlush(ArrayList<Card> h, HandScore hs) {
		boolean isStraightFlush = false;
		if (h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
				.get(eCardNo.SecondCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.ThirdCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FourthCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FifthCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()) == h
						.get(eCardNo.SecondCard.getCardNo() - 1)
				&& h.get(eCardNo.SecondCard.getCardNo()) == h
						.get(eCardNo.ThirdCard.getCardNo() - 1)
				&& h.get(eCardNo.ThirdCard.getCardNo()) == h
						.get(eCardNo.FourthCard.getCardNo() - 1)
				&& h.get(eCardNo.FourthCard.getCardNo()) == h
						.get(eCardNo.FifthCard.getCardNo() - 1)) {
			isStraightFlush = true;
			hs.setHandStrength(eHandStrength.StraightFlush.getHandStrength());
		}
		return isStraightFlush;
	}

	public static boolean isHandFourOfAKind(ArrayList<Card> h, HandScore hs) {

		boolean bHandCheck = false;
		if (h.get(eCardNo.FirstCard.getCardNo()).geteRank() == h
				.get(eCardNo.FourthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);

		} else if (h.get(eCardNo.SecondCard.getCardNo()).geteRank() == h
				.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			bHandCheck = true;
			hs.setHandStrength(eHandStrength.FourOfAKind.getHandStrength());
			hs.setHiHand(h.get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FirstCard.getCardNo()));
			hs.setKickers(kickers);
		}
		System.out.println(bHandCheck);
		return bHandCheck;
	}

	public static boolean isHandFullHouse(ArrayList<Card> h, HandScore hs) {
		boolean isFullHouse = false;
		if (h.get(eCardNo.FirstCard.getCardNo()).geteRank() == h
				.get(eCardNo.ThirdCard.getCardNo()).geteRank()
				&& h.get(eCardNo.FourthCard.getCardNo()).geteRank() == h
						.get(eCardNo.FifthCard.getCardNo()).geteRank()) {
			hs.setHandStrength(eHandStrength.FullHouse.getHandStrength());
			isFullHouse = true;
		}

		return isFullHouse;

	}

	private static boolean isHandFlush(ArrayList<Card> cards) {
		// TODO Implement this method
		boolean bIsFlush = false;
		return bIsFlush;
	}

	public static boolean isHandFlush(ArrayList<Card> h, HandScore hs) {
		boolean bIsFlush = false;
		if (h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
				.get(eCardNo.SecondCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.ThirdCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FourthCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() == h
						.get(eCardNo.FifthCard.getCardNo()).geteSuit()) {
			bIsFlush = true;
			hs.setHandStrength(eHandStrength.Flush.getHandStrength());
		}

		return bIsFlush;
	}

	private static boolean isStraight(ArrayList<Card> cards, Card highCard) {
		boolean bIsStraight = false;

		return bIsStraight;
	}

	public static boolean isHandStraight(ArrayList<Card> h, HandScore hs) {
		boolean bIsStraight = false;
		if (h.get(eCardNo.FirstCard.getCardNo()) == h
				.get(eCardNo.SecondCard.getCardNo() - 1)
				&& h.get(eCardNo.SecondCard.getCardNo()) == h
						.get(eCardNo.ThirdCard.getCardNo() - 1)
				&& h.get(eCardNo.ThirdCard.getCardNo()) == h
						.get(eCardNo.FourthCard.getCardNo() - 1)
				&& h.get(eCardNo.FourthCard.getCardNo()) == h
						.get(eCardNo.FifthCard.getCardNo() - 1)) {
			hs.setHandStrength(eHandStrength.Straight.getHandStrength());
			bIsStraight = true;
		}
		return bIsStraight;
	}

	public static boolean isHandThreeOfAKind(ArrayList<Card> h, HandScore hs) {
		boolean isThreeOfAKind = false;
		if (h.get(eCardNo.FirstCard.getCardNo()) == h
				.get(eCardNo.SecondCard.getCardNo())
				&& h.get(eCardNo.SecondCard.getCardNo()) == h
						.get(eCardNo.ThirdCard.getCardNo())) {
			hs.setHandStrength(eHandStrength.ThreeOfAKind.getHandStrength());
			isThreeOfAKind = true;
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(4);
		}
		return isThreeOfAKind;
	}

	public static boolean isHandTwoPair(ArrayList<Card> h, HandScore hs) {
		boolean isTwoPair = false;
		if (h.get(eCardNo.FirstCard.getCardNo()) == h
				.get(eCardNo.SecondCard.getCardNo())
				&& h.get(eCardNo.ThirdCard.getCardNo()) == h
						.get(eCardNo.FourthCard.getCardNo())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		} else if (h.get(eCardNo.SecondCard.getCardNo()) == h
				.get(eCardNo.ThirdCard.getCardNo())
				&& h.get(eCardNo.FourthCard.getCardNo()) == h
						.get(eCardNo.FifthCard.getCardNo())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FirstCard.getCardNo()));
			hs.setKickers(kickers);
		} else if (h.get(eCardNo.FirstCard.getCardNo()) == h
				.get(eCardNo.SecondCard.getCardNo())
				&& h.get(eCardNo.FourthCard.getCardNo()) == h
						.get(eCardNo.FifthCard.getCardNo())) {
			isTwoPair = true;
			hs.setHandStrength(eHandStrength.TwoPair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.ThirdCard.getCardNo()));
			hs.setKickers(kickers);
		}

		return isTwoPair;
	}

	public static boolean isHandPair(ArrayList<Card> h, HandScore hs) {
		boolean isPair = false;
		if (h.get(eCardNo.FirstCard.getCardNo()) == h
				.get(eCardNo.SecondCard.getCardNo())) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.ThirdCard.getCardNo()));
			kickers.add(h.get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		} else if (h.get(eCardNo.SecondCard.getCardNo()) == h
				.get(eCardNo.ThirdCard.getCardNo())) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.SecondCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		} else if (h.get(eCardNo.ThirdCard.getCardNo()) == h
				.get(eCardNo.FourthCard.getCardNo())) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.ThirdCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.get(eCardNo.SecondCard.getCardNo()));
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		} else if (h.get(eCardNo.FourthCard.getCardNo()) == h
				.get(eCardNo.FifthCard.getCardNo())) {
			isPair = true;
			hs.setHandStrength(eHandStrength.Pair.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FourthCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FirstCard.getCardNo()));
			kickers.add(h.get(eCardNo.SecondCard.getCardNo()));
			kickers.add(h.get(eCardNo.ThirdCard.getCardNo()));
			hs.setKickers(kickers);
		}
		return isPair;
	}

	public static boolean isHandHighCard(ArrayList<Card> h, HandScore hs) {
		boolean isHighCard = false;
		if (h.get(eCardNo.FirstCard.getCardNo()) != h
				.get(eCardNo.SecondCard.getCardNo())
				&& h.get(eCardNo.FirstCard.getCardNo()) != h
						.get(eCardNo.ThirdCard.getCardNo())
				&& h.get(eCardNo.FirstCard.getCardNo()) != h
						.get(eCardNo.FourthCard.getCardNo())
				&& h.get(eCardNo.FirstCard.getCardNo()) != h
						.get(eCardNo.FifthCard.getCardNo())
				&& h.get(eCardNo.FirstCard.getCardNo()).geteSuit() != h
						.get(eCardNo.SecondCard.getCardNo()).geteSuit()
				&& h.get(eCardNo.FirstCard.getCardNo()) != h
						.get(eCardNo.SecondCard.getCardNo() - 1)) {
			isHighCard = true;
			hs.setHandStrength(eHandStrength.HighCard.getHandStrength());
			hs.setHiHand(h.get(eCardNo.FirstCard.getCardNo()).geteRank().getiRankNbr());
			hs.setLoHand(0);
			ArrayList<Card> kickers = new ArrayList<Card>();
			kickers.add(h.get(eCardNo.FourthCard.getCardNo()));
			kickers.add(h.get(eCardNo.SecondCard.getCardNo()));
			kickers.add(h.get(eCardNo.ThirdCard.getCardNo()));
			kickers.add(h.get(eCardNo.FifthCard.getCardNo()));
			hs.setKickers(kickers);
		}
		return isHighCard;
	}
}
