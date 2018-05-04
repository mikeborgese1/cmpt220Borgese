import java.util.Scanner;

public class game {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Welcome to Java BlackJack") ;
		Scanner keyboard = new Scanner(System.in);
		Deck gameDeck = new Deck();
		gameDeck.createFullDeck();
		gameDeck.shuffleDeck();
		int cntd = 1;
		Deck phand= new Deck();
		Deck dhand = new Deck();
		
		while(cntd>0){
		
			boolean end = false;
			System.out.println("The Dealer is Dealing!");
			phand.draw(gameDeck);
			phand.draw(gameDeck);
			
			dhand.draw(gameDeck);
			dhand.draw(gameDeck);
				
				while(true){		
					System.out.println("Your Hand contains " + phand.toString());
					System.out.println("Your hand has a value of " + phand.cardVal());
					System.out.println("The Dealer's hand contains " + dhand.getCard(0).toString() + " and [hidden]");
					System.out.println("Would you like to Hit (1) or Stand (0)");
					int hit = keyboard.nextInt();	
					if(hit == 1){
						phand.draw(gameDeck);
						System.out.println("You draw a " + phand.getCard(phand.size()-1).toString());
						
						if(phand.cardVal() > 21){
							System.out.println("You bust! Your hand is valued at  " + phand.cardVal());
							System.out.println("The Dealer wins!");
							end = true;
							break;
						}
					}
					
					if(hit == 0){
						break;
					}
					
				}
					
				System.out.println("The Dealer's hand contains" + dhand.toString());
				
				
				while((dhand.cardVal() < 17) && end == false){
					dhand.draw(gameDeck);
					System.out.println("Dealer draws a " + dhand.getCard(dhand.size()-1).toString());
				}
				System.out.println("The Dealer's hand is valued at " + dhand.cardVal());
				if((dhand.cardVal()>21)&& end == false){
					System.out.println("The Dealer Busts. You win!");
					end = true;
				}
				if((dhand.cardVal() == phand.cardVal()) && end == false){
					System.out.println("Push. Its a tie!");
					end = true;
				}
				if((dhand.cardVal() > phand.cardVal())&&end == false){
					System.out.println("Dealer beats you " + dhand.cardVal() + " to " + phand.cardVal());
					end = true;
				}
				if((phand.cardVal() > dhand.cardVal()) && end == false){
					System.out.println("You win the hand!");
					end = true;
				}
				else if(end == false) 	{
					System.out.println("The Dealer wins.");
				}
			
				phand.returnCard(gameDeck);
				dhand.returnCard(gameDeck);
				System.out.println("End of Hand.");
				System.out.println("Would you like to Play nother hand (1) or Quit? (0)");
				cntd = keyboard.nextInt();
				
		}
		System.out.println("Game over! Thanks for playing!");
	}
}

