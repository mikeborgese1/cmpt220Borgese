
public class Card {
	
	
		//switch ( cardVal ) {
		public cardSuit  suit;
		public Value value;
		public Card( cardSuit suit, Value value) {
			this.value = value;
			this.suit = suit; 
		}
		
		public String toString() {
			return this.value.toString() + " of " + this.suit.toString();
		}
		
		public Value getValue() {
			return this.value;
		}
	}

