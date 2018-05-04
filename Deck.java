import java.util.ArrayList;
import java.util.Random;

public class Deck {

	public ArrayList<Card> cards;
	
	
	public Deck () {
		this.cards = new ArrayList<Card>();
	}
	public void createFullDeck() {
		for (cardSuit suit : cardSuit.values()) {
			for (Value value : Value.values()) {
				this.cards.add(new Card(suit,value));
			}
				
		}
	}
	public String toString(){
		String cardList = "";
		int i=0;
		for (Card aCard : this.cards) {
			cardList += "\n"+ aCard.toString();
			;
		}
		return cardList;
	}
	public void shuffleDeck() {
		ArrayList<Card> shuffledDeck = new  ArrayList<Card>();
		Random random = new Random();
		int rand = 0;
		int size = this.cards.size(); 
		for (int i=0; i< size; i++) {
			rand = random.nextInt((this.cards.size() - 1)+1);
		shuffledDeck.add(this.cards.get(rand));
		this.cards.remove(rand);
		
		}
		this.cards = shuffledDeck;
	}
	public void removeCard(int i ) {
		this.cards.remove(i);
	}
	
	public Card getCard(int i ) {
		return this.cards.get(i);
	}
	public void addCard(Card addCard) {
		this.cards.add(addCard);
	}
	
	public void draw(Deck a) {
		this.cards.add(a.getCard(0));
		a.removeCard(0);
		
		
	}
	public int cardVal() {
		int tot= 0;
		int aces = 0;
		
		for(Card aCard : this.cards) {
			switch (aCard.getValue()){
			case Two: tot += 2; break;
			case Three : tot += 3; break;
			case Four : tot += 4; break;
			case Five : tot += 5; break;
			case Six : tot += 6; break;
			case Seven : tot += 7; break;
			case Eight : tot += 8; break;
			case Nine : tot += 9; break;
			case Ten : tot += 10; break;
			case Jack : tot += 10; break;
			case Queen : tot += 10; break;
			case King : tot += 10; break;
			case Ace : aces += 1; break;


			}
			
		}
		for (int i=0 ; i < aces; i++) {
			if (tot > 10 ) {
				tot+=1;
			}
			else {
				tot+= 11;
			}
		}
		return tot;
	}
	public int size() {
		return this.cards.size();
	}
	public void returnCard (Deck move) {
		int deckSize = this.cards.size();
		
		for (int i = 0 ;i< deckSize; i++) {
			move.addCard(this.getCard(i));	
		}
		for (int i = 0 ;i< deckSize; i++) {
			this.removeCard(0);
		}
	}
}



